package Bai1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		StudentList studentList = new StudentList();
		Scanner sc = new Scanner(System.in);

		int choose;

		do {
			System.out.println("=============================================");
			System.out.println("|1.Thêm sinh viên							");
			System.out.println("|2.In danh sách sinh viên					");
			System.out.println("|3.Tìm sinh viên có điểm cao nhất			");
			System.out.println("=============================================");
			System.out.println("Nhập sự lựa chọn");
			choose = sc.nextInt();

			switch (choose) {
			case 1:
				Student student = new Student();
				studentList.addStudent(student);
				break;

			case 2:
				studentList.printListStudent();
				break;

			case 3:
				System.out.println(studentList.findMaxScoreOfStudent());
				break;
			case 4:
				return;
			default:
				System.out.println("lựa chọn không phù hợp");
			}
		} while (true);
	}
}
