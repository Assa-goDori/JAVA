package chap7;
/*
 * ��� �Լ� ����
 * 	����Լ� : �ڽ��� �Լ��� �ٽ� ȣ���ϴ� �Լ�
 * 		=> Stack ������ �����ϹǷ� ������.
 */
public class FactorialEx {
	public static void main(String[] args) {
		System.out.println("5!=" + factorial(5));	//5x4x3x2x1=120
	}

	private static int factorial(int i) {
		return (i==1)?1:i*factorial(i-1);
	}

}
