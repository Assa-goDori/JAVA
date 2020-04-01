package chap4;
/*
 * 증감 연산자 예제 2 : 증감 연산자와 다른 연산자가 같이 사용 될 경우
 * 	전위형 : ++x => 다른 연산보다 먼저 증감식을 수행함
 * 	후위형 : x++ => 다른 연산을 수행 후 나중에 증감식을 수행함
 */
public class OpEx2 {

	public static void main(String[] args) {
		int x = 5, y = 0;
		y = x++;
		System.out.println("x = " + x + ", y = " + y);
		y = ++x;
		System.out.println("x = " + x + ", y = " + y);
		y = x--;
		System.out.println("x = " + x + ", y = " + y);	// x = 6, y= 7
		y = --x;
		System.out.println("x = " + x + ", y = " + y);	// x = 5, y = 5
		System.out.println("x = " + x++);	// x = 5
		System.out.println("x = " + ++x);	// x = 7
	}

}
