import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * 1. �ݺ����� �̿��Ͽ� 
   ���ϸ��� �Է¹޾Ƽ� �ش� ������ �����ϸ� �ش����ϸ�.bak ���� �����ϱ�
   ���ϸ� exit �� �ԷµǸ�, ���α׷� ����.
   �ش� ������ ������ �ش� ������ �����ϴ�. �޼��� ���


[���]
 ���ϸ��� �Է��ϼ���(����:exit)
 aaa.txt  =>�����ϴ� ���
 aaa.bak ���Ͽ� aaa.txt�� ������ �����ϱ�

 ���ϸ��� �Է��ϼ���(����:exit)
 bbb.txt  =>�������� �ʴ� ���
 �ش� ������ �����ϴ�. 
 */
//				FileReader fr = new FileReader(name + ".txt");
//				FileWriter fw = new FileWriter(name + ".bak");
//				char[] buf = new char[8056];
//				int data = fr.read(buf);
//				fr.close();
//				fw.write(new String(buf, 0, data));
//				fw.flush();
//				fw.close();
public class Test1 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("���ϸ��� �Է��ϼ���(����:exit)");
			try {
				String name = scan.next().trim();
				if (name.equals("exit")) break;

				String data = null;
				BufferedReader br = new BufferedReader(new FileReader(name));
				BufferedWriter bw = new BufferedWriter(new FileWriter(name.substring(0, name.lastIndexOf(".")) + ".bak"));
				while((data = br.readLine()) != null) {
					bw.write(data+"\n");
				}
				br.close();
				bw.flush();
				bw.close();
				System.out.println(name.substring(0, name.lastIndexOf(".")) + ".bak�� ���簡 �Ϸ� �Ǿ����ϴ�.");
			} catch (FileNotFoundException e) {
				System.out.println("�ش� ������ �����ϴ�.");
			}
		}
		scan.close();
	}
}