package chap15;
/*
 * printf 메서드 예제 : 형식지정문자 사용 가능
 * 					%d, %s, %c, %f ...
 * 					String.format() 메서드도 똑같이 사용 가능함.
 */
public class PrintStreamEx2 {
	public static void main(String[] args) {
		//char 형식지정문자 : %c     %n == \n
		System.out.printf("%c%n", 'A');		//A 문자 출력
		System.out.printf("%5c%n", 'A');	//5자리 확보하여 A 문자 출력(우측 정렬)
		System.out.printf("%-5c%n", 'A');	//5자리 확보하여 A 문자 출력(좌측 정렬)
		
		//정수출력 : %d(10진수), %o(8진수), %x(16진수), %X(16진수, 대문자)
		System.out.printf("%d%n", 12345);	//10진수 출력
		System.out.printf("%,d%n", 12345);	//3자리마다 , 입력. 10진수 출력
		System.out.printf("%10d%n", 12345);	//10자리 확보하여 10진수 출력(우측 정렬)
		System.out.printf("%010d%n", 12345);//10자리 확보하여 10진수 출력. 빈자리는 0으로 채움.
		System.out.printf("%3d%n", 12345);	//최소 3자리확보.
		System.out.printf("%-10d%n", 12345);//10자리 확보하여 10진수 출력(좌측 정렬)
		System.out.printf("%,10d%n", 12345);//10자리 확보하여 10진수 우측정렬 출력. 3자리마다 , 입력.
		System.out.printf("%-,10d%n", 12345);//10자리 확보하여 10진수 좌측정렬 출력. 3자리마다 , 입력.
		System.out.printf("%,010d%n", 12345);//10자리 확보하여 10진수 출력. 빈자리는 0으로 채우고 수가 적혀있는 곳의 3자리마다 , 입력.
		
		System.out.printf("%o%n", 12345);	//8진수 출력
		System.out.printf("%x%n", 255);	//16진수 출력
		System.out.printf("%X%n", 255);	//16진수 대문자 출력
		
		//실수출력 : %f(소수표현), %e(지수표현), %g(근사실수)
		System.out.printf("%f%n", 12345.12345);			//실수 출력
		System.out.printf("%.2f%n", 12345.12345);		//소수점이하 2자리까지 실수 출력(3자리에서 반올림)
		System.out.printf("%10.2f%n", 12345.12345);		//10자리 확보하여 소수점이하 2자리까지 실수 출력
		System.out.printf("%,10.2f%n", 12345.12345);	//3자리마다 , 입력. 10자리 확보하여 소수점이하 2자리까지 실수 출력(우측 정렬)
		System.out.printf("%-,10.2f%n", 12345.12345);	//3자리마다 , 입력. 10자리 확보하여 소수점이하 2자리까지 실수 출력(좌측 정렬)
		System.out.printf("%,010.2f%n", 12345.12345);	//3자리마다 , 입력. 10자리 확보하여 소수점이하 2자리까지 실수 출력. 빈자리는 0으로 채움(-입력시 좌측정렬로 인해 0이 입력될 수 없음)
		
		System.out.printf("%e%n", 12345.12345);			//지수표현으로 출력  =>  1.234512 * 10^4
		System.out.printf("%g%n", 12345.12345);			//근사실수표현 출력
		
		//논리형 : %b
		System.out.printf("%b ! = %b%n", true, false);
		System.out.printf("(2>3) == %b%n", (2>3));
		
		//문자열 : %s
		System.out.printf("%s는 %s이다.%n", "홍길동", "의적");
		System.out.printf("%10s는 %10s이다.%n", "홍길동", "의적");	//10자리를 확보하여 문자열 출력(우측 정렬)
		
		//문제 : 10진수 255는 8진수 377, 16진수 FF다. printf()로 출력
		System.out.printf("10진수 %d는 8진수 %o, 16진수 %X다.%n", 255, 255, 255);
		String hex = String.format("%X", 255);
		String oct = String.format("%o", 255);
		System.out.println("255의 16진수 : " + hex);
		System.out.println("255의 8진수 : " + oct);
	}
}