package chap18;
/*
 * �Ű������� �ְ�, ���ϰ��� �ִ� ���
 */
interface LambdaInterface4 {
	int method(int x, int y);
}
public class LambdaEx4 {
	public static void main(String[] args) {
		LambdaInterface4 f4 = (x,y) -> {
			return x*y;
		};
		System.out.println("�� ���� �� : " + f4.method(2, 5));
//		f4 = (x, y) -> { return x+y; };	//�ѹ��常 ���� ��� ���� ���� ����
		f4 = (x, y) -> x+y;
		System.out.println("�� ���� �� : " + f4.method(2, 5));
		f4 = (x,y) -> x-y;
		System.out.println("�� ���� ���� : " + f4.method(5, 2));
		f4 = (x,y) -> x%y;
		System.out.println("�μ��� ���� ������ : " + f4.method(5, 2));
		f4 = (x, y) -> sum(x,y);	//����Ÿ���� ������ �ٸ� �Լ��� ���ϰ��� �����ͼ� �ᵵ �ȴ�.
		System.out.println("�� ���� �� : " + f4.method(2, 5));
		f4 = (x, y) -> (x>y)?x:y;
		System.out.println("�� ���� ū �� : " + f4.method(2, 5));
		f4 = (x, y) -> (x>y)?y:x;
		System.out.println("�� ���� ���� �� : " + f4.method(2, 5));
	}
	private static int sum(int x, int y) {
		return x+y;
	}
}