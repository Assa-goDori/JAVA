package chap12;
/*
 * String 클래스 주요 메서드
 */
public class StringEx2 {
	public static void main(String[] args) {
		String s = new String("ABCDEFGH");
		//s.charAt(4) : 4번인덱스 문자 리턴
		System.out.println(s.charAt(4));							// E
		//s.compareTo("abc") : (차이가 생기는 시작점의)'A' - 'a', 정렬시 사용되는 메서드
		System.out.println(s.compareTo("abc"));						// -32
		//IgnoreCase : 대소문자 상관 없이, s.compareToIgnoreCase("abcdefgh") : 차이가 안생기므로 0 리턴
		System.out.println(s.compareToIgnoreCase("abcdefgh"));		// 0
		//s.concat("abc") : s + "abc"
		System.out.println(s.concat("abc"));						// ABCDEFGHabc
		//s.endsWith("GH") : s문자열이 "GH"라는 문자열로 종료하는가
		System.out.println(s.endsWith("GH"));						//true
		//s.startsWith("AB") : s문자열이 "AB"라는 문자열로 시작하는가
		System.out.println(s.startsWith("AB"));						//true
		//s.equalsIgnoreCase("abcdefgh") : 대소문자 상관 없이 "abcdefgh"와 s문자열이 같은가 비교
		System.out.println(s.equalsIgnoreCase("abcdefgh"));			//true
		s = new String("This is a String");
		//s.indexOf('i') : s문자열에서 'i' 문자의 인덱스 리턴
		System.out.println(s.indexOf('i'));							//2
		//s.indexOf('i', 5) : s문자열에서 5번인덱스 부터 존재하는 'i' 문자의 인덱스 리턴
		System.out.println(s.indexOf('i', 5));						//5
		//s.indexOf('i', 15) : s문자열에서 15번인덱스 부터 존재하는 'i' 문자의 인덱스 리턴
		System.out.println(s.indexOf('i', 15));						//-1(찾을 수 없는 경우)
		//s.indexOf("is") : s문자열에서 "is"문자열이 시작하는 인덱스 리턴
		System.out.println(s.indexOf("is"));						//2
		//s.lastIndexOf("is") : 뒤 우선으로 "is" 문자열의 인덱스 리턴. 인덱스는 처음부터 0으로 시작
		System.out.println(s.lastIndexOf("is"));					//5
		//s.length() : 문자열의 길이
		System.out.println(s.length());								//16
		//s.replace("is", "QR") : s문자열에서 is를 QR로 대체(치환)
		System.out.println(s.replace("is", "QR"));					//ThQR QR a String
		//s.substring(5) : 부분 문자열, s문자열에서 5번째 인덱스 부터의 부분 문자열 출력
		System.out.println(s.substring(5));							//is a String
		//s.substring(5, 13) : 5번인덱스부터 13번인덱스 앞(12번인덱스)까지의 부분 문자열 출력
		System.out.println(s.substring(5, 13));						//is a Str
		//s.toLowerCase() : s문자열을 소문자로 변경
		System.out.println(s.toLowerCase());						//this is a string
		//s.toUpperCase() : s문자열을 대문자로 변경
		System.out.println(s.toUpperCase());						//THIS IS A STRING
		//문자열.trim() : 문자열 양쪽의 공백 제거(중간 공백 제거 x)
		System.out.println("       문자열 trim 메서드           ".trim());		//문자열 trim 메서드
	}
}