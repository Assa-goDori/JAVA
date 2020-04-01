package chap8;
/*
 * Coin 클래스를 이용하여 동전 2개를 던져서 앞면이 세번 연속해서 나오는 동전이 승리
 * 승리한 동전의 번호를 출력하기
 */

class Coin2 {
	int side, serialNo;
	static int sno;
	
	Coin2(int serialNo) {
		this.serialNo = serialNo;
	}
	
	void flip() {
		side = (int)(Math.random()*2);
	}
	
	public String toString() {
		return (side==0)?"앞면":"뒷면";
	}
}

public class Test2 {
	public static void main(String[] args) {
		Coin2 c1 = new Coin2(1);
		Coin2 c2 = new Coin2(2);
		boolean game = true;
		int cnt1=0, cnt2=0;
//		while(cnt1<3 && cnt2<3) {
//			c1.flip();
//			c2.flip();
//			System.out.println(((c1.side == 0)?"앞면":"뒷면") + "\t" + ((c2.side ==0)?"앞면":"뒷면"));
//			if(c1.side ==0) cnt1++;
//			else			cnt1 = 0;
//			if(c2.side ==0) cnt2++;
//			else			cnt2 = 0;
//		}
//		if(cnt1>cnt2) System.out.println(c1.serialNo + "번동전 승리");
//		else if(cnt1<cnt2) System.out.println(c2.serialNo + "번동전 승리");
//		else System.out.println("두개의 동전은 비겼습니다");
		
		while(game) {
			c1.flip();
			c2.flip();
			System.out.println(c1 + "\t" + c2);
			if(c1.side == 0)	cnt1++;
			else				cnt1=0;
			if(c2.side == 0)	cnt2++;
			else				cnt2=0;
			
			if(cnt1==3 && cnt2 ==3)	game=false;
			if(cnt1==3 || cnt2==3)	game=false;
		}
		if(cnt1>cnt2) System.out.println(c1.serialNo + "번동전 승리");
		else if(cnt1<cnt2) System.out.println(c2.serialNo + "번동전 승리");
		else System.out.println("두개의 동전은 비겼습니다");
	}
}