package chap8;
/*
 * ��ӿ���
 * 
 * 1. �ڼ� Ŭ���� ��ü ������ �θ� Ŭ���� ��ü�� ���� �����Ѵ�.
 * 2. �ڼ� ��ü�� �θ� ��ü�� ����� ������ �����ϴ�.
 * 3. Ŭ���� ���� ����� ���� ��Ӹ� �����ϴ�.
 *    �ڼ� Ŭ������ �θ� Ŭ������ �Ѱ��� �����ϴ�.
 * 4. ��� Ŭ������ objectŬ������ ��� �޴´�.(�����Ϸ��� �ڵ������� �Է�)
 *    ��� Ŭ������ ��ü�� object ��ü�� �����Ѵ�.
 *    ��� Ŭ������ ��ü�� object ����� ������ �����ϴ�.	ex) toString() �޼���
 */
class Phone {
	boolean power;
	int number;
	void power() {
		power = !power;
	}
	void send() {
		if(power)
			System.out.println("��ȭ�ɱ�");
	}
	void receive() {
		if(power)
			System.out.println("��ȭ�ޱ�");
	}
}

class SmartPhone extends Phone {
	void setApp(String name) {
	if(power)
		System.out.println(name + " ��ġ ��");
	}
}

public class PhoneEx1 {
	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		sp.power = true;
		sp.send();
		sp.receive();
		sp.setApp("���̹�");
	}
}
