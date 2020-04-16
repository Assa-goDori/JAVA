import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {
		System.out.println("삼각형의 높이를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int high = scan.nextInt();
		int max = high*2-1;
		int middle = max/2;
		
		for(int i=high;i>=1;i--) {
			for(int j=0;j<=max;j++) {
				if(j>middle-i && j<middle+i) System.out.print("*");
				else						System.out.print(" ");
			}
		System.out.println();
		} 
	}
}