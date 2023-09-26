package week_02;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LabManager LM = new LabManager(50);
		StudentManager SM = new StudentManager(50);
		UICTRL UI = new UICTRL();
		LM.defaultLab();
		SM.defaultStudent(LM);
		while(true) {
			switch(UI.UIMenu()) {
			case 1:
				SM.addStudent(LM);
				break;
			case 2:
				SM.ShowStudent();
				break;
			case 3:
				LM.addLab();
				break;
			case 4:
				LM.ShowData();
				break;
			case 0:
				System.out.println("시스템을 종료합니다. ");
				return;
			default:
				System.out.println("해당 메뉴는 없는 메뉴입니다. ");
			}
		}
	}

}