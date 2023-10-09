package week_05;
import java.util.*;
public class MenuCtrl {
	Scanner input;
	MenuCtrl(){ input = new Scanner(System.in); }
	public int mainMenu() {
		int index;
		System.out.println("------< 메 뉴 >------");
		System.out.println("1. 제품 구매");
		System.out.println("2. 제품 추가");
		System.out.println("3. 제품 변경");
		System.out.println("4. 제품 목록");
		System.out.println("5. 품절 목록");
		System.out.println("6. 제품 검색");
		System.out.println("0. 시스템 종료");
		System.out.println("--------------------");
		System.out.print("메뉴 선택: ");
		index = input.nextInt();
		return index;
	}
}
