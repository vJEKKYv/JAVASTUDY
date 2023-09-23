package up_down;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		random.setSeed(System.currentTimeMillis());
		int result, guess = -1;
		result = random.nextInt(100);
		int index = 0;
		while(result != guess) {
			index++;
			System.out.print("정답을 추측하여 보시오: ");
			guess = input.nextInt();
			if( result>guess) {
				System.out.println("제시한 정수가 낮습니다. ");
				
			}
			else if( result<guess) {
				System.out.println("제시한 정수가 높습니다. ");
			}
			else break;
		}
		System.out.println("축하합니다. 시도횟수 = "+index);
		return;
	}
}
