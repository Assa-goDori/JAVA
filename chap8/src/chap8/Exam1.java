package chap8;
/*
 * SutdaDeck 클래스 구현하기
 *   멤버변수: cards : SutdaCard 20장을 저장할 배열
 *   생성자: SutdaCard 20장을 생성하여 cards 배열에 저장
 *   메서드: toString() : 오버라이딩하여 결과가 출력되도록 구현
 *         shuffle() : cards 20장의 카드를 섞기
 *         SutdaCard pick(int index) : index에 해당하는 카드 한장 리턴
 *         SutdaCard pick() : 임의의 카드 한장 리턴
 */
class SutdaCard {
	int number;
	boolean isKwang;
	SutdaCard() {
		this(1, true);
	}
	SutdaCard(int number, boolean isKwang) {
		this.number = number;
		this.isKwang = isKwang;
	}
	public String toString() {
		return number + ((isKwang)?"K":"");
	}
}

class SutdaDeck {
	SutdaCard[] cards = new SutdaCard[20];
	
	SutdaDeck() {
		for(int i = 0; i<cards.length;i++) {
			cards[i] = new SutdaCard((i%10)+1, ((i==0 || i==2 || i==7)?true:false));
		}
	}
	 void shuffle() {
		for(int i = 0; i<cards.length;i++) {
			int a = (int)(Math.random()*20);
			int b = (int)(Math.random()*20);
			SutdaCard temp = cards[a];
			cards[a] = cards[b];
			cards[b] =  temp;
		}
	}
	SutdaCard pick(int index) {
		return cards[index];
	}
	SutdaCard pick() {
		int a = (int)(Math.random()*20);
		return cards[a];
	}
	@Override
	public String toString() {
		String result = "";
		for(SutdaCard s : cards) {
			result += s+ ", ";
		}
		return result;
	}
}

public class Exam1 {
	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		System.out.println(deck);		//1K,2,3K,4,5,6,7,8K,9,10,1,2,3,4,5,6,7,8,9,10
		deck.shuffle();
		System.out.println(deck); 		//...
		System.out.println("첫번째 카드 : " + deck.pick(0));
		System.out.println("두번째 카드 : " + deck.pick());
	}
}