package Main;

public class MainCtrl {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainMenu MM = new MainMenu();
		while(true) {
			switch(MM.issueMenu()) {
			case 1:
				System.out.println("<1. 학생 추가>");
				break;
			case 2:
				System.out.println("<2. 학생 목록 출력>");
				break;
			case 3:
				System.out.println("<3. 교수 추가>");
				break;
			case 4:
				System.out.println("<4. 교수 목록 출력>");
				break;
			case 5:
				System.out.println("<5. 구성원 조회>");
				break;
			case 6:
				System.out.println("<6. 전체 구성원 목록 출력.");
				break;
			case 7:
				System.out.println("<7. 학부(과) 추가>");
				break;
			case 8:
				System.out.println("<8. 모든 학부(과) 목록 출력>");
				break;
			case 9:
				System.out.println("<9. 학부(과)별 구성원 목록 출력>");
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