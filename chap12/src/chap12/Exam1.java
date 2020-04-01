package chap12;
/*
 * String 클래스는 정적인 문자열임
 */
public class Exam1 {
	public static void main(String[] args) {
		String str = "ABC123";
		System.out.println("main : " + str);
		str = change(str);
		System.out.println("change 이후 main : " + str);
	}
	private static String change(String str) {
		str += "456";
		System.out.println("change() : " + str);
		return str;
	}
}