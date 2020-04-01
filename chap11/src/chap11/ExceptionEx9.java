package chap11;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * 오버라이딩 된 메서드 예외처리(같거나 좁은 범위)
 *     부모클래스 타입을 더 큰 자료형으로 봄.
 *     부모보다 더 큰 예외를 처리할 수 없다. (NullPointerException < RuntimeException < Exception)
 */
class Parent {
	void method(int i) throws RuntimeException, InterruptedException {
		System.out.println(i);
		Thread.sleep(1000);
	}
}

class Child extends Parent {
	@Override
	void method(int i) throws RuntimeException {		//부모의 예외처리 범위보다 자식의 예외처리 범위가 불가피하게 큰 경우 : try-catch 이용해서 처리한다.
		System.out.println(i/0);
		try { 
		 new FileInputStream("aaa.txt");
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
public class ExceptionEx9 {
	public static void main(String[] args) {
		
	}
}