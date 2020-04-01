package chap11;
// ���� ó���� �ι� �ϱ�.
public class ExceptionEx7 {
	public static void main(String[] args) throws InterruptedException {
		try {
			badmethod();
		} catch (Exception e) {
			System.out.println("main ���� ���� ó��");
			e.printStackTrace();
		}
		Thread.sleep(1000);		//1�� ���� ���, Thread Ŭ���� ����ϱ� ���ؼ� �ݵ�� ����ó�� �ؾߵ�(RunTimeException ���� �ƴ�)
		System.out.println("main �޼��� ����");
	}
	private static void badmethod() throws Exception {
		try {
			throw new Exception("���� ���� �߻�");
		} catch(Exception e) {
			System.out.println("badmethod���� ���� ó��");
			e.printStackTrace();
			throw e;
		}
	}
}