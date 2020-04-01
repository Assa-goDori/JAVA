package chap12;
// String 메서드 2
// 토큰 : 의미를 가지고 있는 최소 단위의 문자열
public class StringEx3 {
	public static void main(String[] args) {
		String s = "HTML-CSS-JavaScript-JAVA-SJP-스프링";
		String[] subject = s.split("-");
		for(int i = 0; i<subject.length;i++) {
			System.out.println((i+1) + " : " + subject[i]);
		}
		s = "홍길동  , 김삿갓  , 이몽룡   , 성춘향   , 임꺽정";
		//문자열의 이름만 출력. 이름 갯수 출력하기
		String[] subject2 = s.split(",");
		for(int i = 0; i<subject2.length; i++) {
			System.out.println(subject2[i].trim());
			if(i==subject2.length-1) {
				System.out.println("총 " + (i+1) + "명 입니다.");
			}
		}
		//문자열 => 숫자 변경
		int i = Integer.parseInt("255");
		System.out.println(i+1);		//101
		double d = Double.parseDouble("10.5");
		System.out.println(d+1.1);		//11.6
		float f = Float.parseFloat("10.5");
		System.out.println(f + 1.1);	//11.6
		
		//문자열을 Format 형태로 출력하기
		//%.2f : 실수를 소수점 이하 2자리까지 출력. 자동반올림
		//%10d : 10자리를 확보하여 10진수로 출력
		//%X : 16진수로 출력
		//%o : 8진수로 출력
		String sf = String.format("%.2f", d+0.125);
		System.out.println(sf);				//10.63
		sf = String.format("%10d", i);		//          255
		System.out.println(sf);
		sf = String.format("%X", i);		//FF
		System.out.println(sf);
		sf = String.format("%x", i);		//ff
		System.out.println(sf);
		sf = String.format("%o", i);		//377
		System.out.println(sf);
	}
}