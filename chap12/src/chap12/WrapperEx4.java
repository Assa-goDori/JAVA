package chap12;
/*
 * Character Ŭ���� ����
 */
public class WrapperEx4 {
	public static void main(String[] args) {
		char[] data = {'A', 'a', '9', '&'};
		for(char c : data) {
			if(Character.isUpperCase(c))
				System.out.println(c + " : �빮��");
			else if (Character.isLowerCase(c))
				System.out.println(c + " : �ҹ���");
			else if (Character.isDigit(c))
				System.out.println(c + " : ����");
			else
				System.out.println(c + " : ��Ÿ����");
		}
		Character ch = (Character)'A';		//auto boxing
		System.out.println(ch.equals('A'));
		System.out.println(ch=='A');		//ch�� auto unboxing�� �Ǿ ������� ����
		System.out.println(ch.isAlphabetic('a'));
		System.out.println(ch.isAlphabetic('��'));
		System.out.println(ch.isAlphabetic('&'));
		System.out.println(ch.isAlphabetic('4'));
	}
}