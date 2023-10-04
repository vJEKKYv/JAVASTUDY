package week_04;

public class Member {
	int id;
	String nickName;
	Book book;
	public Member(int id, String nickName, Book book) {
		this.id = id;
		this.nickName = nickName;
		this.book = book;
	}
	public void showData() {
		if (book == null) {
			System.out.println(id+"\t"+nickName+"\t"+" X");
		}
		else {
			System.out.println(id+"\t"+nickName+"\t"+book.title);
		}
	}
}
