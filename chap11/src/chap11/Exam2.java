package chap11;
/*
 * �ڹٿ��� ����ó���� �ʼ���.
 * ��, RuntimeException �ֿܴ� ����ó���� ���� �� �� �ִ�.
 * => ���ܴ� RumtimeException�� �� �� Exception���� ������.
 * => RuntimeException Ŭ������ ���� Ŭ������ ����ó�� ���� ����.
 */
public class Exam2 {
	public static void main(String[] args) {
		throw new RuntimeException("���� ���� �߻�"); // ���� ó�� ���� �ʰ� �����Ͽ��� ���¹�

	}
}