package chap16;
/*
 * CarMarket Ŭ���� : �ڵ��� �Ǹż�
 *   ��� ���� : String car;
 *   ��� �޼���
 *     synchronized void push()
 *       car = {"�ҳ�Ÿ", "SM5", "�׷���", "���׽ý�", "K9"} �� �� ���� car�� ����
 *       car == null�� ��츸 ���� ������.
 *       car != null�� ���� wait()
 *     synchronized void pop()
 *       car == null�� ���� wait()���� ����
 *       car != null�� ���� "car+�Ǹ� �Ϸ�"�޼��� ��� �� car = null ��ȯ
 */
class CarMarket {
	String car;
	synchronized void push() {
		while(car != null) {
			try {
				wait();
			} catch (InterruptedException e) { }
		}
		String[] cars = {"�ҳ�Ÿ", "SM5", "�׷���", "���׽ý�", "K9"};
		car = cars[(int)(Math.random()*cars.length)];
		notifyAll();
		System.out.println(Thread.currentThread().getName() + " : " + car + " �԰��");
	}
	synchronized void pop() {
		while(car == null) {
			try {
				wait();
			} catch (InterruptedException e) { }
		}
		System.out.println(Thread.currentThread().getName() + ":" + car + " �Ǹ� �Ϸ�");
		car = null;
		notifyAll();
	}
}

class Producer extends Thread {
	CarMarket cm;
	Producer(CarMarket cm) {
		super("������");
		this.cm = cm;
	}
	public void run() {
		for(int i = 0 ; i<10; i++) {
			cm.push();
			try {
				sleep((int)(Math.random()*5000));
			} catch (InterruptedException e) { }
		}
	}
}

class Seller extends Thread {
	CarMarket cm;
	Seller(CarMarket cm) {
		super("�Ǹ���");
		this.cm = cm;
	}
	public void run() {
		for(int i = 0; i<10; i++) {
			cm.pop();
			try {
				sleep((int)(Math.random()*2000));
			} catch (InterruptedException e) { }
		}
	}
}
public class Exam4 {
	public static void main(String[] args) {
		CarMarket cm = new CarMarket();
		Thread seller = new Seller(cm);
		Thread producer = new Producer(cm);
		seller.start(); producer.start();
	}
}