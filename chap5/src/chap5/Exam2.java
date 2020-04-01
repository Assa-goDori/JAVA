package chap5;
import java.util.Scanner;
/*
 * 키보드로부터 한 개의 문자를 입력받아 대문자, 소문자, 숫자, 기타 문자인지를 출력하기
 * 
 * [결과]
 * 한 개의 문자를 입력하세요.
 * A
 * 대문자
 * 
 * [결과]
 * 한 개의 문자를 입력하세요.
 * 8
 * 숫자
 * 
 * [결과]
 * 한 개의 문자를 입력하세요.
 *  /
 *  기타문자
 */
public class Exam2 {
	public static void main(String[] args) {
		System.out.println("한 개의 문자를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		String abc = scan.next();
		char ch = abc.charAt(0);
		
		if('a'<=ch && ch<='z')			System.out.println("소문자");
		else if ('A'<=ch && ch<='Z')	System.out.println("대문자");
		else if (ch>'0' && ch < '9')	System.out.println("숫자");
		else							System.out.println("기타문자");
	}

}
