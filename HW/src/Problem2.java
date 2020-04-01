import java.util.Scanner;

public class Problem2 {
	public static void main(String[] args) {
		System.out.println("홀수개의 배열 높이를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int high = scan.nextInt();
		int max = high;
		int middle = max/2+1;
		
		for(int i=high/2+1;i>=1;i--) {			//i=3	max = 5	middle = 3	middle-i=1
			for(int j=1;j<=high;j++) {
				if(j>middle-i && j<middle+i) System.out.print("*");
				else						System.out.print(" ");
			}
			System.out.println();
		}
		
		for(int i=1;i<=high/2;i++) {
			for(int j=1;j<=high;j++) {
				if(j>=middle-i && j<=middle+i) System.out.print("*");
				else							System.out.print(" ");
			}
		System.out.println();
		}
	}
}