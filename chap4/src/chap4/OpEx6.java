package chap4;
/*
 *  산술 연산자(이항 연산) : +, -, /(나누어진 몫), %(나머지)
 *  	/ : 정수 / 정수 => 정수
 *  	% : 결과의 부호는 피제수의 부호를 따른다
 */
public class OpEx6 {

	public static void main(String[] args) {
		System.out.println(10/8);		// 1
		System.out.println(10/-8);		// -1
		System.out.println(-10/8);		// -1
		System.out.println(-10/-8);		// 1
	
		System.out.println(10%8);		// 2
		System.out.println(10%-8);		// 2
		System.out.println(-10%8);		// -2
		System.out.println(-10%-8);		// -2
		
	}

}
