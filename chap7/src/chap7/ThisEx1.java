package chap7;
/*
 * this ����� ����
 * 
 * this() ������ : ���� Ŭ������ �ٸ� �����ڸ� ȣ��
 * 				ȣ��� �������� ù �ٿ��� ȣ���
 * this �������� : �ڱ� ���� ����. �ڱ� ��ü�� �������� �����ϴ� ����
 * 				�ν��Ͻ� ����� ������ �� ����.
 * 				�ν��Ͻ� �޼����� ���������� �ڵ� ����.
 * 				�������, �ν��Ͻ� ����(������)<=>��������(���ÿ���, �������� �Ű�����) ������ ���� ��ġ�� �޶� ������ �̸��� ���Ƶ� ��.
 * 				������ ������ ������ �� ���� �̸����� �� ��� ������ �߻��ϹǷ� ���������� ��(�Ű������� ���� ��)�� ��������� �ְ� ���� �� ���
 */
class Car2 {
	String color;
	int number;
	Car2(String color, int number) {
		System.out.println("String int ������ ȣ��");
		this.color = color;
		this.number= number;
	}
	Car2() {
		this("white",1234);	//this�� �ݵ�� ù�ٿ��� ȣ��Ǿ�� ��.(println�� �ڸ��� �ٲٸ� ����)
		System.out.println("() ������ ȣ��");
	}
	Car2(String c) {
		this(c, 1234);	// => ������ �� �Ű����� String int �� �����ڸ� ȣ��.
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
