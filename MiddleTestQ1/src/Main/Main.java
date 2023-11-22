package Main;

class Student{
	int id, year;
	String name, dept, major;
	Student(int id, String name, String dept, String major, int year){
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.major = major;
		this.year = year;
	}
	void showData() {
		System.out.println("("+id+", "+name+", "+dept+", "+major+", "+year+")");
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student(1, "홍학생", "컴퓨터공학부", "소프트웨어전공", 1);
		System.out.println("--------------------------------");
		System.out.println("(ID, 이름, 소속학과(부), 전공, 학년):");
		System.out.println("--------------------------------");
		s.showData();
		System.out.println("--------------------------------");
	}

}
