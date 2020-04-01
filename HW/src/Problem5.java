import java.util.Scanner;

public class Problem5 {
	public static void main(String[] args) {
		System.out.println("삼각형의 높이를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int high = scan.nextInt();
		int sum = 0;
		for(int i = 1; i<=high;i++) {
			sum += i;
		}	
		for(int i = 0; i<high; i++) {
			for(int j = 0; j<high; j++) {
				if(i>j) {
					System.out.print("\t");
				} else {
				System.out.print(sum-- + "\t");
				}
			}
		System.out.println();
		}
	}
}