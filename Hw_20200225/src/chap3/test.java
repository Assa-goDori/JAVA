package chap3;

public class test {

	public static void main(String[] args) {
		//byte var1 = 128; 		// int 범위 : -128 ~ 127
		short var2 = 128; 		// 정상
		int var3 = (int)28L; 	// 명시적형변환
		long var4 = 128L;		// 정상
		//float var5 = 1.2; 		// 접미사 f 붙여야함 or 형변환 연산자 (float)1.2 작성
		double var6 = 1.2;		// 정상
		float var7 = 42e1f; 	// 42x10^1 = 420 (e = 10.0) / 출력값 : 420.0 
		float var8 = 0x0123; 	// 16진법 256 + 32 + 3 / 출력값 : 291.0
		float var9 = '1'; 		// char => float 형변환 / ASCII코드 49 = 1 / 출력값 : 49.0 
	}
}