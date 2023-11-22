package dms.main;

import java.util.*;

public class MainMenu {
	Scanner input;
	public MainMenu() {input = new Scanner(System.in);}
	public int issueMenu() {
		int sel;
		System.out.println("-------- 메 뉴 --------");
		System.out.println("1. 학생 추가");
		System.out.println("2. 학생 목록 출력");
		System.out.println();
		System.out.println("3. 교수 추가");
		System.out.println("4. 교수 목록 출력");
		System.out.println();
		System.out.println("5. 구성원 조회");
		System.out.println("6. 전체 구성원 목록 출력");
		System.out.println();
		System.out.println("7. 학부(과) 추가");
		System.out.println("8. 모든 학부(과) 목록 출력");
		System.out.println();
		System.out.println("9. 학부(과)별 구성원 목록 출력");
		System.out.println();
		System.out.println("0. 종료");
		System.out.println("---------------------");
		while(true) {
			try {
				System.out.print("메뉴 번호? >>");
				sel = input.nextInt();
				break;
			}catch(InputMismatchException e) {
				input.nextLine();
				System.out.println("잘못된 입력. 숫자를 입력해주세요. ");
				System.out.println("-------------------------");
			}
		}
		return sel;
	}
}
