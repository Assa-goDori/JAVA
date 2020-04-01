package chap18;
/*
 * ���ٽ� ���� : jdk8.0 ���ĺ��� ��밡��
 *   ���ٽĿ��� ����� �� �ִ� �������̽��� �ݵ�� FunctionalInterface ������
 *   
 *   FunctionalInterface : ����� �߻�޼��尡 1���� �����ϴ� �������̽� ex) Runnable �������̽� -> void run()
 *   
 *   �߻�޼����� �Ű������� ����, ����Ÿ�Ե� ���� ���.
 *   () -> {...}
 *   ���ٽ� ���ο� ����Ǵ� ������ �Ѱ��� ��� {} ���� ����.
 */
@FunctionalInterface	// ������̼�
interface LambdaInterface1 {
	void method();
}
public class LambdaEx1 {
	public static void main(String[] args) {
		//���� �ڵ� ���
		LambdaInterface1 f1 = new LambdaInterface1() {	//�̸����� ����Ŭ����
			@Override
			public void method() {
				System.out.println("���� ������� �ڵ�");
			}
		};
		f1.method();
		
		f1 = () -> {
			String str = "method call";
			System.out.println(str);
		};
		f1.method();
		
		f1 = () -> {
			System.out.println("method call2");
		};
		f1.method();
		
		f1 = () -> System.out.println("method call3");
		f1.method();
		
		execute(()->System.out.println("method call4"));
		execute(()->System.out.println("method call5"));
	}
	static void execute(LambdaInterface1 f) {
		f.method();
	}
}