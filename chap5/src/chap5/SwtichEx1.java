package chap5;
import java.util.Scanner;
/*
 * switch 구문 예제
 * 
 * switch(조건 값(변수, 수식)) {
 * 		case 값1 : 문장 1 : break;
 * 		case 값2 : 문장21 : break;
 * 		...
 * 		default : 문장n;
 * }
 * 
 * break : break가 속한 switch 구문, 반복문을 더이상 실행하지 않고 빠짐.
 */
public class SwtichEx1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		int score = scan.nextInt();
		String grade;
		
		switch (score/10) {
		case 10 : 
		case 9 : grade = "A"; break;
		case 8 : grade = "B"; break;
		case 7 : grade = "C"; break;
		case 6 : grade = "D"; break;
		default : grade = "F"; break;
		}
		System.out.println(grade + "학점");
	}

}
