package chap5;
import java.util.Scanner;

public class Exam12 {

	public static void main(String[] args) {
		System.out.println("삼각형의 높이를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int high = scan.nextInt();
		
		for(int i=high;i>=1;i--) {
			for(int j=1;j<=i;j++) { 
				System.out.print("★");
			}
			System.out.println();
		}
	}

}
