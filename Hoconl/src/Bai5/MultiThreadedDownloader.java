package Bai5;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.*;
import java.util.concurrent.*;

public class MultiThreadedDownloader {
    private static final String[] URLS = {
        "https://example.com/article1",
        "https://example.com/article2",
        "https://example.com/article3",
        "https://example.com/article4",
        "https://example.com/article5"
    };

    private static final String OUTPUT_FILE = "merged_output.txt";

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 0; i < URLS.length; i++) {
            final int index = i;
            executor.submit(() -> downloadFile(URLS[index], "file" + (index + 1) + ".txt"));
        }
        executor.shutdown();
        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
            mergeFiles();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void downloadFile(String urlString, String fileName) {
        try {
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            reader.close();
            writer.close();
            System.out.println("Downloaded: " + urlString + " -> " + fileName);
        } catch (IOException e) {
            System.err.println("Failed to download: " + urlString);
            e.printStackTrace();
        }
    }

    private static void mergeFiles() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(OUTPUT_FILE))) {
            for (int i = 1; i <= 5; i++) {
                String fileName = "file" + i + ".txt";
                String content = Files.readString(Paths.get(fileName));
                writer.write(content);
                writer.newLine();
            }
            System.out.println("Merging completed! Output saved to: " + OUTPUT_FILE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
