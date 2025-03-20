package Bai1;

import java.io.*;
import java.util.concurrent.*;

public class MultiThreadedFileReader {
    private static final int CHUNK_SIZE = 1024 * 1024; 
    private static final String INPUT_FILE = "largefile.txt";  
    private static final String OUTPUT_FILE = "output.txt";

    public static void main(String[] args) {
        try {
            File file = new File(INPUT_FILE);
            long fileSize = file.length();
            int numChunks = (int) Math.ceil((double) fileSize / CHUNK_SIZE);

            ExecutorService executor = Executors.newFixedThreadPool(4);
            ConcurrentHashMap<Integer, byte[]> chunkMap = new ConcurrentHashMap<>();

            for (int i = 0; i < numChunks; i++) {
                int chunkIndex = i;
                executor.submit(() -> readChunk(chunkIndex, chunkMap));
            }

            executor.shutdown();
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);

            mergeChunks(chunkMap, numChunks);
            System.out.println("File reading and merging completed!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void readChunk(int chunkIndex, ConcurrentHashMap<Integer, byte[]> chunkMap) {
        try (RandomAccessFile raf = new RandomAccessFile(INPUT_FILE, "r")) {
            long position = (long) chunkIndex * CHUNK_SIZE;
            raf.seek(position);

            int bytesToRead = (int) Math.min(CHUNK_SIZE, raf.length() - position);
            byte[] buffer = new byte[bytesToRead];

            raf.readFully(buffer);
            chunkMap.put(chunkIndex, buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void mergeChunks(ConcurrentHashMap<Integer, byte[]> chunkMap, int numChunks) {
        try (FileOutputStream fos = new FileOutputStream(OUTPUT_FILE)) {
            for (int i = 0; i < numChunks; i++) {
                fos.write(chunkMap.get(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
