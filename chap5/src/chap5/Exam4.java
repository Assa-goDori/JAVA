package chap5;
import java.util.Scanner;
/*
* switch 구문을 이용하여 점수를 입력받아 60점 이상인 경우 합격, 그 외는 불합격
*/
public class Exam4 {

	public static void main(String[] args) {
		System.out.println("점수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		
		switch(score/10) {
		case 10:
		case 9:
		case 8:
		case 7:
		case 6 : System.out.println("합격"); break;
		default : System.out.println("불합격"); break;
		
		}

	}

}
