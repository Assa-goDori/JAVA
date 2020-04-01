package chap5;
import java.util.Scanner;
/*
 * if 조건문 예제
 * 
 * if(조건식1) {
 *     문장 1 <= 조건식1의 결과가 참인 경우 실행 되는 구문
 * } else {
 *     문장 2 <= 조건식1의 결과가 거짓인 경우 실행 되는 구문
 * }
 * 
 * 
 * if(조건식1) {
 *		문장 1 <= 조건식1의 결과가 참인 경우 실행 되는 구문
 * } else if(조건식2) {
 * 		문장 2 <= 조건식1의 결과는 거짓이고, 조건식2의 결과가 참인 경우 실행 되는 구문
 * } else if(조건식3) {
 * 		문장 3 <= 조건식1과 조건식2의 결과가 거짓이고, 조건식3의 결과가 참인 경우 실행 되는 구문
 * } else {
 * 		문장 n <= 조건식1, 조건식2, 조건식3이 모두 거짓인 경우 실행 되는 구문
 * }
 * 
 * if(조건식) else 구문 없는 if 구문 가능. if 없는 else는 불가능.
 * 실행되는 구문이 한문장일 때는 중괄호{} 생략 가능.
 * if, else 구문 내부에 다시 if 구문 사용 가능함. 
 */
public class IfEx1 {
	public static void main(String[] args) {
		System.out.println("점수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		
		if(score >= 60) {
			System.out.println("축하합니다. 합격입니다.");
		} else {
			System.out.println("다음기회에");
		}
		// 90점 이상 A학점, 80점 이상 B학점 ......
		if(score >= 90) {
			System.out.println("A학점");
		} else if (score>=80) {
			System.out.println("B학점");
		} else if (score >=70) {
			System.out.println("C학점");
		} else if (score >=60) {
			System.out.println("D학점");
		} else {
			System.out.println("F학점");
		}
	}		// 메인 메서드 종료 => 프로그램 종료

}
