package chap8;
/*
 * final 변수 : 변경 불가 변수. 상수
 * 
 * final 변수도 생성자에서 한번은 값을 변경 할 수 있다. => 객체 별로 다른 상수 값을 가질수 있도록 하기 위해
 * => 단, 명시적 초기화가 안된 경우만 가능함. 명시적 초기화가 된 경우는 생성자에서도 초기화 안됨 ex) final int x = 10;
 */
class FinalValue {
	final int NUM;
	FinalValue(int num) {
		NUM = num;
	}
	public int getNUM() {
		return NUM;
	}
}
public class FinalValueEx1 {
	public static void main(String[] args) {
		FinalValue f1 = new FinalValue(10);
		System.out.println(f1.getNUM());
//		f1.NUM = 100;	// 상수는 변경 불가.
		FinalValue f2 = new FinalValue(20);
		System.out.println(f2.getNUM());
	}
}