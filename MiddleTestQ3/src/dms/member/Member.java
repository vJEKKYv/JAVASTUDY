package dms.member;
import dms.department.Department;
import dms.show.Showable;
public class Member implements Showable{
	int id;
	String name;
	Department dept;
	Member(int id, String name, Department dept){
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	@Override
	public void showData() {}
}

class Student extends Member{
	int year;
	String major;
	public Student(int id, String name, Department dept,String major, int year) {
		super(id, name, dept);
		this.major = major;
		this.year = year;
	}
	@Override
	public void showData() {
		System.out.println("("+id+", "+name+", "+dept.getTilte()+", "+major+", "+year+")");
	}
}
