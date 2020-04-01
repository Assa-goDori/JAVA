package chap12;

/*
 * delChar 메서드 구현하기
 * delChar(원본 문자열, 삭제문자열)
 */
public class Exam5 {
	public static void main(String[] args) {
		System.out.println(delChar("(1!2@3^4~5)", "~!@#$%^&*()"));	//12345
		System.out.println(delChar("(1!2@3^4~5)", "12345"));		//(!@^~)
	}
	static StringBuffer delChar(String str, String del) {
//		StringBuffer insert1 = new StringBuffer(str);
//		StringBuffer insert2 = new StringBuffer(del);
//
//		for(int i = 0; i<insert1.length(); i++) {
//			for(int j = 0; j<insert2.length(); j++) {
//				if(insert1.charAt(i) == insert2.charAt(j)) {
//					insert1.deleteCharAt(i);
//				}
//			}
//		}
//		return insert1;
		
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i<str.length();i++) {
			char c = str.charAt(i);
			if(del.indexOf(c)<0) {
				sb.append(c);
			}
		}
		return sb;
	}
}