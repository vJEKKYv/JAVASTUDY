package week_04;
import java.util.*;
public class MenuCtrl {
	Scanner input;
	MenuCtrl(){input = new Scanner(System.in);}
	public int mainMenu() {
		int index;
		System.out.println("------< 메 뉴 >------");
		System.out.println("1. 도서 목록");
		System.out.println("2. 도서 추가");
		System.out.println("3. 도서 조회");
		System.out.println("4. 도서 대여");
		System.out.println("5. 도서 반납");
		System.out.println("6. 이용자 목록");
		System.out.println("7. 이용자 추가");
		System.out.println("8. 이용자 조회");
		System.out.println("0. 종료");
		System.out.println("--------------------");
		System.out.print("메뉴 선택: ");
		index = input.nextInt();
		return index;
	}
}
