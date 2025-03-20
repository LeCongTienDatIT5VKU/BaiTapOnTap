package Bai2;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;

public class MultiThreadedKeywordSearch {
    private static final String KEYWORD = "example";
    private static final String[] FILES = { "file1.txt", "file2.txt", "file3.txt" }; 

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        Map<String, Future<Integer>> results = new HashMap<>();

        for (String file : FILES) {
            Future<Integer> future = executor.submit(() -> countKeywordInFile(file, KEYWORD));
            results.put(file, future);
        }

        executor.shutdown();

        try {
            for (Map.Entry<String, Future<Integer>> entry : results.entrySet()) {
                System.out.println("File: " + entry.getKey() + " - Keyword occurrences: " + entry.getValue().get());
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }

    private static int countKeywordInFile(String fileName, String keyword) {
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                count += countOccurrences(line, keyword);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }

    private static int countOccurrences(String line, String keyword) {
        int count = 0, index = 0;
        while ((index = line.indexOf(keyword, index)) != -1) {
            count++;
            index += keyword.length();
        }
        return count;
    }
}

