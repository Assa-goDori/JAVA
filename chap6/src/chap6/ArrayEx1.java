package chap6;
/*
 * �迭 ����1
 */
public class ArrayEx1 {
	public static void main(String[] args) {
		//1. �迭�� ����
		int[] arr1;
		//int arr2[];
		//2. �迭�� ����
		arr1 = new int[5];
		int[] arr2 = new int[10];	//����� ������ ���ÿ� ��
		//3. �迭 ���� �ʱ�ȭ
		arr1[0] = 10;
		arr1[1] = 20;
		arr2[0] = 100;
		arr2[1] = 200;
		

		arr2 = arr1;
		arr2[2] = 500;
		//4. �迭 �� ���
		System.out.println("arr1 �迭");
		for(int i=0;i<arr1.length;i++) {
			System.out.println("arr1[" + i + "]" + arr1[i]);
		}
		System.out.println("arr2 �迭");
		for(int i=0;i<arr2.length;i++) {
			System.out.println("arr2[" + i + "]" + arr2[i]);
		}
	}

}
