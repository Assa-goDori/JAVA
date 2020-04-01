package chap7;
/*
 * 생성자 예제
 * 
 * 생성자란?
 * 객체화시 호출 되는 메서드
 * 생성자 없이 객체의 생성은 불가능
 * 기능 : 인스턴스 변수의 초기화 담당
 * 
 * 생성자 구현
 * 1. 생성자의 이름은 클래스명과 같다.
 * 2. 리턴타입이 없다.
 * 
 * 기본 생성자
 * 클래스 내부에 생성자가 없으면  컴파일러가 추가해주는 생성자
 * public 클래스명() { };
 */
class Number1 {				// 기본 생성자 제공
	int num;
}
class Number2 {				// 기본 생성자 제공 안됨
	int num;
	Number2(int x) {		// 생성자
		num = x;
	}
}
public class ConstructorEx1 {
	public static void main(String[] args) {
		Number1 n1= new Number1();
		/*
		 * new 예약어 기능
		 * 1. 메모리 할당
		 * 2. 변수들을 기본값으로 초기화
		 *		숫자 : 0, 논리형 : false, 문자열 : null
		 * 3. 생성자 호출(생성자는 따로 메모리 부여 x)	Number1() 생성자
		 */
		n1.num = 10;
		Number2 n2 = new Number2(100);
		System.out.println("Number1 클래스의 num = " + n1.num);
		System.out.println("Number2 클래스의 num = " + n2.num);
	}
}
