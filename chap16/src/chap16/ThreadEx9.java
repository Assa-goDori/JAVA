package chap16;
/*
 * ����ȭ : synchronized ������ ǥ���Ѵ�.
 *   ����ȭ�� : ThreadEx9.java
 *            lock ��ü�� ������ �����常 ����ȭ ������ ������ �� ����.
 *            lock�� ��ü���� ��. �⺻�ڷ����� lock���� ����� �� ����.
 *            lock ��ü�� �����ؾ� ��. ��� �����尡 �����ϴ� ������ü���� �Ѵ�.
 *   ����ȭ�޼��� : ThreadEx10.java
 */
class PrintThread2 extends Thread {
	char ch;
	static Object lock = new Object();	// lock�� �ݵ�� ���� ��ü�̿��� ��(static)
//	static int lock = 0;	// �⺻���� lock ��� �Ұ�
//	static Integer lock = 0;	// Integer�� ��ü�̹Ƿ� ��� ����
//	static int[] lock = {};		// �迭�� ��ü�̹Ƿ� ��� ����
	
	PrintThread2(char ch) {
		this.ch = ch;
	}
	@Override
	public void run() {
		for(int i = 0; i<20; i++) {
			synchronized(lock) {	// (����ȭ ��) t1�� ���� -> lock pool ��� ���� t2�� lock ���� -> ...
				for(int j = 0; j<80; j++) {
					System.out.print(ch);	//AAAA.....AAAA..... (80���� �� ���������� �ٸ� �����尡 ���� ����)
				}
				System.out.println();
			}	// t1�� lock ��ȯ -> t2 lock ��ȯ -> ...
		}
	}
}
public class ThreadEx9 {
	public static void main(String[] args) {
		PrintThread2 t1 = new PrintThread2('A');	// running -> ���� lock pool ��� -> ...
		PrintThread2 t2 = new PrintThread2('B');	// lock pool ��� -> ���� running -> ...
		PrintThread2 t3 = new PrintThread2('C');	// lock pool ��� -> ...
		t1.start(); t2.start(); t3.start();
	}
}