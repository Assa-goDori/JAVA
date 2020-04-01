package chap10;
/*
 * 열거형 enum 예제
 */
public class EnumEx1 {
	public enum Car {
		AVANTE, SONATA, GRANDUER
	}
	public static void main(String[] args) {
		Car car = Car.AVANTE;
		System.out.println("My Car is " + car);
		System.out.println("SONATA is " + Car.SONATA);
		car = car.GRANDUER;
		if(car instanceof Object) {		// Car 클래스가 Object 클래스의 하위 클래스 인가?
			System.out.println(car.toString());
			System.out.println(car.getClass().getName());
		}
		Car[] cars = Car.values();	// 열거형 모든 객체
		for(Car c : cars) {
			System.out.println(c + " : " + c.ordinal());
		}
	}
}