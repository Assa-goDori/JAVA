import java.util.Scanner;
public class Test1 {
	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		boolean ox = true;
		
		for(int i = 2; i<num; i++) {
			if(num==1)	break;
			if(num%i==0)	ox = false;
		}
		
		if(ox == true && num==1)	System.out.println("1은 소수가 아닙니다");
		else if (ox ==true)			System.out.println(num + "은 소수입니다.");
		else						System.out.println(num + "은 소수가 아닙니다.");
	}
}