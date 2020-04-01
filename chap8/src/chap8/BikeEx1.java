package chap8;
/*
 * ���� ���̵� ����
 * 
 * �������̵� : ��Ӱ��迡�� �߻�
 *          �θ�Ŭ������ �޼��带 �ڼ�Ŭ�������� ������ ��
 *          �θ� �޼����� ����ο� �ڼ� �޼����� ����ΰ� ���ƾ� ��
 *          ��, ���������ڴ� ���� ������ ����. ���� ó���� ���� ������ ����.
 */
class Bike {
	int wheel;
	Bike(int wheel) {
		this.wheel = wheel;
	}
	String drive() {
		return "����� ��´�";
	}
	String stop() {
		return "�극��ũ�� ��´�";
	}
}

class AutoBike extends Bike {
	boolean power;
	AutoBike(int wheel) {
		super(wheel);	// �ڼ�Ŭ������ �������� ù �ٿ� �ۼ��Ǿ�� ��
	}
	void power() {
		power = !power;
	}
	@Override	//������̼�. �������̵� �Ǿ� ������ ������ �Ǵ�
	String drive() {
		return "��� ��ư�� ������";
	}
	@Override
	String stop() {
		return "���� ��ư�� ������";
	}
	
}

public class BikeEx1 {
	public static void main(String[] args) {
		AutoBike ab = new AutoBike(2);
		System.out.println(ab.drive());
		System.out.println(ab.stop());
	}
}