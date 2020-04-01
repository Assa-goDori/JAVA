package chap12;
/*
 * Character 클래스 예제
 */
public class WrapperEx4 {
	public static void main(String[] args) {
		char[] data = {'A', 'a', '9', '&'};
		for(char c : data) {
			if(Character.isUpperCase(c))
				System.out.println(c + " : 대문자");
			else if (Character.isLowerCase(c))
				System.out.println(c + " : 소문자");
			else if (Character.isDigit(c))
				System.out.println(c + " : 숫자");
			else
				System.out.println(c + " : 기타문자");
		}
		Character ch = (Character)'A';		//auto boxing
		System.out.println(ch.equals('A'));
		System.out.println(ch=='A');		//ch가 auto unboxing이 되어서 등가연산자 수행
		System.out.println(ch.isAlphabetic('a'));
		System.out.println(ch.isAlphabetic('마'));
		System.out.println(ch.isAlphabetic('&'));
		System.out.println(ch.isAlphabetic('4'));
	}
}