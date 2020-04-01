package chap10;
/*
 * ������ enum ����
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
		if(car instanceof Object) {		// Car Ŭ������ Object Ŭ������ ���� Ŭ���� �ΰ�?
			System.out.println(car.toString());
			System.out.println(car.getClass().getName());
		}
		Car[] cars = Car.values();	// ������ ��� ��ü
		for(Car c : cars) {
			System.out.println(c + " : " + c.ordinal());
		}
	}
}