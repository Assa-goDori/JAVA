package chap3;
/*
 <-------- 명시적 형변환(생락 불가능)
 byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)
 		   char(2)
 									자동 형변환(생략 가능) -------->
 	# 단 char 와 byte, short 간의 형변환은 명시적 형변환이어야 함.
 	# String 클래스는 + 연산자를 이용하여 String으로 형변환이 가능함
 		String = String + 기본형
 */
public class VarEx2 {

	public static void main(String[] args) {
		byte b1 = 10; // = 대입연산자, b1변수에 10 값을 대입.
		byte b2 = 20;
		long l1 = 100, l2 = 200;
		long l3 = l1 + l2;
		char c1 = 'A';
		int i1 = c1; // 자동 형변환, 형변환 연산자 생략 가능
		c1 = (char)i1; // 명시적 형변환, 형변환 연산자 생략 불가능 하므로 써줘야함.
		System.out.println("b1= " + b1 + ", b2= " + b2);
		System.out.println("l1= " + l1 + ", l2 = " + l2 + ", l3 = " + l3);
		System.out.println("c1= " + c1 + ", i1= " + i1);
		System.out.println(c1);
		
		float f1 = l3; // 자동 형변환   float형이 물리적 저장공간은 작지만 범위상으로는 float형이 long형보다 큰 자료형임.
		l3 = (long)f1; // 명시적 형변환
		b1 = 65;
		c1 = (char)b1; //명시적 형변환. 형변환 연산자 반드시 입력
		
		System.out.println("번호 : " + 1 + 2 + 3); // 번호 : 123   /  번호 : 6 => System.out.println("번호 : " + (1 + 2 + 3));
		System.out.println(1 + 2 + 3 + "번"); // 6번
	}

}
