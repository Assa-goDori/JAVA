package chap6;
/*
 * score �迭���� ���� ���ΰ� 1�� �� ū result �迭 �����ϱ�
 * score �迭�� ������ result�� �����ϰ�,
 * �� �߰��� ��� ������ �� ��� ���� ���� �����ϰ� result�迭�� ���� ����ϱ�
 */
public class Exam7 {
	public static void main(String[] args) {
		int[][] score = {
				{90, 80, 70},
				{95, 85, 75},
				{70, 80, 75},
				{75, 70, 85},
				{70, 75, 80}
		};
		int[][] result = new int[score.length+1][score[0].length+1];

		for(int i = 0; i<score.length; i++) {
			for(int j = 0; j<score[i].length; j++) {
				result[i][j] = score[i][j];
				//���� ���� ������ ���� �����ϱ�
				result[i][score[i].length] += score[i][j];
				//���� ���� ������ �࿡ �����ϱ�
				result[score.length][j] += score[i][j];
				//������ �� ������ ���� �����ϱ�
				result[score.length][score[i].length] += score[i][j];
			}
		}
		
		//���� �� ���ϱ�
//		for(int i = 0; i<score.length; i++) {
//			for(int j = 0; j<score[0].length; j++) {
//				result[i][3] += result[i][j];
//			}
//		}
		
		//���� �� ���ϱ�

//		for(int i = 0; i<score[0].length; i++) {
//			for(int j = 0; j<score.length; j++) {
//				result[5][i] += result[j][i];
//			}
//		}

		//����ϱ�
			for(int i = 0; i<result.length; i++) {
				for(int j = 0; j<result[i].length; j++) {
					System.out.printf("%5d", result[i][j]);		//%5d : 5�ڸ� Ȯ���ϰ� 10�� ������ ��� => ���� ���� ����
				}
				System.out.println();
			}
	}
}