import java.util.Scanner;
public class Problem6 {

	public static void main(String[] args) {
		System.out.println("삼각형의 높이를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int count = num*num;
		int max = num*2-1;
		int middle = max/2+1;
		for(int i = 0; i<num; i++) {
			for(int j =1; j<=max; j++) {
				if(j>=middle-i && j<=middle+i) {
					System.out.printf("%2d", count--);
				} else { 
				System.out.print("  ");
				}
			}
		System.out.println();
		}
	}
}