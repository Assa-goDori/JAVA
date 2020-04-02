package chap15;

import java.io.File;

/*
 * File Ŭ����
 *   - �����̳�, ������ ������ �����ϰ� �ִ� Ŭ����
 *   - ���� ���ϵ� ������.
 *   
 *   ���� ������
 *     ������ : \
 *     ������, �� : /
 *     -> �ڹٴ� �÷����� �������̶� ���� ���� ��������� ������� '/', '\' �Ѵ� ����
 */
public class FileEx1 {
	public static void main(String[] args) {
		String filePath = "c:\\";		// c����̺�(\�� 2���� ��� '\' �����ϳ��� �νĵ�)
		File f1 = new File(filePath);	//f1: c:\\ ���� ����.
		String files[] = f1.list();		//f1 ������ ���� ������ �迭�� ����.
		for(String f : files) {
			File f2 = new File(filePath, f);	// new File(����(���� ���), ����)
			if(f2.isDirectory())
				System.out.printf("%s : ���丮%n", f);
			else if(f2.isFile())
				System.out.printf("%s : ����(%, dbyte)%n", f, f2.length());
		}
	}
}