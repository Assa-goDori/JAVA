import java.util.Scanner;

public class Problem3 {
	public static void main(String[] args) {
		boolean change = false;
		
		System.out.println("�������� ���Ƹ��� �հ踦 �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int sum = scan.nextInt();
		
		System.out.println("�������� ���Ƹ��� �ٸ��� �հ踦 �Է��ϼ���");
		Scanner scan2 = new Scanner(System.in);
		int sum2 = scan2.nextInt();
		
		for(int i=0;i<100;i++) {
			for(int j=0;j<100;j++) {
				if(i+j==sum && i*4+j*2==sum2) {
					System.out.println("�������� " + i + "�����̰�, ���Ƹ��� " + j + "�����Դϴ�.");
					change = true;
				}
			}
		}
		if(change==false) System.out.println("�������");
	}
}