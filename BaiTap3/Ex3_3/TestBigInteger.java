package BaiTap3.Ex3_3;

import java.math.BigInteger;

public class TestBigInteger {
    public static void main(String[] args) {
        // Khai báo hai số nguyên lớn bằng BigInteger
        BigInteger num1 = new BigInteger("11111111111111111111111111111111111111111111111111111111111111");
        BigInteger num2 = new BigInteger("22222222222222222222222222222222222222222222222222");

        // Cộng hai số và in kết quả
        BigInteger sum = num1.add(num2);
        System.out.println("Sum: " + sum);

        // Nhân hai số và in kết quả
        BigInteger product = num1.multiply(num2);
        System.out.println("Product: " + product);
    }
}

