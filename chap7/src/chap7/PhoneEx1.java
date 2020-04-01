package chap7;
/*
 * 추상화 : 클래스 생성 과정.
 * 클래스 : 사용자 정의 자료형.(User Defined Type)
 * 			속성 : 변수
 * 			기능 : 메서드
 */

class Phone {
	String color;
	boolean power;
	String no;
	void power() {
		power = !power;
	}
	void send(String no) {
		System.out.println(no + "로 전화 송신 중~~~");
	}
	void recevie(String no) {
		System.out.println(no + "에서 전화 수신 중~~~");
	}
}
//구동클래스 : main 메서드를 가지고 있는 클래스
public class PhoneEx1 {

	public static void main(String[] args) {
		Phone p1 = new Phone();		//객체화, 인스턴스화
		p1.color ="검정";
		p1.power = true;
		p1.no = "01012341234";
		System.out.println(p1.color + ", " + p1.power + ", " + p1.no);
		p1.send("01043214321");
		p1.recevie("01043214321");
		Phone p2 = new Phone();
		p2.color = "빨강";
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
