package chap5;
/*
 * 중첩 반복문 : 반복문 내부에 반복문이 존재
 * 구구단 출력하기
 */

public class LoopEx3 {
	public static void main(String[] args) {
		for(int i=2;i<=9;i++) {
			System.out.println("====" + i + "단" + "====");
			for(int k=2;k<=9;k++) {
				System.out.println(i + " x " + k + " = " + i*k);
			}
		}
	}

}
