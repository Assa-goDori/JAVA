package chap5;
import java.util.Scanner;
/*
 * 윤년 구하기
 * 	윤년은 4의 배수이고, 100의 배수인 경우는 평년, 단, 400의 배수는 윤년
 * 
 * 	그 외는 평년. 년도를 입력받아서 윤년 평년 인지 출력하기.
 * 
 * [결과]
 * 연도를 입력하세요
 * 2020
 * 윤년
 * 
 * 연도를 입력하세요
 * 
 * 2100
 * 평년
 * 
 */
public class Exam3 {

	public static void main(String[] args) {
		System.out.println("연도를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		
		if(year%4 == 0) {
			if(year%100 == 0) {
				if(year%400 == 0) 	System.out.println("윤년");
				else 				System.out.println("평년");
			} else 					System.out.println("윤년");
		} else 						System.out.println("평년");
	}

}