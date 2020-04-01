package chap16;
/*
 * 동기화 : synchronized 예약어로 표현한다.
 *   동기화블럭 : ThreadEx9.java
 *            lock 객체를 소유한 스레드만 동기화 영역을 실행할 수 있음.
 *            lock은 객체여야 함. 기본자료형은 lock으로 사용할 수 없다.
 *            lock 객체는 유일해야 함. 모든 스레드가 공유하는 공유객체여야 한다.
 *   동기화메서드 : ThreadEx10.java
 */
class PrintThread2 extends Thread {
	char ch;
	static Object lock = new Object();	// lock은 반드시 공유 객체이여야 함(static)
//	static int lock = 0;	// 기본형은 lock 사용 불가
//	static Integer lock = 0;	// Integer는 객체이므로 사용 가능
//	static int[] lock = {};		// 배열도 객체이므로 사용 가능
	
	PrintThread2(char ch) {
		this.ch = ch;
	}
	@Override
	public void run() {
		for(int i = 0; i<20; i++) {
			synchronized(lock) {	// (동기화 블럭) t1이 선점 -> lock pool 대기 중인 t2가 lock 선점 -> ...
				for(int j = 0; j<80; j++) {
					System.out.print(ch);	//AAAA.....AAAA..... (80개를 다 찍을때까지 다른 스레드가 관여 못함)
				}
				System.out.println();
			}	// t1이 lock 반환 -> t2 lock 반환 -> ...
		}
	}
}
public class ThreadEx9 {
	public static void main(String[] args) {
		PrintThread2 t1 = new PrintThread2('A');	// running -> 이후 lock pool 대기 -> ...
		PrintThread2 t2 = new PrintThread2('B');	// lock pool 대기 -> 이후 running -> ...
		PrintThread2 t3 = new PrintThread2('C');	// lock pool 대기 -> ...
		t1.start(); t2.start(); t3.start();
	}
}