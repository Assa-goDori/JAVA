import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		int[] coin = {500, 100, 50, 10, 5, 1};
		int[] cnt = {5, 5, 5, 5, 5, 5};
		int max = 0;
		for(int i = 0; i<coin.length; i++) {
			max += coin[i]*cnt[i];
		}
		System.out.println("교환가능한 최대금액은 " + max + "입니다.");
		System.out.println("금액을 입력하세요");
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		
		if(count>3330) {
			System.out.println("동전이 부족합니다.");
		} else {
			for(int i = 0; i<coin.length; i++) {
				for(int j = 1; j<=5; j++) {
					count -= coin[i];
					if(count<0) {
						count += coin[i];
						break;
					}
					cnt[i]--;
				}
				if(count==0) break;
			}
			for(int i = 0; i<coin.length;i++) {
				System.out.println(coin[i] + "원 : " + (5-cnt[i]) + "개");
			}
			for(int i = 0; i<cnt.length;i++) {
				System.out.println("남은 " + coin[i] + "원 동전 : " + cnt[i]);
			}
		}
	}
}