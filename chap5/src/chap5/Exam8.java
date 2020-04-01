package chap5;

import java.util.Scanner;
/*
 * 숫자로 이루어진 문자열을 입력받아 각 자리수의 합을 구하기
 * String str = scan.next();		// 123
 * str.length() : 3
 * str.charAt(0) : 1
 * str.charAt(1) : 2
 * str.charAt(2) : 3
 * str.charAt(3) : 없음. 오류발생
 * 1+2+3=6
 */
public class Exam8 {
	public static void main(String[] args) {
		System.out.println((int)'0' + ", " + (int)'1');
		System.out.println("숫자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int sum = 0;
		
		for(int i = 0; i<str.length();i++) {
			char ch = str.charAt(i);
			sum += ch-'0';
		}
		
		System.out.println(sum);
	}

}
