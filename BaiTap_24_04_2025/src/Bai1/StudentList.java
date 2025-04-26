package Bai1;

import java.util.ArrayList;
import java.util.Scanner;
public class StudentList {
	private ArrayList<Student> students = new ArrayList<>();
	
	public void addStudent(Student s) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap ten");
		s.setName(sc.nextLine());
		System.out.println("Nhap diem");
		s.setScore(Integer.parseInt(sc.nextLine()));
		
		students.add(s);
		
	}
	public void printListStudent() {
		for (Student student:students) {
			System.out.println(student.toString());
		}
	}
	public String findMaxScoreOfStudent() {
		
		Student s = new Student();
		int max = 0;
		
		for(Student student : students) {
			if(student.getScore() > max) {
				max = student.getScore();
				s = student;
			}
		}
		return s.toString();
	}
}
