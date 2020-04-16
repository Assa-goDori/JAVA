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
			System.out.println("�ո�");
			sno++;
		} else {
			System.out.println("�޸�"); 
		}
	}
}

public class Test1 {
	public static void main(String[] args) {
		Coin[] c = new Coin[10];
		for(int i = 1; i<=c.length;i++) {
			c[i-1] = new Coin(i);
			System.out.print(c[i-1].serialNo + "�� ���� : ");
			c[i-1].flip();
		}
		System.out.println("��ü �ո� ������ ���� : " + Coin.sno + "��");
		System.out.println("��ü �޸� ������ ���� : " + (10-Coin.sno) + "��");
	}
}