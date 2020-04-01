package chap16;
/*
 * join() : �����尡 ������ ������ ���
 */
class Thread100 extends Thread {
	int sum = 0;
	public void run() {
		for(int i = 1; i<=100; i++) {
			sum += i;
		}
	}
}
public class ThreadEx5 {
	public static void main(String[] args) {
		Thread100 t = new Thread100();
		t.start();
		try {
			t.join();	//t�����尡 ������ �� ���� main������ ���
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("1~100������ �� : " + t.sum);
	}
}