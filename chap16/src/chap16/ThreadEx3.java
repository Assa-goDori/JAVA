package chap16;
/*
 * 우선순위가 높다고해서 무조건적으로 스케쥴러의 선택을 받는 것은 아님-> 확률상으로 높음
 */
class ThreadPriority extends Thread {
	ThreadPriority(String name, int p) {
		super(name);	//스레드 이름 설정
		setPriority(p);	//우선순위 설정(1~10)
	}
	public void run() {
		try {
			sleep(20);
		} catch (InterruptedException e) { }
		for(int i = 0; i<50; i++) {
			//this : ThreadPriority 객체(toString 메서드 미구현)
			//       -> Thread클래스의 toString메서드가 최종 오버라이딩됨 : Thread[스레드이름, 우선순위, 스레드그룹]
			System.out.println(this);
		}
	}
}
public class ThreadEx3 {
	public static void main(String[] args) {
		System.out.println("높은 우선순위 : " + Thread.MAX_PRIORITY);		//10
		System.out.println("낮은 우선순위 : " + Thread.MIN_PRIORITY);		//1
		System.out.println("기본 우선순위 : " + Thread.NORM_PRIORITY);	//5
		Thread t1 = new ThreadPriority("First", 5);
		Thread t2 = new ThreadPriority("Second", 1);
		Thread t3 = new ThreadPriority("Third", 10);
		t1.start(); t2.start(); t3.start();
	}
}