package chap8;
/*
 * 오버 라이딩 예제
 * 
 * 오버라이딩 : 상속관계에서 발생
 *          부모클래스의 메서드를 자손클래스에서 재정의 함
 *          부모 메서드의 선언부와 자손 메서드의 선언부가 같아야 함
 *          단, 접근제어자는 넓은 범위로 가능. 예외 처리는 좁은 범위로 가능.
 */
class Bike {
	int wheel;
	Bike(int wheel) {
		this.wheel = wheel;
	}
	String drive() {
		return "페달을 밟는다";
	}
	String stop() {
		return "브레이크를 잡는다";
	}
}

class AutoBike extends Bike {
	boolean power;
	AutoBike(int wheel) {
		super(wheel);	// 자손클래스의 생성자의 첫 줄에 작성되어야 함
	}
	void power() {
		power = !power;
	}
	@Override	//어노테이션. 오버라이딩 되어 구현된 것인지 판단
	String drive() {
		return "출발 버튼을 누른다";
	}
	@Override
	String stop() {
		return "정지 버튼을 누른다";
	}
	
}

public class BikeEx1 {
	public static void main(String[] args) {
		AutoBike ab = new AutoBike(2);
		System.out.println(ab.drive());
		System.out.println(ab.stop());
	}
}