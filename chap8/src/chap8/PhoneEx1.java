package chap8;
/*
 * 상속예제
 * 
 * 1. 자손 클래스 객체 생성시 부모 클래스 객체를 먼저 생성한다.
 * 2. 자손 객체는 부모 객체의 멤버에 접근이 가능하다.
 * 3. 클래스 간의 상속은 단일 상속만 가능하다.
 *    자손 클래스의 부모 클래스는 한개만 가능하다.
 * 4. 모든 클래스는 object클래스를 상속 받는다.(컴파일러가 자동적으로 입력)
 *    모든 클래스의 객체는 object 객체를 포함한다.
 *    모든 클래스의 객체는 object 멤버에 접근이 가능하다.	ex) toString() 메서드
 */
class Phone {
	boolean power;
	int number;
	void power() {
		power = !power;
	}
	void send() {
		if(power)
			System.out.println("전화걸기");
	}
	void receive() {
		if(power)
			System.out.println("전화받기");
	}
}

class SmartPhone extends Phone {
	void setApp(String name) {
	if(power)
		System.out.println(name + " 설치 중");
	}
}

public class PhoneEx1 {
	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		sp.power = true;
		sp.send();
		sp.receive();
		sp.setApp("네이버");
	}
}
