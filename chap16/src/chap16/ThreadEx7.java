package chap16;
/*
 * ���� ������
 *   1. �Ϲ� �������� ���� ���� �����. ���� ���� �ݺ�ó���� ��.
 *   2. �Ϲݽ����尡 ����Ǹ�, ���� �����嵵 �ڵ����� ����ȴ�.
 *   3. ���� : setDaemon(true)
 *           => New ���¿����� ������ ����.
 *              Runnable ���¿��� ������ �� ���� ���ܰ� �߻��ϰ� �ȴ�.(IllegalThreadStateException)
 */

class DaemonThread extends Thread {
	public void run() {
		while(true) {
			System.out.println(getName());
			try {
				sleep(100);
			}catch (InterruptedException e) {}
		}
	}
}
public class ThreadEx7 {
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new DaemonThread();	//���ν����尡 ����Ǳ� ������ ���ѹݺ����� ����
		Thread t2 = new DaemonThread(); //���󽺷���� ���డ���� �����尡 ������ ����� �� ����.
		t1.setDaemon(true);	//���󽺷��� ����, New���¿��� ������ �Ǿ�� ��.(start���Ŀ� �����ϸ� �Ϲ� ���� ������ ����)
		t2.setDaemon(true);
		t1.start(); t2.start();
		Thread.sleep(2000);
		System.out.println("main �޼��� ����");
	}
}