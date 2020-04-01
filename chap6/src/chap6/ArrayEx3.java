package chap6;
/*
 * �ζ� ��ȣ ������
 */
public class ArrayEx3 {

	public static void main(String[] args) {
		int[] balls = new int[45];
		int[] lotto = new int[6];
		//balls �迭�� 1~45������ ��ȣ�� ����
		for(int a=0;a<balls.length;a++) {
			balls[a]=a+1;
		}
		//balls �迭�� ������ ����
		for(int a=0;a<1000;a++) {
			int f = (int)(Math.random()*45);
			int t = (int)(Math.random()*45);
			int tmp = balls[f];
			balls[f] =balls[t];
			balls[t] = tmp;
		}
		//6���� ��ȣ�� �����ؼ� lotto �迭�� ����
		for(int a=0;a<lotto.length;a++) {
			lotto[a] = balls[a];
			System.out.print(lotto[a] + ", ");
		}
		System.out.println();
		//��������
		System.out.println("�����Ͽ� ����ϱ�");
		for(int a=0;a<lotto.length;a++) {
			boolean change = false;
			for(int b=0;b<lotto.length-1-a;b++) {
				if(lotto[b]>lotto[b+1]) {
					int tmp = lotto[b];
					lotto[b] = lotto[b+1];
					lotto[b+1] = tmp;
					change = true;
				}	
			}
			if(!change) break;
		}
		
		for(int l : lotto) {
			System.out.print(l + ", ");
		}
		
	}

}
