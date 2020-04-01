package chap4;
import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		System.out.println("점수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		
		String result = score>=90?"A학점":(score>=80?"B학점":(score>=70)?"C학점":(score>=60)?"D학점":"F학점");
		System.out.println(result);

	}

}
