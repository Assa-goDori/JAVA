package chap5;

import java.util.Scanner;

public class Exam16 {

	public static void main(String[] args) {
		System.out.println("삼각형의 높이를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int high = scan.nextInt();
		int floor = high*2-1;
		int middle = floor/2;
		
		for(int i=high;i>=1;i--) {
			for(int j=0;j<floor;j++) {
				if(j>middle-i && j<middle+i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
		System.out.println();
		}
	}

}
