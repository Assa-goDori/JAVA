package chap4;
import java.util.Scanner;
/*
 * 10부터 99사이의 두자리 자연수를 입력받아 입력된 수 보다 크거나 같은 10의 배수를 구하기
 * 10의 배수에서 입력된 수를 뺀 값을 출력하기
 * [결과]
 * 10부터 99사이의 두자리 자연수를 입력하세요
 * 24
 * 6
 * 
 */
public class Exam7 {
	public static void main(String[] args) {
		System.out.println("10부터 99사이의 두자리 자연수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int result = (a%10>0)?((a/10)+1)*10:a;
		System.out.println(result-a);
	}

}
