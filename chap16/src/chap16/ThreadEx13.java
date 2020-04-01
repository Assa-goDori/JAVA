package chap16;
/*
 * ������ ������, �Һ��� ������ ����
 * 
 * ������ �Ƶ��� �ϳ��� ���¸� �����Ѵ�.
 * ���¿� �ܾ��� 0�ΰ�� �Ƶ��� wait() ���·� ����ǰ�,
 * ������ ���¿� �ܾ��� 0���� ū ��� wait() ���·� ����ȴ�.
 * ������ �ܾ��� 0���� ��� 10000, 20000, 30000 �� �� �� ���� �Ա��Ѵ�.
 * �Ƶ��� �Աݵ� ��� �ܾ��� �������� �ܾ��� 0������ �����.
 * 
 * ������ 0 ~ 3000 ���� sleep �Ѵ�.
 * �Ƶ��� 1 ~ 1000 ���� sleep �Ѵ�.
 */
class Account {	// ����
	int money;
	synchronized void output() {	// Son �����尡 ȣ���ϴ� �޼���
		while(money == 0) {
			try {
				wait();		// Son ������ ������
			} catch(InterruptedException e) { }
		}
		notifyAll();
		System.out.println(Thread.currentThread().getName() + " : " + money + "�� ���");
		money = 0;
	}
	synchronized void input() {		// Mother �����尡 ȣ���ϴ� �޼���
		while(money > 0) {
			try {
				wait();
			} catch(InterruptedException e) { }
		}
		money = ((int)(Math.random()*3)+1)*10000;
		notifyAll();	// wait()������ Son �����带 ����
		System.out.println(Thread.currentThread().getName() + " : " + money + "�� �Ա�");
	}
}

class Mother extends Thread {	//������ ������
	Account account;
	Mother(Account account) {
		super("Mother");
		this.account = account;
	}
	@Override
	public void run() {
		for(int i = 0; i<20; i++) {
			try {
				sleep((int)(Math.random()*3000));	// 0~3�� ��
			} catch (InterruptedException e) { }
			account.input();
		}
	}
}

class Son extends Thread {		//�Һ��� ������
	Account account;
	Son(Account account) {
		super("Son");
		this.account = account;
	}
	@Override
	public void run() {
		for(int i = 0; i<20; i++) {
			try {
				sleep((int)(Math.random()*1000)+1);	// 0~1�� ��
			} catch (InterruptedException e) { }
			account.output();
		}
	}
}

public class ThreadEx13 {
	public static void main(String[] args) {
		Account acc = new Account();
		Thread mother = new Mother(acc);
		Thread son = new Son(acc);
		son.start(); mother.start();
	}
}