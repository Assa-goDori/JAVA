package chap6;

import java.util.Arrays;

/*
 * 1���� 9������ ���� �� �ߺ����� �ʴ� ���� 3�� ���� �� �����Ͽ� ���
 * 
 * 1. 1~9 ������ �迭 ����.
 * 2. ���� ���ڸ� ������ �迭 ����. 3�� ���� ����.
 * 3. 1~9 �迭�� ����
 * 4. ���� �迭���� 3���� ���ڸ� ���õ� �迭�� ����
 * 5. ���õ� �迭�� �����Ͽ� ���
 */
public class Exam4 {
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] b = new int[3];
		
		for(int j = 0; j<10; j++) {
			int f = (int)(Math.random()*10-1);
			int h = (int)(Math.random()*10-1);
			int temp = a[f];
			a[f] = a[h];
			a[h] = temp;
		}
				
		System.out.print("�ߺ����� �ʴ� 3�ڸ� ���� : ");
		
		for(int k = 0; k<b.length; k++) {
			b[k] = a[k];
			System.out.print(b[k]);
		}
		
//		for(int i = 0; i<b.length;i++) {
//			for(int j = 0; j<b.length-1;j++) {
//				if(b[j]>b[j+1]) {
//					int tmp = b[j];
//					b[j] = b[j+1];
//					b[j+1] = tmp;
//				}
//			}
//		}
		Arrays.sort(b);			// �迭�� �������ִ� �޼���.
		System.out.print("\n" + "���� �� 3�ڸ� ���� : ");
		for(int i : b) {
			System.out.print(i);
		}
		
	}
}
