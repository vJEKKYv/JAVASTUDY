package week_02;

public class Lab {
	int id;
	String title;
	public Lab(int id, String title) {
		this.id = id;
		this.title = title;
	}
	public int getLabId() {return id;}
	public String getLabTitle() {return title;}
	public void ShowData() {
		System.out.println(id+"\t"+title);
	}
}
