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
		return "사과";
	}
}

class Peach extends Fruit {
	Peach(int price, double brix) {
		super(price, brix);
	}
	public String toString() {
		return "복숭아";
	}
}

class Cock extends Drink {
	Cock(int price, int ml) {
		super(price, ml);
	}
	public String toString() {
		return "콜라";
	}
}

class Sidar extends Drink {
	Sidar(int price, int ml) {
		super(price, ml);
	}
	public String toString() {
		return "사이다";
	}
}

class Biscuit extends Snack {
	Biscuit(int price, int gram) {
		super(price, gram);
	}
	public String toString() {
		return "비스킷";
	}
}

class Cookie extends Snack {
	Cookie(int price, int gram) {
		super(price, gram);
	}
	public String toString() {
		return "쿠키";
	}
}

class Buyer2 {
	int money = 10000, point, cnt;
	Food[] cart = new Food[100];
	void buy(Food f) {
		if(f.price > money) {
			System.out.println(f + " 구입시 잔액부족");
			return;		//메서드 종료
		} else {
			money -= f.price;
			point += f.point;
			cart[cnt++] = f;
			System.out.println(f + "을 " +  f.price + "원에 구입");
		}
	}
	void summary() {
		int total = 0, ftotal = 0, dtotal = 0, stotal = 0;
		String list = "", flist = "", dlist = "", slist = "";
		for(int i = 0; i<cnt; i++) {
			total += cart[i].price;
			list += cart[i] + ",";
			if(cart[i] instanceof Fruit) {		//cart[i]는 객체는 Fruit 객체로 형변환이 가능한가?(부모 객체가 자식 객체로 형변환이 가능한가?)
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
		System.out.println("총 구매금액 : " + total);
		System.out.println("식품 구매 목록 : " + list);
		System.out.println("과일 구매금액 : " + ftotal + ", 구매목록 : " + flist);
		System.out.println("음료 구매금액 : " + dtotal + ", 구매목록 : " + dlist);
		System.out.println("과자 구매금액 : " + stotal + ", 구매목록 : " + slist);
//		int sum = 0;
//		int f = 0, d = 0, s = 0;
//		int fCount = 0, dCount = 0, sCount = 0;
//		Food[] cart1 = new Food[10];
//		Food[] cart2 = new Food[10];
//		Food[] cart3 = new Food[10];
//		int index1 = 0, index2 = 0, index3 = 0;
//		System.out.println("\n<구매 물품 목록>");
//		for(int i = 0; i<cnt;i++) {
//			System.out.print(cart[i] + " ");
//			sum += cart[i].price;
//			if(cart[i].toString() == "사과" || cart[i].toString() == "복숭아") {
//				f++;
//				fCount += cart[i].price;
//				cart1[index1++] = cart[i];
//			} else if (cart[i].toString() == "콜라" || cart[i].toString() == "사이다") {
//				d++;
//				dCount += cart[i].price;
//				cart2[index2++] = cart[i];
//			} else {
//				s++;
//				sCount += cart[i].price;
//				cart3[index3++] = cart[i];
//			}
//		}
//		System.out.println("\n총 가격 : " + sum);
//		System.out.print("\n과일의 갯수 : " + f + ", 과일 구매 금액 : " + fCount);
//		System.out.print(", 과일 구매 목록 : ");
//		for(Food i : cart1) {
//			if(i == null) {
//				System.out.print( " ");
//			} else { 
//			System.out.print(i + " ");
//			}
//		}
//		System.out.print("\n음료의 갯수 : " + d + ", 음료 구매 금액 : " + dCount);
//		System.out.print(", 음료 구매 목록 : ");
//		for(Food i : cart2) {
//			if(i == null) {
//				System.out.print( " ");
//			} else { 
//			System.out.print(i + " ");
//			}
//		}
//		System.out.print("\n과자의 갯수 : " + s + ", 과자 구매 금액 : " + sCount);
//		System.out.print(", 과자 구매 목록 : ");
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
		Apple apple = new Apple(1000, 10.5);			//가격, 당도
		System.out.println("사과 가격 : " + apple.price);
		System.out.println("사과 당도 : " + apple.brix);
		Peach peach = new Peach(1000, 13.5);			//가격, 당도
		Cock cock = new Cock(500, 500);					//가격, 용량
		Sidar sidar = new Sidar(1500, 1000);			//가격, 용량
		Biscuit biscuit = new Biscuit(10000, 500);		//가격, 무게
		Cookie cookie = new Cookie(500, 500);			//가격, 무게
		
		Buyer2 b = new Buyer2();
		b.buy(apple);		b.buy(peach);
		b.buy(cock);		b.buy(sidar);
		b.buy(biscuit);		b.buy(cookie);
		System.out.println("고객 잔액 : " + b.money);
		System.out.println("고객 포인트 : " + b.point);
		b.summary();
	}
}