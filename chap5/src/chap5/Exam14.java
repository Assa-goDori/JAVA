package chap5;

import java.util.Scanner;

public class Exam14 {

	public static void main(String[] args) {
		int i,j,k;
		System.out.println("삼각형의 높이를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int high = scan.nextInt();
		
		for(i=1;i<=high;i++) {
			for(k=1;k<i;k++) {
				System.out.print(" ");
			}
			
			for(j=high;j>=k;j--) { 
				System.out.print("*");
			}
			System.out.println();
		}

		for(i=1;i<=high;i++) {		//3
			for(j=1;j<=high;j++) {		//1
				if(i>j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}			
			}
		System.out.println();
		}
		
	}

}
