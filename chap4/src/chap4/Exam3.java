package chap4;
import java.util.Scanner;
/*
 *  화면에서 금액을 입력 받아 500, 100, 50, 10, 1원동전으로 바꾸기
 *  필요한 동전의 갯수를 출력하기
 *  [결과]
 *  금액을 입력하세요
 *  5641
 *  
 *  500원 : 11개
 *  100원 : 1개
 *  50원 : 0개
 *  10원 : 4개
 *  1원 : 1개
 */
public class Exam3 {

	public static void main(String[] args) {
		System.out.println("금액을 입력하세요");
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		
		System.out.println("\n500원 : " + count/500 + "개");
		System.out.println("100원 : " + (count%500)/100 + "개");
		System.out.println("50원 : " + ((count%500)%100)/50 + "개");
		System.out.println("10원 : " + (((count%500)%100)%50)/10 + "개");
		System.out.println("1원 : " +  count%10+ "개");

	}

}
