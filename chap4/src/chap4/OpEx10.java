package chap4;
import java.util.Scanner;
/*
 * 조건 연산자(삼항 연산자)
 * 	(조건식) ? 참 : 거짓
 * 
 * 조건 연산자 : 다음에 조건문으로 변경이 가능하다.
 */
public class OpEx10 {
	public static void main(String[] args) {
		System.out.println("점수를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		//조건문
			String result;
			if(score>=60) {
				result = "합격";
			} else {
				result = "불합격";
			}
		//String result = (score>=60)?"합격":"불합격";
		System.out.println(score + "점은 " + result + "입니다.");
		
		//60점대인 경우는 재시험대상입니다.
		result = (score>=70)?"합격":(score>=60)?"재시험대상":"불합격";
		System.out.println(score + "점은 " + result + "입니다.");
		
	}

}
