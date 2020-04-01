package chap12;
/*
 *  String 클래스
 *  1. String 클래스는 유일하게 대입 연산자로 객체 생성이 가능(new String()으로도 객체 생성 가능)
 *  2. String 클래스는 유일하게 + 연산자 사용이 가능 : String = 기본형 + String
 *  3. final 클래스(다른 클래스에서 상속 받을 수 없다)
 *  4. 정적인 문자열 : 한번 설정시 수정 되지 않는 문자열
 */
public class StringEx1 {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abc";
		String s3 = new String("abc");
		String s4 = new String("abc");
		
		if(s1 == s2) {
			System.out.println("s1 == s2 : 같은 객체");
		} else {
			System.out.println("s1 != s2 : 다른 객체");
		}
		
		if(s1.equals(s2)) {
			System.out.println("s1.equals(s2) : 같은 내용 객체");
		} else {
			System.out.println("!s1.equals(s2) : 다른 내용 객체");
		}
		
		if(s3 == s4) {
			System.out.println("s3 == s4 : 같은 객체");
		} else {
			System.out.println("s3 != s4 : 다른 객체");
		}
		
		if(s3.equals(s4)) {
			System.out.println("s3.equals(s4) : 같은 내용 객체");
		} else {
			System.out.println("!s3.equals(s4) : 다른 내용 객체");
		}
	}
}