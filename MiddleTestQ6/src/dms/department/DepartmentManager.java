package dms.department;
import java.util.*;

public class DepartmentManager {
	int index;
	Department dList[];
	Scanner input;
	public DepartmentManager() {
		index = 0;
		dList = new Department[50];
		input = new Scanner(System.in);
	}
	public void init() {
		dList[index++] = new Department(index, "컴퓨터공학부");
		dList[index++] = new Department(index, "게임공학과");
		dList[index++] = new Department(index, "전자공학부");
	}
	public void addDept() {
		int id = index+1;
		String title;
		while(true) {
			try {
				System.out.println("- ID: "+id);
				System.out.print("- 이름: ");
				title = input.next();
				break;
			}catch(InputMismatchException e) {
				input.nextLine();
				System.out.println("잘못된 입력입니다. 처음부터 다시 입력해주세요. ");
				System.out.println("--------------------------------");
			}
		}
		dList[index++] = new Department(id, title);
		System.out.println(">>"+title+": 학과(부)를 추가하였습니다. ");
	}
	public void showAll() {
	System.out.println("----------------");
	System.out.println("(ID, 소속학과(부))");
	System.out.println("----------------");
	for(int i=0; i<index;i++) {
		dList[i].showData();
	}
	System.out.println("----------------");
	}
	public Department getDept(int id) { return dList[id-1]; }
	public Department findDept() {
		int id=-1;
		while(true) {
			try {
				while(true) {
					showAll();
					System.out.print(" - 학과(부) ID: ");
					id = input.nextInt();
					if(id<0||id>index) {
						System.out.println("-----------------------------------");
						System.out.println("잘못된 숫자를 입력하였습니다. 다른 수를 입력해주세요. ");
					}else break;
				}
				break;
			}catch(InputMismatchException e){
				input.nextLine();
				System.out.println("---------------------------");
				System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.  ");
			}
		}
		return dList[id-1];
	}
	
}
