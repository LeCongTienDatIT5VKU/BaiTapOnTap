package Bai4;

import java.io.*;

public class WriteReadIntegers {
    public static void main(String[] args) {
        String filePath = "./src/Bai4/input.txt";

        try (DataOutputStream out = new DataOutputStream(new FileOutputStream(filePath))) {
            int[] numbers = {10, 20, 30, 40, 50};
            for (int num : numbers) {
                out.writeInt(num);
            }
            System.out.println("Ghi số nguyên vào file thành công.");
        } catch (IOException e) {
            System.err.println("Lỗi ghi file: " + e.getMessage());
        }
        try (DataInputStream in = new DataInputStream(new FileInputStream(filePath))) {
            System.out.println("Các số nguyên trong file:");
            while (in.available() > 0) {
                System.out.print(in.readInt() + " "); 
            }
        } catch (IOException e) {
            System.err.println("Lỗi đọc file: " + e.getMessage());
        }
    }
}
