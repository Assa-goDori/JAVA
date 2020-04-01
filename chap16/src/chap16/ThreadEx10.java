package chap16;
/*
 * 동기화 영역
 *   동기화 블럭 : ThreadEx9.java
 *   동기화 메서드 : ThreadEx10.java
 *     1. 공유 객체의 메서드이어야 함.
 *       -> 공유 객체 : 모든 스레드가 하나의 객체를 공유하고 있는 객체
 */
class Printer {	//공유 객체
	public synchronized void printChar(char ch) { //동기화 메서드(스레드에 대해서 safe하다)
		for(int i = 0; i<80; i++) {
			System.out.print(ch);
		}
		System.out.println();
	}
}

class PrintThread3 extends Thread {
	Printer ptr;
	char ch;
	PrintThread3(Printer ptr, char ch) {
		this.ptr = ptr;
		this.ch = ch;
	}
	@Override
	public void run() {
		for(int i = 0; i<20; i++) {
			ptr.printChar(ch);
		}
	}
}

public class ThreadEx10 {
	public static void main(String[] args) {
		Printer ptr = new Printer();	//공유 객체 생성
		PrintThread3 t1 = new PrintThread3(ptr, 'A');
		PrintThread3 t2 = new PrintThread3(ptr, 'B');
		PrintThread3 t3 = new PrintThread3(ptr, 'C');
//		PrintThread3 t1 = new PrintThread3(new Printer(), 'A');
//		PrintThread3 t2 = new PrintThread3(new Printer(), 'B');
//		PrintThread3 t3 = new PrintThread3(new Printer(), 'C');	//공유객체가 아닌 일반 객체 3개가 생성되어 동기화는 되지만 효과가 없다.
		t1.start(); t2.start(); t3.start();
	}
}