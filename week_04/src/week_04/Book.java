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
	public void showData() {
		System.out.println(id+"\t"+title+"\t"+writer+"\t"+publisher);
	}
}
