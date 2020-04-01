package chap12;
/*
 * format 메서드 구현하기
 * 메서드 명 : StringBuffer format (문자열, 문자열크기, 정렬방식)
 * 기능 : 주어진 문자열을 지정된 크기의 문자열로 변환
 *      나머지 공간은 공백으로 채운다.
 *      (0 : 왼쪽 정렬, 1 : 가운데 정렬, 2 : 오른쪽 정렬)
 */
public class Exam6 {
	public static void main(String[] args) {
		String str = "가나다";
		System.out.println(format(str, 9, 0));
		System.out.println(format(str, 9, 1));
		System.out.println(format(str, 9, 2));
		System.out.println(format(str, 2, 0));
	}
	static StringBuffer format(String str, int len, int align) {
		StringBuffer sb = new StringBuffer();
		if(str.length()>len)
			return sb.append(str.substring(0, len));
		
		for(int i = 0; i<len; i++) {
			sb.append(" ");
		}
		int a = len-str.length();
		switch(align) {
		case 0: sb.replace(0, str.length(), str); break;		//왼쪽 정렬
		case 1: sb.replace(a/2, str.length()+a/2, str);	break;	//가운데 정렬
		case 2: sb.replace(a, str.length()+a, str); break;		//오른쪽 정렬
		}
		
		return sb;
	}
}