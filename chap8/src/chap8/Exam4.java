package chap8;

class Food {
	int price, point;
	Food(int price) {
		this.price = price;
		point = price/10;
	}
}

class Fruit extends Food {
	double brix;
	Fruit(int price, double brix) {
		super(price);
		this.brix = brix;
	}
}

class Drink extends Food {
	int ml;
	Drink(int price, int ml) {
		super(price);
		this.ml = ml;
	}
}

class Snack extends Food {
	int gram;
	Snack(int price, int gram) {
		super(price);
		this.gram = gram;
	}
}

class Apple extends Fruit {
	Apple(int price, double brix) {
		super(price, brix);
	}
	public String toString() {
		return "���";
	}
}

class Peach extends Fruit {
	Peach(int price, double brix) {
		super(price, brix);
	}
	public String toString() {
		return "������";
	}
}

class Cock extends Drink {
	Cock(int price, int ml) {
		super(price, ml);
	}
	public String toString() {
		return "�ݶ�";
	}
}

class Sidar extends Drink {
	Sidar(int price, int ml) {
		super(price, ml);
	}
	public String toString() {
		return "���̴�";
	}
}

class Biscuit extends Snack {
	Biscuit(int price, int gram) {
		super(price, gram);
	}
	public String toString() {
		return "��Ŷ";
	}
}

class Cookie extends Snack {
	Cookie(int price, int gram) {
		super(price, gram);
	}
	public String toString() {
		return "��Ű";
	}
}

class Buyer2 {
	int money = 10000, point, cnt;
	Food[] cart = new Food[100];
	void buy(Food f) {
		if(f.price > money) {
			System.out.println(f + " ���Խ� �ܾ׺���");
			return;		//�޼��� ����
		} else {
			money -= f.price;
			point += f.point;
			cart[cnt++] = f;
			System.out.println(f + "�� " +  f.price + "���� ����");
		}
	}
	void summary() {
		int total = 0, ftotal = 0, dtotal = 0, stotal = 0;
		String list = "", flist = "", dlist = "", slist = "";
		for(int i = 0; i<cnt; i++) {
			total += cart[i].price;
			list += cart[i] + ",";
			if(cart[i] instanceof Fruit) {		//cart[i]�� ��ü�� Fruit ��ü�� ����ȯ�� �����Ѱ�?(�θ� ��ü�� �ڽ� ��ü�� ����ȯ�� �����Ѱ�?)
				ftotal += cart[i].price;
				flist += cart[i] + ", ";
			}
			if(cart[i] instanceof Drink) {
				dtotal += cart[i].price;
				dlist += cart[i] + ", ";
			}
			if(cart[i] instanceof Snack) {
				stotal += cart[i].price;
				slist += cart[i] + ", ";
			}
		}
		System.out.println("�� ���űݾ� : " + total);
		System.out.println("��ǰ ���� ��� : " + list);
		System.out.println("���� ���űݾ� : " + ftotal + ", ���Ÿ�� : " + flist);
		System.out.println("���� ���űݾ� : " + dtotal + ", ���Ÿ�� : " + dlist);
		System.out.println("���� ���űݾ� : " + stotal + ", ���Ÿ�� : " + slist);
//		int sum = 0;
//		int f = 0, d = 0, s = 0;
//		int fCount = 0, dCount = 0, sCount = 0;
//		Food[] cart1 = new Food[10];
//		Food[] cart2 = new Food[10];
//		Food[] cart3 = new Food[10];
//		int index1 = 0, index2 = 0, index3 = 0;
//		System.out.println("\n<���� ��ǰ ���>");
//		for(int i = 0; i<cnt;i++) {
//			System.out.print(cart[i] + " ");
//			sum += cart[i].price;
//			if(cart[i].toString() == "���" || cart[i].toString() == "������") {
//				f++;
//				fCount += cart[i].price;
//				cart1[index1++] = cart[i];
//			} else if (cart[i].toString() == "�ݶ�" || cart[i].toString() == "���̴�") {
//				d++;
//				dCount += cart[i].price;
//				cart2[index2++] = cart[i];
//			} else {
//				s++;
//				sCount += cart[i].price;
//				cart3[index3++] = cart[i];
//			}
//		}
//		System.out.println("\n�� ���� : " + sum);
//		System.out.print("\n������ ���� : " + f + ", ���� ���� �ݾ� : " + fCount);
//		System.out.print(", ���� ���� ��� : ");
//		for(Food i : cart1) {
//			if(i == null) {
//				System.out.print( " ");
//			} else { 
//			System.out.print(i + " ");
//			}
//		}
//		System.out.print("\n������ ���� : " + d + ", ���� ���� �ݾ� : " + dCount);
//		System.out.print(", ���� ���� ��� : ");
//		for(Food i : cart2) {
//			if(i == null) {
//				System.out.print( " ");
//			} else { 
//			System.out.print(i + " ");
//			}
//		}
//		System.out.print("\n������ ���� : " + s + ", ���� ���� �ݾ� : " + sCount);
//		System.out.print(", ���� ���� ��� : ");
//		for(Food i : cart3) {
//			if(i == null) {
//				System.out.print( " ");
//			} else { 
//			System.out.print(i + " ");
//			}
//		}
	}
}

public class Exam4 {
	public static void main(String[] args) {
		Apple apple = new Apple(1000, 10.5);			//����, �絵
		System.out.println("��� ���� : " + apple.price);
		System.out.println("��� �絵 : " + apple.brix);
		Peach peach = new Peach(1000, 13.5);			//����, �絵
		Cock cock = new Cock(500, 500);					//����, �뷮
		Sidar sidar = new Sidar(1500, 1000);			//����, �뷮
		Biscuit biscuit = new Biscuit(10000, 500);		//����, ����
		Cookie cookie = new Cookie(500, 500);			//����, ����
		
		Buyer2 b = new Buyer2();
		b.buy(apple);		b.buy(peach);
		b.buy(cock);		b.buy(sidar);
		b.buy(biscuit);		b.buy(cookie);
		System.out.println("�� �ܾ� : " + b.money);
		System.out.println("�� ����Ʈ : " + b.point);
		b.summary();
	}
}