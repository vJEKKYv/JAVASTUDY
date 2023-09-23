package NumBase;
import java.util.*;

public class questList {
	private
	int[] valueList;
	int index;
	Scanner input;
	public questList(int i) {
		index = 0;
		valueList = new int[i];
		input = new Scanner(System.in);
		}
	public void makeQuest() {
		for (int i=0; i<4 ; i++) {
			index = (int)(Math.random()*10);
			valueList[i] = index;
		}
		for (int i=0; i<4 ; i++) {
			for (int j=3; j>i ; j--) {
				while(valueList[i] == valueList[j]) {
					valueList[i] = (int)(Math.random()*10);
				}
			}
		}
	}
	public int matching(int[] checkList, int strike, int ball) {
		for (int i=0; i<4 ; i++) {
			for (int j=0; j<4; j++) {
				if(checkList[i] == valueList[j]) {
					if (i==j) { strike++; }
					else { ball++; }
					break;
				}
			}
		}
		System.out.println("Strike: "+strike+" / " + "ball: "+ ball);
		
		return strike;
	}	
}
