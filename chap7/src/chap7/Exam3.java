package chap7;
/*
 * ���� Ŭ������ ���� ���� �� ����� ��µǵ��� SutdaCardŬ���� �����ϱ�
 * ��� ������ number, isKwang �� �ִ�.
 * [���]
 * 3
 * 1K
 * 
 * 
 * # Math Ŭ������ ��ü ������ ���ϰ��ϴ� �����ڰ� �ִ�.(Math���� ������ �������� ��� Ŭ����(Static)������)
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