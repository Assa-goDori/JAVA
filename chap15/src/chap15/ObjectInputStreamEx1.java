package chap15;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
 * ObjectInputStream ����
 */
public class ObjectInputStreamEx1 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream
				(new FileInputStream("object.ser"));
		Customer c1 = (Customer)ois.readObject();	//object.ser ���Ͽ��� ��ü 1���� ����.
		Customer c2 = (Customer)ois.readObject();
		System.out.println("������ ���� 1 : " + c1);
		System.out.println("������ ���� 2 : " + c2);
	}
}