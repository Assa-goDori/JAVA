package chap16;
/*
 * Thread 예제 1
 * Thread 생성
 *   1. Thread 클래스 상속 => ThreadEx1.java
 *   2. Runnable 인터페이스 구현 => ThreadEx2.java
 */
class Thread1 extends Thread {	//Thread 클래스
	Thread1(String name) {
		super(name);
	}
 
	public void run() {		// 스케쥴러에 의해 선택된 스레드의 Running 상태
		for (int i = 0; i < 5; i++) {
			System.out.println(i + "=" + getName());	// getName() : 스레드 이름
			try {
				sleep(1000);	// 1초 대기, 대기 상태 이후 Runnable 상태로 변환
			} catch (InterruptedException e) {}
		}
	}	// Dead 상태, Thread 종료
}

public class ThreadEx1 {
	public static void main(String[] args) {	// main도 스레드
		System.out.println("main 스레드 시작");
		Thread1 t1 = new Thread1("First");		//New 상태
		Thread1 t2 = new Thread1("Second");		//New 상태
		t1.start();		// start()에 의해 Runnable 상태	
		t2.start();		// start()에 의해 Runnable 상태
		/*
		 * start() 메서드 기능
		 *   1. 스택 영역을 병렬화 함
		 *   2. 병렬화한 스택에 run() 메서드 호출함.
		 */
//		t1.run();
//		t2.run();
		System.out.println("main 스레드 종료");
	}	// main, t1, t2 3개의 스레드가 모두 종료되어야 프로세스가 종료될 수 있다.
}