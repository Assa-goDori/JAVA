package chap18;
/*
 * Runnable �������̽��� �̿��Ͽ� ���ٽ����� ������ �����ϱ�
 */
public class LambdaEx2 {
//	static int sum = 0;
	public static void main(String[] args) {
		System.out.println("main ����");
//		final int sum = 0;
		Runnable r = () -> {	//�̸� ���� ���� ����Ŭ����
			int sum = 0;	// �������� Ŭ�������� ���������� �����ϰ��� �� ���� ����� �Ǿ�� �Ѵ�.
			for(int i = 0; i<=100; i++) {
				sum += i;
			}
			System.out.println("1���� 100������ �� : " + sum);
		};
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(()-> {
			int sum = 0;
			for(int i = 0; i<=100; i++) {
				sum += i;
			}
			System.out.println("1���� 100������ ��2 : " + sum);
		});
		t1.start(); t2.start();
	}
}