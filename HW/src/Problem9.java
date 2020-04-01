import java.util.Scanner;

public class Problem9 {
	public static void main(String[] args) {
		int arr[] = new int[10];		//0~9���� ���� �迭
		int num[] = new int[4];			//4���� ���ڸ� �̴� �迭
		int input[] = new int[4];		//����ڰ� �Է��� 4���� ���� �迭
		int set[] = new int[4];			//ȭ�� ��¿� �迭
		boolean game = false;
		int number = 0;
		//set�迭 -1�� �ʱ�ȭ
		for(int i = 0; i<set.length;i++) {
			set[i] = -1;
		}
		
		//0~9���� ���� �迭�� �ֱ�
		for(int i = 0; i<arr.length;i++) {
			arr[i] = number++;
		}
		//���Ǵ�� ����
		for(int i = 0; i<100;i++) {
			int a = (int)(Math.random()*10);
			int b = (int)(Math.random()*10);
			int temp = arr[a];
			arr[a] = arr[b];
			arr[b] = temp;
		}
		//4�� �̱�
		for(int i =0; i<num.length;i++) {
			num[i] = arr[i];
		}
		//���� �� ���� �ݺ�
		while(game!=true) {
			int ballcount = 0;
			int strikecount = 0;
			int divide = 1000;
			//��ĭ���
			for(int i = 0; i<set.length;i++) {
				if(set[i]==-1) {
					System.out.print("[_]");
				} else {
					System.out.print("[" + set[i] + "]");
				}
			}
			System.out.println();
			//���� �Է�
			System.out.println("4���� ���ڸ� �Է��ϼ���");
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
			//��Ʈ����ũ, �� ���
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
				System.out.println("�����Դϴ�!");
				game = true;
			} else {
				System.out.println(strikecount + " ��Ʈ����ũ " + ballcount + " �� �Դϴ�.");
			}
			System.out.println();
		}
	}
}