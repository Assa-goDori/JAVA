package chap12;

import java.util.Random;

/*
 * Random 클래스 : 난수 발생을 위한 클래스
 *    1. 자료형 별 난수 발생이 가능함
 *        nextInt() : 정수형 난수
 *        nextInt(n) : 0<= x < n 정수형 난수
 *        nextDouble() : 0<= x < 1.0 실수형 난수
 *        nextBoolean() : true, false 중 하나 리턴
 *    2. seed 설정 가능
 */
public class RandomEx1 {
	public static void main(String[] args) {
		Random rand = new Random();
		rand.setSeed(0);
		Random rand2 = new Random();
		rand2.setSeed(0);
		System.out.println("rand=>");
		for(int i =0; i<5; i++) {
			System.out.println(i + " : " + rand.nextInt(100));
		}
		System.out.println("\nrand2=>");
		for(int i =0; i<5; i++) {
			System.out.println(i + " : " + rand2.nextInt(100));
		}
		
		Random rand3 = new Random();
		//System.currentTimeMillis() : 1970.1.1부터 현재까지의 시간을 밀리초 리턴
		rand3.setSeed(System.currentTimeMillis());
		System.out.println("\nrand3=>");
		for(int i =0; i<5; i++) {
			System.out.println(i + " : " + rand3.nextInt(100));
		}
	}
}