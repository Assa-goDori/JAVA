package chap4;
/*
 * 논리 부정 연산자 : ! : true => false, false => true
 */
public class OpEx4 {

	public static void main(String[] args) {
		System.out.println(true);				//true
		System.out.println("!true= " + !true);	// !true = false
		System.out.println("!flase= " + !false);	// !false = true
		int x = 100;
		System.out.println("(x<200) = " + (x < 200));
		System.out.println("!(x<200) = " + !(x < 200));
		System.out.println("1 != 2 : " + (1 != 2));
	}

}
