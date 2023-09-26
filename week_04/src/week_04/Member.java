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
			System.out.println(id+"\t"+nickName+"\t"+"대여중인 도서 없음");
		}
		else {
			System.out.println(id+"\t"+nickName+"\t"+book.title+" 대여 중");
		}
	}
}
