package chap16;
/*
 * wait(), notify(), notifyAll()
 *   1. �ݵ�� ����ȭ ����(����ȭ ��, ����ȭ �޼���)������ ȣ���� �����ϴ�.
 *   2. Object Ŭ������ ��� �޼���
 *      => ��� Ŭ������ ��ü�� �޼��� ȣ�� ����.
 *   3. wait() : ����ȭ ���¿��� ��� ���·� ��ȯ(lock ����). notify()�� notifyAll() �޼��忡 ���ؼ� ���� ���ɻ��·� ��ȯ��
 *      notify() : wait() ���¿� �ִ� ������ �� �� ���� ���� ���� ���·� ��ȯ
 *                 �����ڰ� ������ �� ����.
 *      notifyAll() : wait() ���¿� �ִ� ��� �����带 ���� ���� ���·� ��ȯ
 */
class ATM2 implements Runnable {
	private int money = 100000;
	public void run() {
		synchronized(this) {
			while(true) {
				if(money <= 0) {
					System.out.println("�ܾ��� �����ϴ�.");
					notify();
					break;
				}
				withdraw();
				if(money % 20000 == 0) {
					try {
						wait();
					} catch (InterruptedException e) { }
				} else {
					notify();
				}
			}
		}
	}
	void withdraw() {
		if(money <=0) return;
		money -= 10000;
		System.out.println(Thread.currentThread().getName() + "���, �ܾ� : " + money);
	}
}
public class ThreadEx12 {
	public static void main(String[] args) {
		ATM2 atm = new ATM2();
		Thread mother = new Thread(atm, "Mother");
		Thread son = new Thread(atm, "Son");
		mother.start(); son.start();
	}
}