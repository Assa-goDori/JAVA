import java.util.Scanner;

public class Problem7 {
	public static void main(String[] args) {
		int score[] = new int[5];
		int totscore = 0;
		int max = 0;
		int min = 100;
	
		System.out.println("5개의 점수를 입력하세요");
		for(int i = 0; i<5; i++) {
			Scanner scan = new Scanner(System.in);
			score[i] = scan.nextInt();
			totscore += score[i];
			if(score[i]>max)
				max = score[i];
			if(score[i]<min)
				min = score[i];
		}
		double avg = totscore/5;
		System.out.printf("점수의 합계:%d\n평균:%.2f\n최대점수:%d\n최소점수:%d", totscore, avg, max, min);
	}
}