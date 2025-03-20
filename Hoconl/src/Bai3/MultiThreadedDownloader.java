package Bai3;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.*;

public class MultiThreadedDownloader {
    private static final String[] URLS = {
        "https://jsonplaceholder.typicode.com/posts/1",
        "https://jsonplaceholder.typicode.com/posts/2",
        "https://jsonplaceholder.typicode.com/posts/3",
        "https://jsonplaceholder.typicode.com/posts/4",
        "https://jsonplaceholder.typicode.com/posts/5"
    };

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        
        for (int i = 0; i < URLS.length; i++) {
            final int index = i;
            executor.submit(() -> downloadAndSave(URLS[index], "file" + (index + 1) + ".txt"));
        }

        executor.shutdown();
    }

    private static void downloadAndSave(String urlString, String fileName) {
        try {
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            try (BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                 BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
                
                String line;
                while ((line = reader.readLine()) != null) {
                    writer.write(line);
                    writer.newLine();
                }
                System.out.println("Downloaded: " + urlString + " -> " + fileName);
            }
        } catch (IOException e) {
            System.err.println("Failed to download: " + urlString);
            e.printStackTrace();
        }
    }
}

