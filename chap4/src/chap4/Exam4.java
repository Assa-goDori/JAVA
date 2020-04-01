package chap4;
import java.util.Scanner;
/*
 * 숫자를 입력 받아 양수인 경우는 양수, 음수는 음수, 0인 경우는 0으로 출력하기
 * [결과]
 * 숫자를 입력하세요
 * -10
 * 음수
 */
public class Exam4 {
	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		String result = (num>0)?("양수"):((num==0)?("0"):("음수"));
		System.out.println(result);
		//짝수인지 홀수인지?
		System.out.println("결과 : " + ((num%2==0)?"짝수":"홀수") + " 입니다.");		// 삼항연산자는 우선순위가 낮기 때문에 전체괄호를 해주어야 함.
	}

}
