package chap5;
/*
 * �ݺ����� �̿��Ͽ� 1���� 10���� �� ���ϱ�
 */
public class LoopEx2 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		for(i=0;i<=10;i++) {
			sum += i;
		}
		System.out.println("[for����]1~10������ ���� " + sum);
		
		i=1;
		sum=0;
		while(i<=10) {
			sum += i;
			i++;
		}
		System.out.println("[while����]1~10������ ���� " + sum);
		
		i=1;
		sum=0;
		do {
			sum += i;
			i++;
		}while(i<=10);
		System.out.println("[do while����]1~10������ ���� " + sum);
	}

}