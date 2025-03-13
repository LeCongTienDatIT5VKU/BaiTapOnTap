package Bai1;

import java.io.*;
public class IOStream {
	public static void main(String[] args) throws IOException {
		FileReader in = null;
		FileWriter out = null;
		
		
		try {
			in = new FileReader("./src/Bai1/input.txt");
			out = new FileWriter("./src/Bai1/output.txt");
			
			int c;
			while((c= in.read()) != -1) {
				out.write(c);
			}
		}finally {
			if (in != null) {
				in.close();
			}if (out != null) {
				out.close();
			}
		}
		System.out.println("End");
	}
}
