package chap7;
/*
 * �߻�ȭ : Ŭ���� ���� ����.
 * Ŭ���� : ����� ���� �ڷ���.(User Defined Type)
 * 			�Ӽ� : ����
 * 			��� : �޼���
 */

class Phone {
	String color;
	boolean power;
	String no;
	void power() {
		power = !power;
	}
	void send(String no) {
		System.out.println(no + "�� ��ȭ �۽� ��~~~");
	}
	void recevie(String no) {
		System.out.println(no + "���� ��ȭ ���� ��~~~");
	}
}
//����Ŭ���� : main �޼��带 ������ �ִ� Ŭ����
public class PhoneEx1 {

	public static void main(String[] args) {
		Phone p1 = new Phone();		//��üȭ, �ν��Ͻ�ȭ
		p1.color ="����";
		p1.power = true;
		p1.no = "01012341234";
		System.out.println(p1.color + ", " + p1.power + ", " + p1.no);
		p1.send("01043214321");
		p1.recevie("01043214321");
		Phone p2 = new Phone();
		p2.color = "����";
		p2.power = false;
		p2.no = "01098765432";
		System.out.println(p2.color + ", " + p2.power + ", " + p2.no);
		p2 = p1;
		p1.power();		// power = false
		p1.power();		// power = true
		System.out.println(p1.color + ", " + p1.power + ", " + p1.no);
		System.out.println(p2.color + ", " + p2.power + ", " + p2.no);
		
	}

}
