package Bai2;

import java.io.*;

public class Bai2 {
    public static void main(String[] args) {
        BufferedReader in = null;
        BufferedWriter out = null;

        try {
          
            in = new BufferedReader(new FileReader("./src/Bai2/input.txt"));
           
            out = new BufferedWriter(new FileWriter("./src/Bai2/output.txt"));

            int c;
            while ((c = in.read()) != -1) { 
                out.write(c);
            }

            System.out.println("End - Ghi file thành công!");

        } catch (IOException e) {
            System.err.println("Lỗi: " + e.getMessage());
        } finally {
            try {
                if (in != null) {
                    in.close(); 
                }
                if (out != null) {
                    out.close(); 
                }
            } catch (IOException e) {
                System.err.println("Lỗi khi đóng file: " + e.getMessage());
            }
        }
    }
}
