package chap8;
/*
 * Coin Ŭ������ �̿��Ͽ� ���� 2���� ������ �ո��� ���� �����ؼ� ������ ������ �¸�
 * �¸��� ������ ��ȣ�� ����ϱ�
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
		return (side==0)?"�ո�":"�޸�";
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
//			System.out.println(((c1.side == 0)?"�ո�":"�޸�") + "\t" + ((c2.side ==0)?"�ո�":"�޸�"));
//			if(c1.side ==0) cnt1++;
//			else			cnt1 = 0;
//			if(c2.side ==0) cnt2++;
//			else			cnt2 = 0;
//		}
//		if(cnt1>cnt2) System.out.println(c1.serialNo + "������ �¸�");
//		else if(cnt1<cnt2) System.out.println(c2.serialNo + "������ �¸�");
//		else System.out.println("�ΰ��� ������ �����ϴ�");
		
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
		if(cnt1>cnt2) System.out.println(c1.serialNo + "������ �¸�");
		else if(cnt1<cnt2) System.out.println(c2.serialNo + "������ �¸�");
		else System.out.println("�ΰ��� ������ �����ϴ�");
	}
}