package chap12;
/*
 * Object 클래스의 equals 메서드
 *     : 객체의 내용을 비교하는데 사용되는 메서드 => 오버라이딩 필요
 *     
 *     == : 같은 객체 여부 판단
 *     Object 클래스의 equals 메서드 : 기본적으로 같은 객체 여부 판단하도록 구현됨.
 *     => 내용비교를 위한 기능을 위해서 오버라이딩이 필요함.
 */
class Equal2 {
	int value;
	Equal2(int value) {
		this.value = value;
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Equal2) {
			Equal2 e = (Equal2)o;
			return value == e.value;
		} else {
			return false;
		}
	}
}
public class EqualsEx2 {
	public static void main(String[] args) {
		Equal2 e1 = new Equal2(10);
		Equal2 e2 = new Equal2(10);
		if(e1 == e2) System.out.println("e1과 e2는 같은 객체임");
		else System.out.println("e1과 e2는 다른 객체임");
		if(e1.equals(e2)) System.out.println("e1과 e2는 같은 내용의 객체임");
		else System.out.println("e1과 e2는 다른 내용의 객체임");
//		e2 = e1;
		System.out.println("e1 객체의 해쉬 코드 값 : " + e1.hashCode());
		System.out.println("e2 객체의 해쉬 코드 값 : " + e2.hashCode());
		String str1 = new String("abc");
		String str2 = new String("abc");
		if(str1 == str2) System.out.println("str1 == str2");
		else System.out.println("str1 != str2");
		if(str1.equals(str2)) System.out.println("str.equals(str2)");		//String 클래스에서 equals 메서드 오버라이딩됨.
		else System.out.println("!str.equals(str2)");
		//논리적으로 동일 객체임을 판단하기 위해 오버라이딩 됨.
		System.out.println("str1 객체의 해쉬 코드 값 : " + str1.hashCode());
		System.out.println("str2 객체의 해쉬 코드 값 : " + str2.hashCode());
	}
}