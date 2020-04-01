package chap16;
/*
 * Runnable 인터페이스를 구현하여 스레드 생성하기
 */
class Runnable1 implements Runnable {  //Thread 클래스 아님. Runnable 인터페이스의 구현클래스임.
	@Override
	public void run() {
		for(int i = 0; i<5; i++) {
			//Thread.currentThread() : 지금 현재 Running 상태의 스레드
			System.out.println(i + "=" + Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) { }
		}
	}
}

public class ThreadEx2 {
	public static void main(String[] args) {
		System.out.println("main 스레드 시작");
		Runnable1 r = new Runnable1();		// 스레드가 아니므로 New 상태가 아님
		//r.run() 메서드를 실행하고, 이름이 First인 Thread 객체 생성
		Thread t1 = new Thread(r, "First");	//t1의 New 상태
		Thread t2 = new Thread(r, "Second");//t2의 New 상태
		t1.start();
		t2.start();
//		t1.run(); // r.run() 실행됨
//		t2.run();
		System.out.println("main 스레드 종료");
	}
}