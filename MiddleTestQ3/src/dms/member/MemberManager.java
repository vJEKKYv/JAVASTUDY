package dms.member;
import dms.department.*;

import java.util.*;
public class MemberManager {
	int index;
	Member mList[];
	Scanner input;
	public MemberManager() {
		index = 0;
		mList = new Member[50];
		input = new Scanner(System.in);
	}
	public void init(DepartmentManager DM) {
		mList[index++] = new Student(index, "홍학생", DM.getDept(1), "소프트웨어", 2);
		mList[index++] = new Student(index, "김학생", DM.getDept(1), "컴퓨터공학", 3);
		mList[index++] = new Student(index, "박학생", DM.getDept(2), "게임공학", 4);
	}
	public void addSudent(DepartmentManager DM) {
		int id = index+1, year;
		String name, major;
		Department dept;
		while(true) {
			try {
				System.out.println("- ID: "+id);
				System.out.print("- 이름: ");
				name = input.next();
				dept = DM.findDept();
				System.out.print("- 전공: ");
				major = input.next();
				System.out.print("- 학년: ");
				year = input.nextInt();
				break;
			}catch(InputMismatchException e) {
				input.nextLine();
				System.out.println("잘못된 입력입니다. 처음부터 다시 입력해주세요. ");
				System.out.println("--------------------------------");
			}	
		}
		mList[index++] = new Student(id, name, dept, major, year);
		System.out.println("=>"+name+": 학생을 추가하였습니다. ");
	}
	public void showStudent() {
		System.out.println("--------------------------------");
		System.out.println("(ID, 이름, 소속학과(부), 전공, 학년):");
		System.out.println("--------------------------------");
		for(int i=0;i<index;i++) {
			if (mList[i] instanceof Student) mList[i].showData();
		}
		System.out.println("--------------------------------");
	}
}
