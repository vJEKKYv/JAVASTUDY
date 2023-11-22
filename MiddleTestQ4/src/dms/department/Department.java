package dms.department;
import dms.show.Showable;

public class Department implements Showable{
	int id;
	String title;
	public Department(int id, String title) {
		this.id = id;
		this.title =title;
	}
	public void showData() {
		System.out.println("("+id+", "+title+")");
	}
	public String getTilte() { return title; }
}
