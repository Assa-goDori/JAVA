package chap6;

import java.util.Scanner;

public class Exam9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("길이를 홀수로 입력하세요");		//5 ===>> (5+3+1)*2-1 = 17
		int num = scan.nextInt();
		int matrix[][] = new int[num][num];
		int count = 0;	
		for(int i = num; i>=1;i-=2) {
			count += i;
		}
		count = count*2-1;
		for(int i = 0; i<=matrix.length/2; i++) {
			for(int j = i; j<matrix.length-i; j++) {
				matrix[i][j] = count--;
			}
		}
		for(int i = matrix.length/2+1; i<matrix.length; i++) {
			for(int j = matrix.length-i-1;j<=i;j++) {
				matrix[i][j] = count--;
			}
		}	
		for(int i = 0;i<matrix.length; i++) {
			for(int j = 0; j<matrix[i].length; j++) {
				if (matrix[i][j]==0) {
					System.out.print("   ");
				} else {
					System.out.printf("%3d", matrix[i][j]);
				}
			}
		System.out.println();
		}
	}
}