package chap12;
class Card {
	String kind;
	int num;
	Card() {
		this("Spade", 1);
	}
	Card(String kind, int num) {
		this.kind = kind; 
		this.num = num;
	}
	@Override
	public boolean equals(Object o) {
		if(o instanceof Card) {
			Card c = (Card)o;
			return kind == c.kind && num == c.num;
		} else {
			return false;
		}
	}
	public String toString() {
		return "(" + kind + ", " + num + ")";
	}
}
public class Test1 {
	public static void main(String[] args) {
		Card c1 = new Card("Spade", 1);
		Card c2 = new Card();
		if(c1 == c2) {
			System.out.println("c1과 c2는 같은 객체입니다.");
		} else {
			System.out.println("c1과 c2는 다른 객체입니다.");
		}
		if(c1.equals(c2)) {
			System.out.println("c1과 c2는 같은 내용의 카드입니다.");
		} else {
			System.out.println("c1과 c2는 다른 내용의 카드입니다.");
		}
		System.out.println("c1 카드 : " + c1);
		System.out.println("c2 카드 : " + c2);
	}
}