package chap15;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
 * ObjectInputStream 예제
 */
public class ObjectInputStreamEx1 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream
				(new FileInputStream("object.ser"));
		Customer c1 = (Customer)ois.readObject();	//object.ser 파일에서 객체 1개를 읽음.
		Customer c2 = (Customer)ois.readObject();
		System.out.println("복원된 고객 1 : " + c1);
		System.out.println("복원된 고객 2 : " + c2);
	}
}