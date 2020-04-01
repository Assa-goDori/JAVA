package chap16;
/*
 * wait(), notify(), notifyAll()
 *   1. 반드시 동기화 영역(동기화 블럭, 동기화 메서드)에서만 호출이 가능하다.
 *   2. Object 클래스의 멤버 메서드
 *      => 모든 클래스의 객체는 메서드 호출 가능.
 *   3. wait() : 동기화 상태에서 대기 상태로 전환(lock 해제). notify()나 notifyAll() 메서드에 의해서 실행 가능상태로 전환됨
 *      notify() : wait() 상태에 있는 스레드 중 한 개만 실행 가능 상태로 전환
 *                 개발자가 지정할 수 없다.
 *      notifyAll() : wait() 상태에 있는 모든 스레드를 실행 가능 상태로 전환
 */
class ATM2 implements Runnable {
	private int money = 100000;
	public void run() {
		synchronized(this) {
			while(true) {
				if(money <= 0) {
					System.out.println("잔액이 없습니다.");
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
		System.out.println(Thread.currentThread().getName() + "출금, 잔액 : " + money);
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