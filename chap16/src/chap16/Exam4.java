package chap16;
/*
 * CarMarket 클래스 : 자동차 판매소
 *   멤버 변수 : String car;
 *   멤버 메서드
 *     synchronized void push()
 *       car = {"소나타", "SM5", "그랜저", "제네시스", "K9"} 중 한 개를 car에 저장
 *       car == null인 경우만 저장 가능함.
 *       car != null인 경우는 wait()
 *     synchronized void pop()
 *       car == null인 경우는 wait()으로 변경
 *       car != null인 경우는 "car+판매 완료"메세지 출력 후 car = null 변환
 */
class CarMarket {
	String car;
	synchronized void push() {
		while(car != null) {
			try {
				wait();
			} catch (InterruptedException e) { }
		}
		String[] cars = {"소나타", "SM5", "그랜저", "제네시스", "K9"};
		car = cars[(int)(Math.random()*cars.length)];
		notifyAll();
		System.out.println(Thread.currentThread().getName() + " : " + car + " 입고됨");
	}
	synchronized void pop() {
		while(car == null) {
			try {
				wait();
			} catch (InterruptedException e) { }
		}
		System.out.println(Thread.currentThread().getName() + ":" + car + " 판매 완료");
		car = null;
		notifyAll();
	}
}

class Producer extends Thread {
	CarMarket cm;
	Producer(CarMarket cm) {
		super("생산자");
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
		super("판매자");
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