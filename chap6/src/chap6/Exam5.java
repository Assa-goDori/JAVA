package chap6;
/*
 * 5�� �л��� ����, ����, ���� ������ �л����� ����, ����� ���ϰ�, ���� ������ ��� ����ϱ�
 * [���]
 * 			����	����	����	����	���
 * 1���л� : 100	80	90	270	90.0
 * 2���л� : 100	80	90	270	90.0
 * 3���л� :	...
 * 4���л� :
 * 5���л� : 10	80	90	270	90.0
 * �������� : 500 400	450
 * ������� : 100	80	90
 */
public class Exam5 {
	public static void main(String[] args) {
//		int[][] arr = new int[5][3];
//		arr[0][0] = 100;	arr[0][1] = 80;		arr[0][2] = 90;
//		arr[1][0] = 100;	arr[1][1] = 80;		arr[1][2] = 90;
//		arr[2][0] = 100;	arr[2][1] = 80;		arr[2][2] = 90;
//		arr[3][0] = 100;	arr[3][1] = 80;		arr[3][2] = 90;
//		arr[4][0] = 100;	arr[4][1] = 80;		arr[4][2] = 90;

		System.out.println("\t����" + "\t����" + "\t����" + "\t����" + "\t���");
		
		//2���� �迭�� ����, ����, �ʱ�ȭ
		int[][] arr = {{100, 80, 90}, {90, 85, 75}, {70, 80, 90}, {95, 85, 75}, {60, 65, 95}};
		
		int[] tot = new int[3];
		
		for(int i = 0; i<arr.length; i++) {
			int sum = 0;
			System.out.print((i+1) + "���л� : ");
			for(int j = 0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
				sum += arr[i][j];
				tot[j] += arr[i][j];
			}
//		System.out.println(sum + "\t" + (double)sum/arr[i].length);
		System.out.printf("%d\t%.2f\n", sum, (double)sum/arr[i].length);

		}
		
		System.out.print("�������� : ");
		for(int i = 0; i<tot.length;i++) {
			System.out.print(tot[i] + "\t");
		}
		System.out.println();
		System.out.print("������� : ");
		for(int i = 0; i<tot.length;i++) {
			System.out.print((double)(tot[i]/arr.length)+"\t");
		}

		
		
//		//��������
//		System.out.print("�������� : ");
//		for(int i = 0; i<arr[i].length; i++) {
//			int asum = 0;
//			for(int j = 0; j<arr.length; j++) {
//				asum += arr[j][i];
//			}
//		System.out.print(asum + "\t");
//		}
//		System.out.println();
//		//�������
//		System.out.print("������� : ");
//		for(int i = 0; i<arr[i].length; i++) {
//			int asum = 0;
//			for(int j = 0; j<arr.length; j++) {
//				asum += arr[j][i];
//			}
//		System.out.print((double)asum/arr.length + "\t");
//		}
	}
}