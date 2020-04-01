package chap7;
/*
 * 메서드 구성
 * [접근제어자] 리턴타입 메서드명(매개변수 목록) => 선언부
 * {
 * 		문자들;						=> 구현부
 * }
 * 
 * 리턴타입 : 메서드 종료 후 호출한 메서드로 전달되는 값의 자료형
 * 매개변수 : 메서드를 호출시 전달되는 값의 자료형과 변수를 지정함
 * 			메서드 호출시 변수값이 초기화 됨
 * 			매개변수가 필요 없는 경우 ()로 표현함
 * return : 메서드를 종료
 * 			리턴타입이 void인 경우 생략 가능
 * 			리턴타입이 void가 아닌 경우 return 값; 이 반드시 포함되어야 함
 * 			이 때 값의 자료형은 리턴타입과 같거나 자동형변환이 가능한 값이어야 함
 */
class Math1 {
	int add1(int a, int b)		//선언부
	{
		return a+b;				//구현부
	}
	long add2(int a, int b) {return a+b;}
	double add3(int a, int b) {return a+b;}
}
public class MathEx1 {
	public static void main(String[] args) {
		Math1 m1 = new Math1();
		int a1 = m1.add1(10, 20);
		System.out.println(a1);
		long a2 = m1.add2(10, 20);
		System.out.println(a2);
		double a3 = m1.add3(10, 20);
		System.out.println(a3);
	}
}