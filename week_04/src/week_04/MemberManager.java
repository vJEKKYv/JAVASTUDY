package week_04;
import java.util.*;
public class MemberManager {
	int index;
	Member memberList[];
	Scanner input;
	public MemberManager(int max) {
		index = 0;
		memberList = new Member[max];
		input = new Scanner(System.in);
	}
	public void init(BookManager BM) { // 기본 멤버 목록
		memberList[index++] = new Member(index, "김제원", BM.getBook(1));
		memberList[index++] = new Member(index, "김경민", BM.getBook(2));
		memberList[index++] = new Member(index, "김고넬료",null);
		memberList[index++] = new Member(index, "김잉예은", null);
		memberList[index++] = new Member(index, "신윤정", BM.getBook(3));
		memberList[index++] = new Member(index, "조윤수", BM.getBook(4));
		memberList[index++] = new Member(index, "최건", null);
	}
	public void addMember() { // 멤버 추가
		int id = index+1;
		String nickName;
		System.out.println("id: "+id);
		System.out.print("닉네임: ");
		nickName = input.next();
		while(nickNameCheck(nickName)!= -1) {
			System.out.println("중복된 이름입니다. ");
			System.out.print("다른 닉네임 입력: ");
			nickName = input.next();
		}
		memberList[index++] = new Member(id, nickName, null);
	}
	public int nickNameCheck(String nickName) { //닉네임 중복 체크 및 조회시 사용
		for (int i=0;i<index;i++) {
			if (memberList[i].nickName == nickName) {return i+1;}
		}
		return -1;
	}
	public void bookRental(BookManager BM) { //도서대여
		int id, bookId;
		String nickName, title;
		showAllData();
		System.out.print("닉네임: ");
		nickName = input.next();
		id = nickNameCheck(nickName);
		if(id == -1) { // 중복된 도서 있는지 체크
			System.out.println("해당 닉네임은 없는 멤버입니다. ");
			return;
		}
		BM.showAllData();
		System.out.print("도서명: ");
		title = input.next();
		bookId = BM.titleCheck(title);
		while(bookId==-1) { // 입력한 도서명 체크
			System.out.println("없는 도서명입니다. \n 다른 도서를 입력해주세요. ");
			System.out.print("도서명: ");
			title = input.next();
			bookId = BM.titleCheck(title);
		}
		memberList[id-1].book =  BM.getBook(bookId);
		System.out.println("대출되었습니다. ");
	}
	public void bookReturn() {
		int id;
		String nickName;
		showAllData();
		System.out.print("닉네임: ");
		nickName = input.next();
		id = nickNameCheck(nickName);
		if(id == -1) { // 중복된 도서 있는지 체크
			System.out.println("해당 닉네임은 없는 멤버입니다. ");
			return;
		}
		memberList[id-1].book = null;
		System.out.println("반납되었습니다. ");
	}
	public void showAllData() {
		System.out.println("------------------------------------");
		System.out.println("id\t닉네임\t\t대여목록");
		System.out.println("------------------------------------");
		for(int i=0; i<index;i++) {
			memberList[i].showData();
		}
		System.out.println("------------------------------------");
	}
	public void showOneData() { // 도서 조회
		int id;
		String nickName;
		System.out.print("닉네임: ");
		nickName = input.next();
		id = nickNameCheck(nickName);
		while(id == -1) { // 중복된 도서 있는지 체크
			System.out.println("해당 닉네임은 없는 멤버입니다. ");
			return;
		}
		System.out.println("------------------------------------");
		System.out.println("id\\t닉네임\\t\\t대여목록");
		System.out.println("------------------------------------");
		memberList[id-1].showData();
		System.out.println("------------------------------------");
	}
	
}
