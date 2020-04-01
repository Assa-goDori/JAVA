package chap6;
import java.util.Scanner;
/*
 * 2차원 배열을 이용하여 모래시계 출력하기
 * 
 * [결과]
 * 길이를 홀수로 입력하세요
 * 5
 *  *****
 *   *** 
 *    *  
 *   *** 
 *  *****
 */
public class Exam8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("길이를 홀수로 입력하세요");
		int num = scan.nextInt();
		char matrix[][] = new char[num][num];
		
		for(int i = 0; i<=matrix.length/2; i++) {
			for(int j = i; j<matrix.length-i; j++) {
				matrix[i][j] = '*';
			}
		}
		
		for(int i = matrix.length/2+1; i<matrix.length; i++) {
			for(int j = matrix.length-i-1;j<=i;j++) {
				matrix[i][j] = '*';
			}
		}
		
		for(int i = 0;i<matrix.length; i++) {
			for(int j = 0; j<matrix[i].length; j++) {
				System.out.print(matrix[i][j]);
			}
		System.out.println();
		}
	}
}