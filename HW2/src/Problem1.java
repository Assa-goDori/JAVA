import java.util.Scanner;

class OutOfNumException extends Exception {
	OutOfNumException(String msg) {
		super(msg);
	}
	public String toString() {
		return super.getMessage();
	}
} 

public class Problem1 {
	public static void main(String[] args) {
		int divide = 1;
		int[] arr = new int[10];	//�Է¹��� ���ڸ� �ڸ������ ���� �迭
		int errorcode = 0;
		String num[][][] = {		//�迭 ũ�� : num[9][5][1]
				{
					{"******"},		//0�� 0�� 0��	
					{"**  **"},		
					{"**  **"},		
					{"**  **"},		
					{"******"}},	//0�� 4�� 0��
				{	{"  **  "},		//1�� 0�� 0��	
					{"  **  "},		
					{"  **  "},		
					{"  **  "},		
					{"  **  "}},	//1�� 4�� 0��
				{	{"******"},		//2�� 0�� 0��
					{"    **"},
					{"******"},
					{"**    "},
					{"******"}},	//2�� 4�� 0��
				{	{"******"},		//3�� 0�� 0��
					{"    **"},
					{"******"},
					{"    **"},
					{"******"}},	//3�� 4�� 0��
				{	{"**  **"},		//4�� 0�� 0��
					{"**  **"},
					{"******"},
					{"    **"},
					{"    **"}},	//4�� 4�� 0��
				{	{"******"},		//5�� 0�� 0��
					{"**    "},
					{"******"},
					{"    **"},
					{"******"}},	//5�� 4�� 0��
				{	{"******"},		//6�� 0�� 0��
					{"**    "},
					{"******"},
					{"**  **"},
					{"******"}},	//6�� 4�� 0��
				{	{"******"},		//7�� 0�� 0��
					{"    **"},
					{"   ** "},
					{"  **  "},
					{" **   "}},	//7�� 4�� 0��
				{	{"******"},		//8�� 0�� 0��
					{"**  **"},
					{"******"},
					{"**  **"},
					{"******"}},	//8�� 4�� 0��
				{	{"******"},		//9�� 0�� 0��
					{"**  **"},
					{"******"},
					{"    **"},
					{"******"}}		//9�� 4�� 0��
		};

		while(true) {
			System.out.println("�ڸ����� �Է��ϼ���(1~10) (-1 �Է½� ���α׷� ����)");
			Scanner scan = new Scanner(System.in);

			try {
				int input = scan.nextInt();
				if(input == -1) { System.out.println("���α׷��� �����մϴ�. "); break; }
				int a = 1;
				for(int i = 0; i<input-1; i++) { a *= 10; }
				if(input>10 || input <1) { throw new OutOfNumException("�ùٸ� �ڸ����� �Է��ϼ���."); }

				System.out.println("0���� 9���� ���ڸ� �Է��ϼ���");
				Scanner scan2 = new Scanner(System.in);
				int input2 = scan2.nextInt();
				if(input2<a || input2>a*10) { throw new OutOfNumException("�ùٸ� �ڸ����� ���� �Է��ϼ���."); }
				
				//divide �� �����ϱ�
				for(int i = 0;i<input-1;i++) { divide *= 10; }
			
				//�Է¹��� ���� �迭�� ���� �ֱ�
				for(int i = 0;i<input;i++) {
					arr[i] = input2/divide;
					input2 -= arr[i]*divide;
					divide /= 10;
					if(divide == 1) {
						arr[i+1] = input2%10;
						break;
					}
				}

				//�Է¹��� ���� 3�����迭 ���ϱ�
				for(int k = 0; k<num[0].length;k++) {		//3���� �迭 0���� ũ�⸸ŭ ���� : 5
					for(int i = 0; i<input; i++) {			//�ڸ��� ��ŭ for�� ����
						for(int j = 0; j<num.length;j++) {	//���ڸ�� ��¹迭�� �Է¹迭 ��
							if (arr[i] == j) { System.out.print(num[j][k][0] + "\t"); }	
						}			
					}
					System.out.println();
				}
			} catch (OutOfNumException e) {
				System.out.println(e);
				continue;
			}
		}
	}
}