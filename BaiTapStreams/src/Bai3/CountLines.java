package Bai3;

import java.io.*;

public class CountLines {
    public static void main(String[] args) {
        String filePath = "./src/Bai3/input.txt"; 
        int lineCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            while (reader.readLine() != null) { 
                lineCount++;
            }
            System.out.println("Số dòng trong file: " + lineCount);
        } catch (IOException e) {
            System.err.println("Lỗi đọc file: " + e.getMessage());
        }
    }
}
