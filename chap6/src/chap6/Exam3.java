package chap6;
/*
 * Math.random() �޼��带 �̿��Ͽ� 1 ���� 10������ ������ ���� �迭 10���� �����ϱ�
 * �迭�� ����� ����ŭ * ����ϱ�
 * arr = {3, 5, 1, ...}
 * 3:***
 * 5:*****
 * 1:*
 * ...
 * 
 * 1. �迭 ����
 * 2. Math.random()�� ������ ���� �����Ͽ� �迭�� ����
 * 3. �迭�� �� ��ŭ * ��� => �迭�� ����ŭ �ݺ�
 */
public class Exam3 {
	public static void main(String[] args) {
		int[] arr = new int[10];

		for(int i = 0; i<arr.length;i++) {
			int num = (int) (Math.random()*10+1);
			arr[i] = num;
			System.out.print("arr[" + i + "] = " + arr[i] + " ");
			for(int k = 1; k<=arr[i];k++) {
				System.out.print("*");
			}
			// for(int k : arr) {
			//		for(int j=0; j<k; k++) {
			//			System.out.print("*");
			//		}
			//	}
			System.out.println();
		}
	}

}
