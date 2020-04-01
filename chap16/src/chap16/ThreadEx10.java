package chap16;
/*
 * ����ȭ ����
 *   ����ȭ �� : ThreadEx9.java
 *   ����ȭ �޼��� : ThreadEx10.java
 *     1. ���� ��ü�� �޼����̾�� ��.
 *       -> ���� ��ü : ��� �����尡 �ϳ��� ��ü�� �����ϰ� �ִ� ��ü
 */
class Printer {	//���� ��ü
	public synchronized void printChar(char ch) { //����ȭ �޼���(�����忡 ���ؼ� safe�ϴ�)
		for(int i = 0; i<80; i++) {
			System.out.print(ch);
		}
		System.out.println();
	}
}

class PrintThread3 extends Thread {
	Printer ptr;
	char ch;
	PrintThread3(Printer ptr, char ch) {
		this.ptr = ptr;
		this.ch = ch;
	}
	@Override
	public void run() {
		for(int i = 0; i<20; i++) {
			ptr.printChar(ch);
		}
	}
}

public class ThreadEx10 {
	public static void main(String[] args) {
		Printer ptr = new Printer();	//���� ��ü ����
		PrintThread3 t1 = new PrintThread3(ptr, 'A');
		PrintThread3 t2 = new PrintThread3(ptr, 'B');
		PrintThread3 t3 = new PrintThread3(ptr, 'C');
//		PrintThread3 t1 = new PrintThread3(new Printer(), 'A');
//		PrintThread3 t2 = new PrintThread3(new Printer(), 'B');
//		PrintThread3 t3 = new PrintThread3(new Printer(), 'C');	//������ü�� �ƴ� �Ϲ� ��ü 3���� �����Ǿ� ����ȭ�� ������ ȿ���� ����.
		t1.start(); t2.start(); t3.start();
	}
}