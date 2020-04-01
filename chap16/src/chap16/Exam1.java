package chap16;
/*
 * ThreadEx3.java 소스를 Runnable 방식으로 변경하기
 * RunnablePriority 클래스 구현하기
 */

class RunnablePriority implements Runnable {
	@Override
	public void run() {
		try {
			Thread.sleep(20);
		}catch (InterruptedException e) {}
		for(int i = 0; i<50; i++) {
			System.out.println(Thread.currentThread());
		}
	}
}

public class Exam1 {
	public static void main(String[] args) {
		System.out.println("높은 우선순위 : " + Thread.MAX_PRIORITY);		//10
		System.out.println("낮은 우선순위 : " + Thread.MIN_PRIORITY);		//1
		System.out.println("기본 우선순위 : " + Thread.NORM_PRIORITY);	//5
		RunnablePriority r = new RunnablePriority();
		Thread t1 = new Thread(r, "First");
		Thread t2 = new Thread(r, "Second");
		Thread t3 = new Thread(r, "Third");
		t1.setPriority(5);
		t2.setPriority(1);
		t3.setPriority(10);
		t1.start(); t2.start(); t3.start();
	}
}