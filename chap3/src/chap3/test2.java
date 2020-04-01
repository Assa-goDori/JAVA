package chap3;
import java.util.Scanner;
public class test2 {

	public static void main(String[] args) {
		int i, j, k;
		
		System.out.println("별의 높이를 입력하세요 :");
		Scanner scan = new Scanner(System.in);
		int high = scan.nextInt();
		
		for(i = 1; i<high+1; i++) {
			
		}
		
		for(i = 1; i<high+1; i++) {
			for(k=1;k<high/2; k++) {
				System.out.print("\t");
			}
			
			for(j=1; j<i+1;j++) {
				System.out.print("★");
			}
			for(k=high/2;k<high; k++) {
				System.out.print("\t");
			}
		System.out.println();
			
		}
		
	}
}
