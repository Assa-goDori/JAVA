package chap12;
/*
 * switch �������� ���ǰ����� ����� �� �ִ� �ڷ���
 * byte, short, int, char, String
 * Byte, Short, Integer, Character WrapperŬ������ ����
 */
public class WrapperEx5 {
	public static void main(String[] args) {
		Integer data = 65;
		switch(data) {
		case 1: System.out.println("����"); break;
		default : System.out.println("����"); break;
		}
	}
}