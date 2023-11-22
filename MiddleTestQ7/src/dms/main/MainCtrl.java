package dms.main;

import dms.department.DepartmentManager;
import dms.member.MemberManager;
import java.util.*;


public class MainCtrl {
	class MainMenu {
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
					System.out.println("----------------------");
				}
			}
			return sel;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DepartmentManager DM = new DepartmentManager(); DM.init();
		MemberManager MM = new MemberManager(); MM.init(DM);
		MainCtrl MMenu = new MainCtrl();
		MainCtrl.MainMenu MenuList =MMenu.new MainMenu();
		while(true) {
			switch(MenuList.issueMenu()) {
			case 1:
				System.out.println("<1. 학생 추가>");
				MM.addSudent(DM);
				break;
			case 2:
				System.out.println("<2. 학생 목록 출력>");
				MM.showStudent();
				break;
			case 3:
				System.out.println("<3. 교수 추가>");
				MM.addProfessor(DM);
				break;
			case 4:
				System.out.println("<4. 교수 목록 출력>");
				MM.showProfessor();
				break;
			case 5:
				System.out.println("<5. 구성원 조회>");
				MM.findMember();
				break;
			case 6:
				System.out.println("<6. 전체 구성원 목록 출력.");
				MM.showAll();
				break;
			case 7:
				System.out.println("<7. 학부(과) 추가>");
				DM.addDept();
				break;
			case 8:
				System.out.println("<8. 모든 학부(과) 목록 출력>");
				DM.showAll();
				break;
			case 9:
				System.out.println("<9. 학부(과)별 구성원 목록 출력>");
				MM.showByDept(DM);
				break;
			case 0:
				System.out.println("<프로그램 종료...>");
				return;
			default:
				System.out.println("잘못된 숫자를 입력하였습니다....");
				break;
			}
		}
	}

}