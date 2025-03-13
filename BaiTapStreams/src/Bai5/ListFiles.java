package Bai5;

import java.io.File;

public class ListFiles {
    public static void main(String[] args) {
        String directoryPath = "./"; 
        File folder = new File(directoryPath);

        if (folder.exists() && folder.isDirectory()) {
            File[] files = folder.listFiles();
            if (files != null) {
                System.out.println("Danh sách file trong thư mục:");
                for (File file : files) {
                    System.out.println(file.getName());
                }
            } else {
                System.out.println("Thư mục trống.");
            }
        } else {
            System.out.println("Thư mục không tồn tại.");
        }
    }
}

