package chap16;
/*
 * 생산자 스레드, 소비자 스레드 예제
 * 
 * 엄마와 아들은 하나의 계좌를 공유한다.
 * 계좌에 잔액이 0인경우 아들은 wait() 상태로 변경되고,
 * 엄마는 계좌에 잔액이 0보다 큰 경우 wait() 상태로 변경된다.
 * 엄마는 잔액이 0원인 경우 10000, 20000, 30000 원 중 한 개만 입금한다.
 * 아들은 입금된 모든 잔액을 가져가고 잔액을 0원으로 만든다.
 * 
 * 엄마는 0 ~ 3000 동안 sleep 한다.
 * 아들은 1 ~ 1000 동안 sleep 한다.
 */
class Account {	// 계좌
	int money;
	synchronized void output() {	// Son 스레드가 호출하는 메서드
		while(money == 0) {
			try {
				wait();		// Son 스레드 대기상태
			} catch(InterruptedException e) { }
		}
		notifyAll();
		System.out.println(Thread.currentThread().getName() + " : " + money + "원 출금");
		money = 0;
	}
	synchronized void input() {		// Mother 스레드가 호출하는 메서드
		while(money > 0) {
			try {
				wait();
			} catch(InterruptedException e) { }
		}
		money = ((int)(Math.random()*3)+1)*10000;
		notifyAll();	// wait()상태의 Son 스레드를 깨움
		System.out.println(Thread.currentThread().getName() + " : " + money + "원 입금");
	}
}

class Mother extends Thread {	//생산자 스레드
	Account account;
	Mother(Account account) {
		super("Mother");
		this.account = account;
	}
	@Override
	public void run() {
		for(int i = 0; i<20; i++) {
			try {
				sleep((int)(Math.random()*3000));	// 0~3초 쉼
			} catch (InterruptedException e) { }
			account.input();
		}
	}
}

class Son extends Thread {		//소비자 스레드
	Account account;
	Son(Account account) {
		super("Son");
		this.account = account;
	}
	@Override
	public void run() {
		for(int i = 0; i<20; i++) {
			try {
				sleep((int)(Math.random()*1000)+1);	// 0~1초 쉼
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