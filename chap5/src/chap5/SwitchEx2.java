package chap5;

/*
 * switch ������ ���ǰ����� ��밡���� �ڷ���
 * 	=> byte, short, int, char, String
 * 
 * ���ǹ� : if, switch
 * 	��� switch ������ if �������� ���� ������.
 * 	��� if ������ switch �������� ������ �� ����.
 */

public class SwitchEx2 {
	public static void main(String[] args) {
		int value = 1;
		switch(value) {
		case 1 : System.out.println(value); break;

		case 2 : System.out.println(value); break;
		}
	}

}
