package week_02;
import java.util.*;
public class UICTRL { 
	Scanner input;
	public UICTRL() { input = new Scanner(System.in); }
	
	public int UIMenu() {
		int index;
		System.out.println("-------< 메 뉴 >--------");
		System.out.println(" 1. 학생 추가");
		System.out.println(" 2. 학생 목록 출력");
		System.out.println(" 3. 연구소 추가");
		System.out.println(" 4. 연구소 목록 출력");
		System.out.println(" 0. 종료");
		System.out.println("----------------------");
		System.out.print("  >>선택: ");
		index = input.nextInt();
		return index;
	}
}
