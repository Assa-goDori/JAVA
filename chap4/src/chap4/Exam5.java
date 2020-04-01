package chap4;
import java.util.Scanner;
/*
 * 한 개의 문자를 입력받아 소문자인 경우는 대문자로 변경
 * 단, 소문자가 아닌 경우는 "소문자 아님"이라고 출력
 */
public class Exam5 {
	public static void main(String[] args) {
		System.out.println("문자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();	//문자열로 받음
		char ch = str.charAt(0);
		char c2 = (char)(ch - 32);	
		System.out.println(('a'<=ch && ch<='z')?c2:"소문자 아님");
		//String result = ('a'<=ch && ch<='z')?""+(char)(ch-32):"소문자 아님";
		//System.out.println(result);
	}

}
