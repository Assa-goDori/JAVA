package chap11;
class MyException2 extends Exception {}
class MyException3 extends MyException2 {}

public class Exam4 {
	public static void main(String[] agrs) {
		try {
			throw new MyException3();
		} catch(MyException2 e) {
			System.out.println("MyException2 ����ó��");
		} catch(Exception e) {
			System.out.println("Exception ����ó��");
		}
	}
}