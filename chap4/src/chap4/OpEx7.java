package chap4;
/*
 * 비트 연산자 : &(and), |(or), ^(xor), ~(not)
 */
public class OpEx7 {

	public static void main(String[] args) {
		System.out.println("6 & 3 = " + (6&3));
		/*
		 * 6 : 0000 0110
		 * 3 : 0000 0011
		 * -------------- and 연산
		 * 2 : 0000 0010
		 */
		System.out.println("6 | 3 = " + (6|3));
		/*
		 * 6 : 0000 0110
		 * 3 : 0000 0011
		 * -------------- or 연산
		 * 7 : 0000 0111
		 */
		System.out.println("6 ^ 3 = " + (6^3));
		/*
		 * 6 : 0000 0110
		 * 3 : 0000 0011
		 * -------------- xor 연산
		 * 5 : 0000 0101
		 */
		System.out.println("~10 = " + ~10);
		/*
		 * 10 : 0000 1010
		 * --------------- not 연산
		 * ~10: 1111 0101 => 음수의 표현 : 2의보수 처리 => -11(1000 1011)
		 * 가장 왼쪽비트 : 부호비트. 0 : 양수, 1 : 음수
		 * 2의 보수 : 1의보수 + 1
		 * 부호비트를 제외한 111 0101 값이 ? 수의 2의 보수임. 다시 보수를 산출하면 ?를 알 수 있다.
		 * 1의 보수 : 000 1010
		 * 1     :  000 0001
		 * -----------------
		 * 11 	 : 000 1011
		 * 부호비트를 붙이면 1000 1011 => -11이 된다.
		 */
	}

}
