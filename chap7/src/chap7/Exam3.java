package chap7;
/*
 * 구동 클래스를 실행 했을 때 결과가 출력되도록 SutdaCard클래스 구현하기
 * 멤버 변수는 number, isKwang 가 있다.
 * [결과]
 * 3
 * 1K
 * 
 * 
 * # Math 클래스는 객체 생성을 못하게하는 생성자가 있다.(Math생성 내부의 변수들은 모두 클래스(Static)변수임)
 */
class SutdaCard {
	int number;
	boolean isKwang;
	SutdaCard() {
		number = 1;
		isKwang = true;
	}
	SutdaCard(int a, boolean b) {
		number = a;
		isKwang = b;
	}
	
	public String toString() {
		return number + (isKwang?"K":"");
	}
}
public class Exam3 {
	public static void main(String[] args) {
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2	= new SutdaCard();
		System.out.println(card1);
		System.out.println(card2);
	}
}