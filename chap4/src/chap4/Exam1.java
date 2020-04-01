package chap4;
import java.util.Scanner;

/*
 * 12345 초가 몇시간 몇분 몇초 인가?
 * 
 * System.in : 표준입력 => 키보드 입력
 */
public class Exam1 {

	public static void main(String[] args) {
		System.out.println("계산할 초를 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		int second = scan.nextInt();
		System.out.println(second/3600 +  "시 " + (second%3600)/60 + " 분 " + second%60 +" 초");

	}
}
