package chap12;
/*
 * hashcode : ������ hashcode�� JVM�� ��ü�� �����ϱ� ���� ������ ��������.
 *            ������, ������ ���� ��� ���� hashcode ���� �������� �������̵� �ʿ���.
 *            
 * �ڹٿ��� ���� �񱳸� ���Ͽ� equals �޼��带 �������̵� �ϴ� ��� hashcode �޼��嵵 �Բ� �������̵� �ϴ� ���� ������.
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
		if(s1==s2) System.out.println("s1�� s2�� ���� ��ü�Դϴ�.");
		else System.out.println("s1�� s2�� �ٸ� ��ü�Դϴ�.");
		System.out.println(s1.hashCode());		//String Ŭ�������� hashcode �޼��带 �������̵� ��
		System.out.println(s2.hashCode());		//������ ���� ��� ���� hashcode ����
		System.out.println("s1 ��ü�� ��¥ �ؽ��� : " + System.identityHashCode(s1));
		System.out.println("s2 ��ü�� ��¥ �ؽ��� : " + System.identityHashCode(s2));
		System.out.println("==============================");
		Card c1 = new Card("Spade", 1);
		Card c2 = new Card("Spade", 1);
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println("c1 ��ü�� ��¥ �ؽ��� : " + System.identityHashCode(c1));
		System.out.println("c2 ��ü�� ��¥ �ؽ��� : " + System.identityHashCode(c2));
	}
}