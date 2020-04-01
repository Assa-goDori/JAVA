package chap12;
/*
 * hashcode : 원래의 hashcode는 JVM이 객체를 구별하기 위한 정수형 참조값임.
 *            하지만, 내용이 같은 경우 같은 hashcode 값을 가지도록 오버라이딩 필요함.
 *            
 * 자바에서 내용 비교를 위하여 equals 메서드를 오버라이딩 하는 경우 hashcode 메서드도 함께 오버라이딩 하는 것을 권장함.
 */
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

public class HashCodeEx1 {
	public static void main(String[] args) {
		String s1 = new String("abc");
		String s2 = new String("abc");
		if(s1==s2) System.out.println("s1과 s2는 같은 객체입니다.");
		else System.out.println("s1과 s2는 다른 객체입니다.");
		System.out.println(s1.hashCode());		//String 클래스에서 hashcode 메서드를 오버라이딩 함
		System.out.println(s2.hashCode());		//내용이 같은 경우 같은 hashcode 리턴
		System.out.println("s1 객체의 진짜 해쉬값 : " + System.identityHashCode(s1));
		System.out.println("s2 객체의 진짜 해쉬값 : " + System.identityHashCode(s2));
		System.out.println("==============================");
		Card c1 = new Card("Spade", 1);
		Card c2 = new Card("Spade", 1);
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println("c1 객체의 진짜 해쉬값 : " + System.identityHashCode(c1));
		System.out.println("c2 객체의 진짜 해쉬값 : " + System.identityHashCode(c2));
	}
}