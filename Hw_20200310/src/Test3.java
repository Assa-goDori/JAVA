import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		int[] coin = {500, 100, 50, 10, 5, 1};
		int[] cnt = {5, 5, 5, 5, 5, 5};
		int max = 0;
		for(int i = 0; i<coin.length; i++) {
			max += coin[i]*cnt[i];
		}
		System.out.println("��ȯ������ �ִ�ݾ��� " + max + "�Դϴ�.");
		System.out.println("�ݾ��� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		
		if(count>3330) {
			System.out.println("������ �����մϴ�.");
		} else {
			for(int i = 0; i<coin.length; i++) {
				for(int j = 1; j<=5; j++) {
					count -= coin[i];
					if(count<0) {
						count += coin[i];
						break;
					}
					cnt[i]--;
				}
				if(count==0) break;
			}
			for(int i = 0; i<coin.length;i++) {
				System.out.println(coin[i] + "�� : " + (5-cnt[i]) + "��");
			}
			for(int i = 0; i<cnt.length;i++) {
				System.out.println("���� " + coin[i] + "�� ���� : " + cnt[i]);
			}
		}
	}
}