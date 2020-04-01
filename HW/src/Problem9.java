import java.util.Scanner;

public class Problem9 {
	public static void main(String[] args) {
		int arr[] = new int[10];		//0~9까지 생성 배열
		int num[] = new int[4];			//4개의 숫자를 뽑는 배열
		int input[] = new int[4];		//사용자가 입력한 4개의 숫자 배열
		int set[] = new int[4];			//화면 출력용 배열
		boolean game = false;
		int number = 0;
		//set배열 -1로 초기화
		for(int i = 0; i<set.length;i++) {
			set[i] = -1;
		}
		
		//0~9까지 숫자 배열에 넣기
		for(int i = 0; i<arr.length;i++) {
			arr[i] = number++;
		}
		//임의대로 섞기
		for(int i = 0; i<100;i++) {
			int a = (int)(Math.random()*10);
			int b = (int)(Math.random()*10);
			int temp = arr[a];
			arr[a] = arr[b];
			arr[b] = temp;
		}
		//4개 뽑기
		for(int i =0; i<num.length;i++) {
			num[i] = arr[i];
		}
		//맞출 때 까지 반복
		while(game!=true) {
			int ballcount = 0;
			int strikecount = 0;
			int divide = 1000;
			//빈칸출력
			for(int i = 0; i<set.length;i++) {
				if(set[i]==-1) {
					System.out.print("[_]");
				} else {
					System.out.print("[" + set[i] + "]");
				}
			}
			System.out.println();
			//숫자 입력
			System.out.println("4개의 숫자를 입력하세요");
			Scanner scan = new Scanner(System.in);
			int abcd = scan.nextInt();
			for(int j = 0; j<input.length;j++) {
				input[j] = abcd/divide;
				abcd -= input[j]*divide;
				divide /=10;
				if(divide == 1) {
					input[j+1] = abcd%10;
					break;
				}
			}
			//스트라이크, 볼 계산
			for(int i = 0; i<num.length; i++) {
				for(int j = 0; j<input.length; j++) {
					if(num[i]==input[j] && i==j) {
						strikecount++;
						set[i]=num[i];
					} else if(num[i]==input[j] && i!=j) {
						ballcount++;
					}
				}
			}
			if(strikecount==4) {
				for(int a : num) {
					System.out.print(a + " ");
				}
				System.out.println("정답입니다!");
				game = true;
			} else {
				System.out.println(strikecount + " 스트라이크 " + ballcount + " 볼 입니다.");
			}
			System.out.println();
		}
	}
}