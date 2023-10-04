package week_04;

public class Book {
	int id;
	String title,  writer, publisher;
	public Book(int id, String title, String writer, String publisher) {
		this.id = id;
		this.title = title;
		this.writer = writer;
		this.publisher = publisher;
	}
	public String getTitle() {return title;}
	public void showData() {
		if(title.length()>4) {
			System.out.println(id+"\t"+title+"\t"+writer+"\t"+publisher);
		}
		else {
			System.out.println(id+"\t"+title+"\t\t"+writer+"\t"+publisher);
		}
	}
}
