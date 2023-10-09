package week_05;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectManager OBM = new ObjectManager(50);	OBM.init();
		MenuCtrl MC = new MenuCtrl();
		while(true) {
			switch(MC.mainMenu()) {
			case 1:
				System.out.println("제품 구매 실행");
				OBM.buyObject();
				break;
			case 2:
				System.out.println("제품 추가 실행");
				OBM.addObject();
				break;
			case 3:
				System.out.println("제품 변경 실행");
				OBM.changeObject();
				break;
			case 4:
				System.out.println("제품 목록 출력");
				OBM.showAll();
				break;
			case 5:
				System.out.println("품절 목록 출력");
				OBM.showSoldOut();
				break;
			case 6:
				System.out.println("제품 검색");
				OBM.showOne();
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
