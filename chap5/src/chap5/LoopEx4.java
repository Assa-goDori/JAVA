package chap5;
import java.util.Scanner;
/*
 * 숫자 맞추기
 * 컴퓨터가 1부터 100사이의 임의의 값을 저장하고, 사용자는 반복적으로 숫자를 입력하여 컴퓨터가 저장한 숫자를 맞추기
 * 숫자를 맞춘 경우 프로그램 종료
*/
public class LoopEx4 {
	public static void main(String[] args) {
		/*
		 * Math.random() : 난수, 임의의 실수 리턴.
		 * 		0 <= Math.random() < 1.0
		 * 		0 <= Math.random()*100 < 100.0		(0~99)
		 * 		1 <= (int)Math.random()*100+1 < 101	(0~100)
		 */
		int ans = (int)(Math.random()*100) + 1;	//컴퓨터가 저장한 임의의 수
		Scanner scan = new Scanner(System.in);
		int input;
		int k = 0;
		do {
			System.out.println("1~100 사이의 숫자를 입력하세요");
			input = scan.nextInt();
			k++;
			if(ans > input) {
				System.out.println("큰 수 입니다.");
			} else if (ans < input) {
				System.out.println("작은 수 입니다.");
			} else {
				System.out.println("정답입니다.");
			}
		}while(input != ans);
		System.out.println(k + "번재 입력입니다.");
	}

}
