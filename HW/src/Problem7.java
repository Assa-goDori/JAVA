import java.util.Scanner;

public class Problem7 {
	public static void main(String[] args) {
		int score[] = new int[5];
		int totscore = 0;
		int max = 0;
		int min = 100;
	
		System.out.println("5���� ������ �Է��ϼ���");
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
		System.out.printf("������ �հ�:%d\n���:%.2f\n�ִ�����:%d\n�ּ�����:%d", totscore, avg, max, min);
	}
}