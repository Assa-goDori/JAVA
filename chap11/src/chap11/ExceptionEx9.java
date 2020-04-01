package chap11;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * �������̵� �� �޼��� ����ó��(���ų� ���� ����)
 *     �θ�Ŭ���� Ÿ���� �� ū �ڷ������� ��.
 *     �θ𺸴� �� ū ���ܸ� ó���� �� ����. (NullPointerException < RuntimeException < Exception)
 */
class Parent {
	void method(int i) throws RuntimeException, InterruptedException {
		System.out.println(i);
		Thread.sleep(1000);
	}
}

class Child extends Parent {
	@Override
	void method(int i) throws RuntimeException {		//�θ��� ����ó�� �������� �ڽ��� ����ó�� ������ �Ұ����ϰ� ū ��� : try-catch �̿��ؼ� ó���Ѵ�.
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