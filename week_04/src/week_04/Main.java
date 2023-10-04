package week_04;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookManager BM = new BookManager(50);		BM.init();
		MemberManager MM = new MemberManager(50);	MM.init(BM);
		MenuCtrl MC = new MenuCtrl();
		while(true) {
			switch(MC.mainMenu()) {
			case 1:
				System.out.println("도서 목록 출력");
				BM.showAllData();
				break;
			case 2:
				System.out.println("도서 추가");
				BM.addBook();
				break;
			case 3:
				System.out.println("도서 조회");
				BM.showOneData();
				break;
			case 4:
				System.out.println("도서 대여");
				MM.bookRental(BM);
				break;
			case 5:
				System.out.println("도서 반납");
				MM.bookReturn();
				break;
			case 6:
				System.out.println("이용자 목록 출력");
				MM.showAllData();
				break;
			case 7:
				System.out.println("이용자 추가");
				MM.addMember();
				break;
			case 8:
				System.out.println("이용자 조회");
				MM.showOneData();
				break;
			case 0:
				System.out.println("시스템 종료");
				return;
			default:
				System.out.println("다른 수를 입력해주세요. ");
				break;
			}
		}
	}

}
