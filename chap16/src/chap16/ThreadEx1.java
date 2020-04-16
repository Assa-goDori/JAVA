package chap16;
/*
 * Thread ���� 1
 * Thread ����
 *   1. Thread Ŭ���� ��� => ThreadEx1.java
 *   2. Runnable �������̽� ���� => ThreadEx2.java
 */
class Thread1 extends Thread {	//Thread Ŭ����
	Thread1(String name) {
		super(name);
	}
 
	public void run() {		// �����췯�� ���� ���õ� �������� Running ����
		for (int i = 0; i < 5; i++) {
			System.out.println(i + "=" + getName());	// getName() : ������ �̸�
			try {
				sleep(1000);	// 1�� ���, ��� ���� ���� Runnable ���·� ��ȯ
			} catch (InterruptedException e) {}
		}
	}	// Dead ����, Thread ����
}

public class ThreadEx1 {
	public static void main(String[] args) {	// main�� ������
		System.out.println("main ������ ����");
		Thread1 t1 = new Thread1("First");		//New ����
		Thread1 t2 = new Thread1("Second");		//New ����
		t1.start();		// start()�� ���� Runnable ����	
		t2.start();		// start()�� ���� Runnable ����
		/*
		 * start() �޼��� ���
		 *   1. ���� ������ ����ȭ ��
		 *   2. ����ȭ�� ���ÿ� run() �޼��� ȣ����.
		 */
//		t1.run();
//		t2.run();
		System.out.println("main ������ ����");
	}	// main, t1, t2 3���� �����尡 ��� ����Ǿ�� ���μ����� ����� �� �ִ�.
}