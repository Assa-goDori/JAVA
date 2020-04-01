package chap11;
/*
 * ���� catch ����
 *     - �� ���� try ���� �پ��� ���ܰ� �߻��� ���ɼ��� �ִ� ���, ���ܺ��� �ٸ� ó���� ������.
 *     - ���� Ŭ������ �� ������ ���� catch ������ �ۼ��ؾ� ��.
 */
public class ExceptionEx2 {
	public static void main(String[] args) {
		try {
		System.out.println(args[0]);
		System.out.println(Integer.parseInt(args[0]));		//NumberFormatException
		System.out.println(10/Integer.parseInt(args[0]));	//ArithmeticException
		String str = null;
		System.out.println(str.charAt(0));
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Ŀ�ǵ� ���ο� �Ķ���͸� �Է��ϼ���");
		} catch(NumberFormatException e) {
			System.out.println("Ŀ�ǵ� ���ο� ���� �Ķ���͸� �Է��ϼ���");
		} catch(ArithmeticException e) {
			System.out.println("Ŀ�ǵ� ���ο� ���� 0�� �Է����� ������.");
		} catch(Exception e) {
			System.out.println("����η� �����ּ���.");
		}
	}
}