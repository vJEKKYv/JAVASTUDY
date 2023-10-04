package week_04;
import java.util.*;
public class BookManager {
	int index;
	Book bookList[];
	Scanner input;
	public BookManager(int max) {
		index = 0;
		bookList = new Book[max];
		input = new Scanner(System.in);
	}
	public void init() { // 기본 도서 목록
		bookList[index++] = new Book(index, "토끼와 거북이", "제리 핑크니", "열린책들");
		bookList[index++] = new Book(index, "별주부전", "이상배", "영림카디널");
		bookList[index++] = new Book(index, "금도끼 은도끼", "양혜원", "하루놀");
		bookList[index++] = new Book(index, "홍길동전", "허균", "웅진씽크빅");
	}
	public Book getBook(int id) { // 멤버에 도서 정보 넘겨주기
		if (id>index) {return null;}
		else {return bookList[id-1];}
	}
	public void addBook() { // 도서 추가
		int id = index+1;
		String title,  writer, publisher;
		System.out.println("id: "+id);
		System.out.print("도서명: ");
		title = input.next();
		while(titleCheck(title) != -1) { // 중복된 도서 있는지 체크
			System.out.println("중복된 도서명입니다. \n 다른 도서를 입력해주세요. ");
			System.out.print("도서명: ");
			title = input.next();
		}
		System.out.print("저자명: ");
		writer = input.next();
		System.out.print("출판사: ");
		publisher = input.next();
		bookList[index++] = new Book(id, title, writer, publisher);
	}
	public int titleCheck(String title) { // 중복 도서 체크 겸 도서 조회시 사용
		for (int i=0;i<index;i++) {
			if (bookList[i].getTitle().equals(title)) {return i+1;}
		}
		return -1;
	}
	public void showAllData() { // 모든 도서 출력
		System.out.println("----------------------------------------");
		System.out.println("id\t제목\t\t저자\t출판사");
		System.out.println("----------------------------------------");
		for(int i=0; i<index;i++) {
			bookList[i].showData();
		}
		System.out.println("----------------------------------------");
	}
	public void showOneData() { // 도서 조회
		int id;
		String title;
		System.out.print("도서명: ");
		title = input.nextLine();
		id = titleCheck(title);
		if(id == -1) { // 중복된 도서 있는지 체크
			System.out.println("해당 도서는 없는 도서입니다. ");
			return;
		}
		System.out.println("----------------------------------------");
		System.out.println("id\t제목\t\t저자\t출판사");
		System.out.println("----------------------------------------");
		bookList[id-1].showData();
		System.out.println("----------------------------------------");
	}
}
