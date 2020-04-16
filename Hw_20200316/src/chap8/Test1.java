package chap8;
class Coin {
	int side, serialNo;
	static int sno;
	
	Coin(int serialNo) {
		this.serialNo = serialNo;
	}
	
	void flip() {
		side = (int)(Math.random()*2);
		if(side == 0) {
			System.out.println("앞면");
			sno++;
		} else {
			System.out.println("뒷면"); 
		}
	}
}

public class Test1 {
	public static void main(String[] args) {
		Coin[] c = new Coin[10];
		for(int i = 1; i<=c.length;i++) {
			c[i-1] = new Coin(i);
			System.out.print(c[i-1].serialNo + "번 동전 : ");
			c[i-1].flip();
		}
		System.out.println("전체 앞면 동전의 갯수 : " + Coin.sno + "개");
		System.out.println("전체 뒷면 동전의 갯수 : " + (10-Coin.sno) + "개");
	}
}