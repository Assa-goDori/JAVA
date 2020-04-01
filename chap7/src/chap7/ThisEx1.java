package chap7;
/*
 * this 예약어 예제
 * 
 * this() 생성자 : 같은 클래스의 다른 생성자를 호출
 * 				호출시 생성자의 첫 줄에서 호출됨
 * this 참조변수 : 자기 참조 변수. 자기 객체의 참조값을 저장하는 변수
 * 				인스턴스 멤버를 참조할 때 사용됨.
 * 				인스턴스 메서드의 지역변수로 자동 선언.
 * 				멤버변수, 인스턴스 변수(힙영역)<=>지역변수(스택영역, 생성자의 매개변수) 변수의 저장 위치가 달라서 변수의 이름은 같아도 됨.
 * 				하지만 변수를 지정할 때 같은 이름으로 할 경우 에러가 발생하므로 지역변수의 값(매개변수로 받은 값)을 멤버변수에 넣고 싶을 때 사용
 */
class Car2 {
	String color;
	int number;
	Car2(String color, int number) {
		System.out.println("String int 생성자 호출");
		this.color = color;
		this.number= number;
	}
	Car2() {
		this("white",1234);	//this는 반드시 첫줄에서 호출되어야 함.(println과 자리를 바꾸면 에러)
		System.out.println("() 생성자 호출");
	}
	Car2(String c) {
		this(c, 1234);	// => 생성자 중 매개변수 String int 인 생성자를 호출.
	}
	public String toString() {
		return color + ", " + number;
	}
}
public class ThisEx1 {
	public static void main(String[] args) {
		Car2 c1 = new Car2();
		Car2 c2 = new Car2("blue", 1234);
		Car2 c3 = new Car2("Red");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}
}
