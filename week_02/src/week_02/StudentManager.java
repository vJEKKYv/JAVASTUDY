package week_02;
import java.util.*;
public class StudentManager {
	int index;
	Student studentList[];
	Scanner input;
	public StudentManager(int max) {
		studentList = new Student[max];
		index = 0;
		input = new Scanner(System.in);
	}
	public void defaultStudent(LabManager LM) {
		studentList[index++] = new Student(index, "김철수", "컴퓨터공학", 1, LM.getLab(3));
		studentList[index++] = new Student(index, "홍길동", "소프트웨어", 2, LM.getLab(1));
		studentList[index++] = new Student(index, "김동수", "컴퓨터공학", 3, LM.getLab(4));
		studentList[index++] = new Student(index, "이철희", "소프트웨어", 4, LM.getLab(1));
	}
	public void addStudent(LabManager LM) {
		int id=index+1, grade, labId;
		String name, major;
		Lab lab;
		System.out.println("id: "+id);
		System.out.print("이름: ");
		name = input.next();
		System.out.print("전공: ");
		major = input.next();
		System.out.print("학년: ");
		grade = input.nextInt();
		LM.ShowData();
		System.out.print("연구소 ID: ");
		labId = input.nextInt();
		while(LM.getLab(labId) == null) {
			System.out.println("없는 연구소입니다. ");
			System.out.print("연구소 ID: ");
			labId = input.nextInt();
		}
		lab = LM.getLab(labId);
		studentList[index++] = new Student(id, name, major, grade, lab);
		System.out.println("학생 객체를 생성하였습니다. ");
	}
	public void ShowStudent() {
		System.out.println("----------------------------------------------------------------");
		System.out.println("ID      이름      전공     학년   연구소ID   연구소명");
		System.out.println("----------------------------------------------------------------");
		for(int i = 0; i<index;i++) {
			studentList[i].ShowData();
		}
	}
}


