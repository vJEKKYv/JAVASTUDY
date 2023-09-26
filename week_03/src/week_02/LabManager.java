package week_02;
import java.util.*;

public class LabManager {
	int index;
	Lab labList[];
	Scanner input;
	public LabManager(int max) {
		labList = new Lab[max];
		index = 0;
		input = new Scanner(System.in);
	}
	public Lab getLab(int id) {
		if (id<0 || id>index) {
			return null;
		}
		else return labList[id-1];
		}
	public String getLabName(int id) {return labList[id-1].getLabTitle();}
	public void defaultLab() {
		labList[index++] = new Lab(index, "웹연구소");
		labList[index++] = new Lab(index, "객체지향연구소");
		labList[index++] = new Lab(index, "Cpp연구소");
		labList[index++] = new Lab(index, "Java연구소");
	}
	public int labNameCheck(String labName) {
		for(int i = 0; i<index; i++) {
			if(labName == labList[i].getLabTitle()) {
				return 1;
			}
		}
		return 0;
	}
	public void addLab() {
		int id = index+1;
		String title;
		System.out.println("id: "+id);
		System.out.print("연구실 이름: ");
		title = input.next();
		while(labNameCheck(title) == 1) {
			System.out.println("연구실 이름이 중복됨. ");
			System.out.print("연구실 이름: ");
			title = input.next();
		}
		labList[index++] = new Lab(id, title);
		System.out.println("연구소를 생성하였습니다. ");
	}
	public void ShowData() {
		System.out.println("------------------------");
		System.out.println("ID	Lab이름");
		System.out.println("------------------------");
		for(int i = 0; i<index;i++) {
			labList[i].ShowData();
			
		}
		System.out.println("------------------------");
	}
}

