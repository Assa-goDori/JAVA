import java.util.Scanner;
public class Test2 {
	public static void main(String[] args) {
		int[] coin = {500, 100, 50, 10, 5, 1};
		int[] cnt = {5, 5, 5, 5, 5, 5};
		int cnt500= 0;
		int cnt100=0;
		int cnt50=0;
		int cnt10=0;
		int cnt5=0;
		int cnt1=0;
		
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
			for(int i = 1;i<=5;i++) {
				count -= 500;
				if(count<0) {
					count += 500;
					break;
				}
				cnt500++;
				cnt[0] -=1;
			}
			
			for(int i = 1;i<=5;i++) {
				count -= 100;
				if(count<0) {
					count += 100;
					break;
				}
				cnt100++;
				cnt[1] -=1;
			}
			
			for(int i = 1;i<=5;i++) {
				count -= 50;
				if(count<0) {
					count += 50;
					break;
				}
				cnt50++;
				cnt[2] -=1;
			}
			
			for(int i = 1;i<=5;i++) {
				count -= 10;
				if(count<0) {
					count += 10;
					break;
				}
				cnt10++;
				cnt[3] -=1;
			}
			
			for(int i = 1;i<=5;i++) {
				count -= 5;
				if(count<0) {
					count += 5;
					break;
				}
				cnt5++;
				cnt[4] -=1;
			}
			
			for(int i = 1;i<=5;i++) {
				count -= 1;
				if(count<0) {
					count += 1;
					break;
				}
				cnt1++;
				cnt[5] -=1;
			}
			
			System.out.println("500�� : " + cnt500 + "\n100�� : " + cnt100 + "\n50�� : " + cnt50+ "\n10�� : " + cnt10+ "\n5�� : " + cnt5+ "\n1�� : " + cnt1);
			for(int i = 0; i<cnt.length;i++) {
				System.out.println("���� ���� " + coin[i] + "�� : " + cnt[i] + "��");
			}
		}
	}
}