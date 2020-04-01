package chap16;
/*
 * 데몬 스레드
 *   1. 일반 스레드의 보조 역할 담당함. 보통 무한 반복처리를 함.
 *   2. 일반스레드가 종료되면, 데몬 스레드도 자동으로 종료된다.
 *   3. 설정 : setDaemon(true)
 *           => New 상태에서만 설정이 가능.
 *              Runnable 상태에서 설정이 된 경우는 예외가 발생하게 된다.(IllegalThreadStateException)
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
		Thread t1 = new DaemonThread();	//메인스레드가 종료되기 전까지 무한반복으로 실행
		Thread t2 = new DaemonThread(); //데몬스레드는 실행가능한 스레드가 죽으면 실행될 수 없다.
		t1.setDaemon(true);	//데몬스레드 설정, New상태에서 설정이 되어야 함.(start이후에 설정하면 일반 병렬 스레드 실행)
		t2.setDaemon(true);
		t1.start(); t2.start();
		Thread.sleep(2000);
		System.out.println("main 메서드 종료");
	}
}