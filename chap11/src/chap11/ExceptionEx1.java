package chap11;
/*
 * ����ó��
 * try �� : ���ܰ� �߻��� ���ɼ��� �ִ� ������� �ۼ�
 *          ���ܰ� �߻��� ��� catch ���� �����
 * catch �� : try ������ ���ܰ� �߻��� ��� ȣ��Ǵ� ��
 *            try ���� �Բ� ���Ǿ����
 */
public class ExceptionEx1 {
	public static void main(String[] args) {
		try {
			System.out.print(1);
			System.out.print(2);
			System.out.print(3/0);	// ���� �߻�
			System.out.print(4);
		} catch (ArithmeticException e) {
			System.out.println("\n0���� ������ ������");
		}
		System.out.println(5);
	}
}