package chap16;
/*
 * Runnable �������̽��� �����Ͽ� ������ �����ϱ�
 */
class Runnable1 implements Runnable {  //Thread Ŭ���� �ƴ�. Runnable �������̽��� ����Ŭ������.
	@Override
	public void run() {
		for(int i = 0; i<5; i++) {
			//Thread.currentThread() : ���� ���� Running ������ ������
			System.out.println(i + "=" + Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) { }
		}
	}
}

public class ThreadEx2 {
	public static void main(String[] args) {
		System.out.println("main ������ ����");
		Runnable1 r = new Runnable1();		// �����尡 �ƴϹǷ� New ���°� �ƴ�
		//r.run() �޼��带 �����ϰ�, �̸��� First�� Thread ��ü ����
		Thread t1 = new Thread(r, "First");	//t1�� New ����
		Thread t2 = new Thread(r, "Second");//t2�� New ����
		t1.start();
		t2.start();
//		t1.run(); // r.run() �����
//		t2.run();
		System.out.println("main ������ ����");
	}
}