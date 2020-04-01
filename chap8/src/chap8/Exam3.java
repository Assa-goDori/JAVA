package chap8;
/*
 * Product 클래스
 *   멤버변수 : 가격, 포인트
 *   생성자 : 가격을 입력받고, 가격의 10%를 포인트로 저장
 *   
 * Tv 클래스
 *   가격 : 100
 *   toString() : Tv 리턴
 * Computer 클래스
 *   가격 : 200
 *   toString() : Computer 리턴
 * SmartPhone 클래스
 *   가격 : 150
 *   toString() : SmartPhone 리턴
 *   
 *  Buyer 클래스
 *    멤버변수 : money = 500, point
 *            Product[] cart = new Product[3];
 *            cnt;
 *    멤버메서드 : void buy(Product p)
 *      1. p 상품가격만큼 money 차감
 *      2. p 상품의 포인트만큼 point 적립
 *      3. cart에 제품을 추가. cnt 증가
 *      4. 구입한 제품을 출력
 *             void summary()
 *      1. 각 구매한 물품의 가격, 포인트 출력
 *      2. 전체 물품 구매금액 출력
 *      3. 전체 구매물품 목록 출력
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
		System.out.println("구입한 상품 : " + p );
	}
	void summary() {
		int sum = 0;
//		String list = "";
		for(int i =0; i<cart.length; i++) {
			System.out.println(cart[i] + " 상품 : 가격 = " + cart[i].price +", 포인트 = " + cart[i].point);
			sum += cart[i].price;
//			list += cart[i] + ", ";
		}
		System.out.println("총 물품구매 금액 : " + sum);
//		System.out.println("총 구매물품 목록 : " + list);
		System.out.println("총 구매물품 목록");
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
		System.out.println("고객의 잔액 : " + b.money);
		System.out.println("고객의 포인트 : " + b.point);
		b.buy(tv);
		b.buy(cp);
		b.buy(sp2);
		System.out.println("고객의 잔액 : " + b.money);
		System.out.println("고객의 포인트 : " + b.point);
		System.out.println("구매한 제품의 정보");
		b.summary();	// 물건이름과, 가격, 총 물품구매금액, 총 물품목록 출력하기
	}
}