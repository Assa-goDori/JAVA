import java.util.Scanner;

class OutOfNumException extends Exception {
	OutOfNumException(String msg) {
		super(msg);
	}
	public String toString() {
		return super.getMessage();
	}
} 

public class Problem1 {
	public static void main(String[] args) {
		int divide = 1;
		int[] arr = new int[10];	//입력받은 숫자를 자리수대로 넣을 배열
		int errorcode = 0;
		String num[][][] = {		//배열 크기 : num[9][5][1]
				{
					{"******"},		//0면 0행 0열	
					{"**  **"},		
					{"**  **"},		
					{"**  **"},		
					{"******"}},	//0면 4행 0열
				{	{"  **  "},		//1면 0행 0열	
					{"  **  "},		
					{"  **  "},		
					{"  **  "},		
					{"  **  "}},	//1면 4행 0열
				{	{"******"},		//2면 0행 0열
					{"    **"},
					{"******"},
					{"**    "},
					{"******"}},	//2면 4행 0열
				{	{"******"},		//3면 0행 0열
					{"    **"},
					{"******"},
					{"    **"},
					{"******"}},	//3면 4행 0열
				{	{"**  **"},		//4면 0행 0열
					{"**  **"},
					{"******"},
					{"    **"},
					{"    **"}},	//4면 4행 0열
				{	{"******"},		//5면 0행 0열
					{"**    "},
					{"******"},
					{"    **"},
					{"******"}},	//5면 4행 0열
				{	{"******"},		//6면 0행 0열
					{"**    "},
					{"******"},
					{"**  **"},
					{"******"}},	//6면 4행 0열
				{	{"******"},		//7면 0행 0열
					{"    **"},
					{"   ** "},
					{"  **  "},
					{" **   "}},	//7면 4행 0열
				{	{"******"},		//8면 0행 0열
					{"**  **"},
					{"******"},
					{"**  **"},
					{"******"}},	//8면 4행 0열
				{	{"******"},		//9면 0행 0열
					{"**  **"},
					{"******"},
					{"    **"},
					{"******"}}		//9면 4행 0열
		};

		while(true) {
			System.out.println("자리수를 입력하세요(1~10) (-1 입력시 프로그램 종료)");
			Scanner scan = new Scanner(System.in);

			try {
				int input = scan.nextInt();
				if(input == -1) { System.out.println("프로그램을 종료합니다. "); break; }
				int a = 1;
				for(int i = 0; i<input-1; i++) { a *= 10; }
				if(input>10 || input <1) { throw new OutOfNumException("올바른 자리수를 입력하세요."); }

				System.out.println("0부터 9까지 숫자를 입력하세요");
				Scanner scan2 = new Scanner(System.in);
				int input2 = scan2.nextInt();
				if(input2<a || input2>a*10) { throw new OutOfNumException("올바른 자리수의 수를 입력하세요."); }
				
				//divide 값 설정하기
				for(int i = 0;i<input-1;i++) { divide *= 10; }
			
				//입력받은 숫자 배열에 집어 넣기
				for(int i = 0;i<input;i++) {
					arr[i] = input2/divide;
					input2 -= arr[i]*divide;
					divide /= 10;
					if(divide == 1) {
						arr[i+1] = input2%10;
						break;
					}
				}

				//입력받은 값과 3차원배열 비교하기
				for(int k = 0; k<num[0].length;k++) {		//3차원 배열 0행의 크기만큼 실행 : 5
					for(int i = 0; i<input; i++) {			//자리수 만큼 for문 실행
						for(int j = 0; j<num.length;j++) {	//숫자모양 출력배열과 입력배열 비교
							if (arr[i] == j) { System.out.print(num[j][k][0] + "\t"); }	
						}			
					}
					System.out.println();
				}
			} catch (OutOfNumException e) {
				System.out.println(e);
				continue;
			}
		}
	}
}