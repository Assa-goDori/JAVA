package chap9;
/*
 * �������̽� ��ü �����ϱ�
 */

interface Action {
	void action();
}
abstract class Abs {
	abstract void method();
}
public class InterfaceObjectEx {
	public static void main(String[] args) {
		//�̸� ���� ���� Ŭ����  => ��ȸ�� ��ü�� ����
		Action a = new Action() {
			@Override
			public void action() {
				System.out.println("�������̽��� ��ü 1");
			}
		};
		a.action();
		a = new Action() {
			@Override
			public void action() {
				System.out.println("�������̽��� ��ü 2");	//�������̽��� ��ü1�� �����
			}
		};
		a.action();
		
		Abs ab = new Abs() {
			@Override
			void method() {
				System.out.println("�߻�Ŭ������ ��ü 1");
			}
		};
		ab.method();
		
		//jdk 8.0 ���� ���� ������� ó���ϱ� : �������̽��� ����, �߻�Ŭ���� �Ұ���
		a = () -> System.out.println("�������̽��� ���ٽ����� ó��");
		a.action();
	}
}