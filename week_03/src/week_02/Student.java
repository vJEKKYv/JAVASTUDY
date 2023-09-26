package week_02;

import java.util.*;

public class Student {
	int id, grade;
	String name, major;
	Lab lab;
	Scanner input;
	public Student(int id, String name, String major, int grade, Lab lab) {
		this.id = id;
		this.name = name;
		this.major = major;
		this.grade = grade;
		this.lab = lab;
		input = new Scanner(System.in);
	}
	public void ShowData() {
		System.out.println(" " + id + "\t" + name + "\t" + major + "\t   " + grade + "\t" + lab.getLabId() + "\t" + lab.getLabTitle() );
	}

}
