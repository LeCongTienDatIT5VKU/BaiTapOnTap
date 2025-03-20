package Bai4;

import java.io.*;
import java.nio.file.*;
import java.util.regex.*;

public class FileMerger {
    private static final String[] INPUT_FILES = { "file1.txt", "file2.txt", "file3.txt", "file4.txt", "file5.txt" };
    private static final String OUTPUT_FILE = "merged_output.txt";

    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(OUTPUT_FILE))) {
            for (String inputFile : INPUT_FILES) {
                String content = readFile(inputFile);
                content = removeHtmlTags(content); 
                writer.write(content);
                writer.newLine();
            }
            System.out.println("Merging completed! Output saved to: " + OUTPUT_FILE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String readFile(String fileName) {
        try {
            return new String(Files.readAllBytes(Paths.get(fileName)));
        } catch (IOException e) {
            System.err.println("Error reading file: " + fileName);
            return "";
        }
    }

    private static String removeHtmlTags(String input) {
        return input.replaceAll("<[^>]*>", ""); 
    }
}

