package chap7;
/*
 * 클래스 변수, 인스턴스 변수 예제
 * 
 * #선언위치에 따른 변수의 종류#
 * 			선언 위치		선언방법						메모리할당시기		메모리할당위치
 * 클래스변수	클래스 내부		static int cv;				클래스 정보가 로드시	클래스영역
 * 			=> 객체화와 별개. 모든 객체의 공통변수
 * 			=> 클래스명.변수명 사용
 * 인스턴스변수	클래스 내부		int iv;						객체화시			힙영역
 * 			=> 반드시 객체화 되어야 사용
 * 			=> 참조변수명.변수명 사용
 * 지역변수	메서드 내부		int lv;(static이 붙을 수 없음)	선언문이 실행시		스택(메서드실행)영역
 * 			=> 변수명 사용
 * 			=> 반드시 초기화 되야함
 * 			=> 매개변수도 지역변수임
 */
class Sonata {
	String color;				//인스턴스 변수(객체 변수)
	int number;					//인스턴스 변수(객체 변수)
	static int width = 250;		//클래스 변수
	static int height = 150;	//클래스 변수
	public String toString() {
		return color + ":" + number + "(" + width + ", " + height + ")";
	}
}
public class SonataEx1 {
	public static void main(String[] args) {
		System.out.println("자동차 크기 : " + Sonata.width + ", " + Sonata.height);		//클래스 변수는 가능
		//System.out.println(Sonata.color);			인스턴스 변수는 불가능
		Sonata car1 = new Sonata();
		car1.color = "white";
		car1.number = 1234;
		System.out.println("car1:" + car1);
		Sonata car2 = new Sonata();
		car2.color = "black";
		car2.number = 2345;
		System.out.println("car2:" + car2);
		car1.width = 300;
		car1.height = 200;
		System.out.println("car1:" + car1);
		System.out.println("car2:" + car2);
 	}

}
