package chap7;
/*
 * 오버로딩 예제
 * 1. 동일한 클래스 내부에 같은 이름을 가진 메서드가 여러개 존재 할 수 있다.
 * 2. 단 매개변수가 달라야 한다.(자료형, 갯수, 순서) => 매개변수 이름이 다른것이 아니고 자료형이 달라야 한다.
 */
class Math3 {
	int a = 100;
	int add(int b) {
		System.out.print("1 : ");
		return a + b;
	}
	double add(double b) {
		System.out.print("2 : ");
		return a + b;
	}
	String add(String b) {
		System.out.print("3 : ");
		return a + b;
	}
}
public class OverloadingEx1 {
	public static void main(String[] args) {
		Math3 m3 = new Math3();
		System.out.println(m3.add(10));
		System.out.println(m3.add(10.5));
		System.out.println(m3.add("번"));
		System.out.println(m3.add(10l));
	}
}
