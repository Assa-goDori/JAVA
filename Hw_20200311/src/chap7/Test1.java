package chap7;

class Card {
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
	//toString() 메서드 : 객체의 문자열화에 관여하는 메서드
	public String toString() {
		return kind + " : " + number + "(" + width + ", " + height + ")";
	}
}
public class Test1 {
	public static void main(String[] args) {
		Card card1 = new Card();
		card1.kind = "Heart";
		card1.number = 1;
		System.out.println(card1);
		Card card2 = new Card();
		card2.kind = "Spade";
		card2.number = 1;
		System.out.println(card2);
		Card.width = 50;
		Card.height = 80;
		System.out.println(card1);
		System.out.println(card2);
	}
}
