package chap12;
/*
 * Wrapper 클래스 : 8개의 기본 자료형을 객체화 하기 위한 클래스
 *    기본자료형             Wrapper클래스(포장 클래스)
 *    boolean      Boolean
 *    byte         Byte
 *    short        Short
 *    int          Integer
 *    long         Long
 *    char         Character
 *    float        Float
 *    double       Double
 *    
 *    기본적으로 기본형과 참조자료형은 형변한이 불가 하다(기본자료형 <=> 배열, 클래스, 인터페이스)
 *    단, 예외적으로 기본자료형과 Wrapper클래스 사이의 형변환이 가능(jdk 5.0.)
 *    참조형 -> 기본형 : 오토언박싱
 *    기본형 -> 참조형 : 오토박싱
 */
public class WrapperEx1 {
	public static void main(String[] args) {
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		System.out.println("i1==i2 : " + (i1==i2));				// 다른객체이므로 false
		System.out.println("i1.equals(i2) : " + i1.equals(i2));	// 내용비교이므로 true
		System.out.println("i1==100 : " + (i1==100));			// i1이 기본형으로 형변환(언박싱)되어서 true
		int i3 = 100;
		System.out.println("i1==i3 : " + (i1==i3));				// Integer형과 int형인 기본형은 서로 비교가 가능 true
		Integer i4 = 100;	//auto boxing
		System.out.println("i1==i4 : " + (i1==i4));				// 100값이 객체형으로 바뀜(박싱). 다른객체이므로 false
		//int형의 정보
		System.out.println("int 형의 최대 값 : " + Integer.MAX_VALUE);
		System.out.println("int 형의 최소 값 : " + Integer.MIN_VALUE);
		System.out.println("int 형의 bit수 : " + Integer.SIZE);
		//byte형의 정보
		System.out.println("byte 형의 최대 값 : " + Byte.MAX_VALUE);
		System.out.println("byte 형의 최소 값 : " + Byte.MIN_VALUE);
		System.out.println("byte 형의 bit수 : " + Byte.SIZE);
		//정수형 문자열을 int로 변환
		int num = Integer.parseInt("123");
		System.out.println(num+100);
		//10진수를 2진수, 8진수, 16진수로 변경
		System.out.println("10의 이진수 : " + Integer.toBinaryString(10));
		System.out.println("10의 8진수 : " + Integer.toOctalString(10));
		System.out.println("10의 16진수 : " + Integer.toHexString(10));
	}
}