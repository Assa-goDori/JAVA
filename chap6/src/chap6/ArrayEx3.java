package chap6;
/*
 * 로또 번호 생성기
 */
public class ArrayEx3 {

	public static void main(String[] args) {
		int[] balls = new int[45];
		int[] lotto = new int[6];
		//balls 배열에 1~45까지의 번호를 저장
		for(int a=0;a<balls.length;a++) {
			balls[a]=a+1;
		}
		//balls 배열의 내용을 섞기
		for(int a=0;a<1000;a++) {
			int f = (int)(Math.random()*45);
			int t = (int)(Math.random()*45);
			int tmp = balls[f];
			balls[f] =balls[t];
			balls[t] = tmp;
		}
		//6개의 번호를 선택해서 lotto 배열에 저장
		for(int a=0;a<lotto.length;a++) {
			lotto[a] = balls[a];
			System.out.print(lotto[a] + ", ");
		}
		System.out.println();
		//버블정렬
		System.out.println("정렬하여 출력하기");
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
