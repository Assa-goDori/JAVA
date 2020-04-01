package chap11;
/*
 * finally 블럭 : 정상, 예외 발생 모두 실행되는 블럭
 *              return 문장이 실행 되도 finally블럭은 실행됨
 */
public class ExceptionEx3 {
	public static void main(String[] args) {
		try {
			System.out.print(1);
			System.out.print(2);
			System.out.print(3);
			return;
		} catch (Exception e) {
			System.out.print(4);
//			return;
		} finally {
			System.out.print(5);
		}
		System.out.println(6);
	}
}