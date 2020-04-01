package chap5;
/*
 * 반복문을 이용하여 1부터 10까지 합 구하기
 */
public class LoopEx2 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		for(i=0;i<=10;i++) {
			sum += i;
		}
		System.out.println("[for구문]1~10까지의 합은 " + sum);
		
		i=1;
		sum=0;
		while(i<=10) {
			sum += i;
			i++;
		}
		System.out.println("[while구문]1~10까지의 합은 " + sum);
		
		i=1;
		sum=0;
		do {
			sum += i;
			i++;
		}while(i<=10);
		System.out.println("[do while구문]1~10까지의 합은 " + sum);
	}

}