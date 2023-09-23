package NumBase;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		questList quest = new questList(4);
		String[] checkList = new String[4];
		int[] myList = new int[4];
		quest.makeQuest();
		int strike=-1, ball=-1;
		while(strike < 4) {
			strike=0; ball=0;
			System.out.print("값을 한칸씩 띄워서 입력: ");
			String guess = input.nextLine();
			checkList = guess.split(" ");
			for (int i = 0 ; i<4 ; i++) {
				myList[i] = Integer.parseInt(checkList[i]);
				}
			strike = quest.matching(myList, strike, ball);
		}
		System.out.println("정답입니다!! ");
		input.close();
		return;
	}

}
