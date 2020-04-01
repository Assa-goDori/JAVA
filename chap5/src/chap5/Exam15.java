package chap5;
import java.util.Scanner;

public class Exam15 {
	public static void main(String[] args) {
		System.out.println("삼각형의 높이를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int high = scan.nextInt();
		int floor = high*2-1;
		int middle = floor/2+1;
		
		for(int i=0; i<high; i++) {
			for(int k=high-1;k>i;k--) {
				System.out.print(" ");
			}
			
			for(int j=middle-i; j<=middle+i;j++) {
				System.out.print("*");
			}
			
		System.out.println();
		}
	
		for(int i=0;i<high;i++) {
			for(int j=0;j<floor;j++) {
				if(j>=middle-1-i && j<=middle-1+i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
		System.out.println();
		}
		
		
	}

	
}
