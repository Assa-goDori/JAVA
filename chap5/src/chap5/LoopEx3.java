package chap5;
/*
 * ��ø �ݺ��� : �ݺ��� ���ο� �ݺ����� ����
 * ������ ����ϱ�
 */

public class LoopEx3 {
	public static void main(String[] args) {
		for(int i=2;i<=9;i++) {
			System.out.println("====" + i + "��" + "====");
			for(int k=2;k<=9;k++) {
				System.out.println(i + " x " + k + " = " + i*k);
			}
		}
	}

}
