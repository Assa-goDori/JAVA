package chap8;
/*
 * Product Ŭ����
 *   ������� : ����, ����Ʈ
 *   ������ : ������ �Է¹ް�, ������ 10%�� ����Ʈ�� ����
 *   
 * Tv Ŭ����
 *   ���� : 100
 *   toString() : Tv ����
 * Computer Ŭ����
 *   ���� : 200
 *   toString() : Computer ����
 * SmartPhone Ŭ����
 *   ���� : 150
 *   toString() : SmartPhone ����
 *   
 *  Buyer Ŭ����
 *    ������� : money = 500, point
 *            Product[] cart = new Product[3];
 *            cnt;
 *    ����޼��� : void buy(Product p)
 *      1. p ��ǰ���ݸ�ŭ money ����
 *      2. p ��ǰ�� ����Ʈ��ŭ point ����
 *      3. cart�� ��ǰ�� �߰�. cnt ����
 *      4. ������ ��ǰ�� ���
 *             void summary()
 *      1. �� ������ ��ǰ�� ����, ����Ʈ ���
 *      2. ��ü ��ǰ ���űݾ� ���
 *      3. ��ü ���Ź�ǰ ��� ���
 */
class Product {
	int price;
	int point;
	Product(int price) {
		this.price = price;
		point = price/10;
	}
}
class Tv extends Product {
	Tv() {
		super(100);
	}
	public String toString() {
		return "Tv";
	}
}
class Computer extends Product {
	Computer() {
		super(200);
	}
	public String toString() {
		return "Computer";
	}
}
class SmartPhone2 extends Product {
	SmartPhone2() {
		super(150);
	}
	public String toString() {
		return "SmartPhone2";
	}
}

class Buyer {
	int money = 500;
	int point, cnt;
	Product[] cart = new Product[3];
	void buy(Product p) {
		this.money -= p.price;
		this.point += p.point;
		cart[cnt++] = p;
		System.out.println("������ ��ǰ : " + p );
	}
	void summary() {
		int sum = 0;
//		String list = "";
		for(int i =0; i<cart.length; i++) {
			System.out.println(cart[i] + " ��ǰ : ���� = " + cart[i].price +", ����Ʈ = " + cart[i].point);
			sum += cart[i].price;
//			list += cart[i] + ", ";
		}
		System.out.println("�� ��ǰ���� �ݾ� : " + sum);
//		System.out.println("�� ���Ź�ǰ ��� : " + list);
		System.out.println("�� ���Ź�ǰ ���");
		for(Product d : cart) {
			System.out.print(d + " ");
		}
	}
}
public class Exam3 {
	public static void main(String[] args) {
		Tv tv = new Tv();
		Computer cp = new Computer();
		SmartPhone2 sp2 = new SmartPhone2();
		Buyer b = new Buyer();
		System.out.println("���� �ܾ� : " + b.money);
		System.out.println("���� ����Ʈ : " + b.point);
		b.buy(tv);
		b.buy(cp);
		b.buy(sp2);
		System.out.println("���� �ܾ� : " + b.money);
		System.out.println("���� ����Ʈ : " + b.point);
		System.out.println("������ ��ǰ�� ����");
		b.summary();	// �����̸���, ����, �� ��ǰ���űݾ�, �� ��ǰ��� ����ϱ�
	}
}