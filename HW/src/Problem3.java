import java.util.Scanner;

public class Problem3 {
	public static void main(String[] args) {
		boolean change = false;
		
		System.out.println("강아지와 병아리의 합계를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int sum = scan.nextInt();
		
		System.out.println("강아지와 병아리의 다리의 합계를 입력하세요");
		Scanner scan2 = new Scanner(System.in);
		int sum2 = scan2.nextInt();
		
		for(int i=0;i<100;i++) {
			for(int j=0;j<100;j++) {
				if(i+j==sum && i*4+j*2==sum2) {
					System.out.println("강아지는 " + i + "마리이고, 병아리는 " + j + "마리입니다.");
					change = true;
				}
			}
		}
		if(change==false) System.out.println("정답없음");
	}
}