package chap12;
/*
 * String Ŭ���� �ֿ� �޼���
 */
public class StringEx2 {
	public static void main(String[] args) {
		String s = new String("ABCDEFGH");
		//s.charAt(4) : 4���ε��� ���� ����
		System.out.println(s.charAt(4));							// E
		//s.compareTo("abc") : (���̰� ����� ��������)'A' - 'a', ���Ľ� ���Ǵ� �޼���
		System.out.println(s.compareTo("abc"));						// -32
		//IgnoreCase : ��ҹ��� ��� ����, s.compareToIgnoreCase("abcdefgh") : ���̰� �Ȼ���Ƿ� 0 ����
		System.out.println(s.compareToIgnoreCase("abcdefgh"));		// 0
		//s.concat("abc") : s + "abc"
		System.out.println(s.concat("abc"));						// ABCDEFGHabc
		//s.endsWith("GH") : s���ڿ��� "GH"��� ���ڿ��� �����ϴ°�
		System.out.println(s.endsWith("GH"));						//true
		//s.startsWith("AB") : s���ڿ��� "AB"��� ���ڿ��� �����ϴ°�
		System.out.println(s.startsWith("AB"));						//true
		//s.equalsIgnoreCase("abcdefgh") : ��ҹ��� ��� ���� "abcdefgh"�� s���ڿ��� ������ ��
		System.out.println(s.equalsIgnoreCase("abcdefgh"));			//true
		s = new String("This is a String");
		//s.indexOf('i') : s���ڿ����� 'i' ������ �ε��� ����
		System.out.println(s.indexOf('i'));							//2
		//s.indexOf('i', 5) : s���ڿ����� 5���ε��� ���� �����ϴ� 'i' ������ �ε��� ����
		System.out.println(s.indexOf('i', 5));						//5
		//s.indexOf('i', 15) : s���ڿ����� 15���ε��� ���� �����ϴ� 'i' ������ �ε��� ����
		System.out.println(s.indexOf('i', 15));						//-1(ã�� �� ���� ���)
		//s.indexOf("is") : s���ڿ����� "is"���ڿ��� �����ϴ� �ε��� ����
		System.out.println(s.indexOf("is"));						//2
		//s.lastIndexOf("is") : �� �켱���� "is" ���ڿ��� �ε��� ����. �ε����� ó������ 0���� ����
		System.out.println(s.lastIndexOf("is"));					//5
		//s.length() : ���ڿ��� ����
		System.out.println(s.length());								//16
		//s.replace("is", "QR") : s���ڿ����� is�� QR�� ��ü(ġȯ)
		System.out.println(s.replace("is", "QR"));					//ThQR QR a String
		//s.substring(5) : �κ� ���ڿ�, s���ڿ����� 5��° �ε��� ������ �κ� ���ڿ� ���
		System.out.println(s.substring(5));							//is a String
		//s.substring(5, 13) : 5���ε������� 13���ε��� ��(12���ε���)������ �κ� ���ڿ� ���
		System.out.println(s.substring(5, 13));						//is a Str
		//s.toLowerCase() : s���ڿ��� �ҹ��ڷ� ����
		System.out.println(s.toLowerCase());						//this is a string
		//s.toUpperCase() : s���ڿ��� �빮�ڷ� ����
		System.out.println(s.toUpperCase());						//THIS IS A STRING
		//���ڿ�.trim() : ���ڿ� ������ ���� ����(�߰� ���� ���� x)
		System.out.println("       ���ڿ� trim �޼���           ".trim());		//���ڿ� trim �޼���
	}
}