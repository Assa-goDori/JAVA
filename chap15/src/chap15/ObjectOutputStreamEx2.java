package chap15;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * 상속 관계에서 직렬화.
 */
class UserInfo {
	protected String name;
	protected String password;
	public UserInfo() {}
	public UserInfo(String name, String password) {
		this.name = name;
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserInfo [name=" + name + ", password=" + password + "]";
	}
}

class User extends UserInfo implements Serializable {
	private int age;
	public User(String name, String password, int age) {
		super(name, password);
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + ", age=" + age + "]";
	}
	//부모클래스가 Serializable 미구현시 직렬화를 구현한 자손클래스에서 부모 멤버를 읽고 쓰는 방법.
	private void writeObject(ObjectOutputStream out) throws IOException {
		out.writeUTF(name);			//문자열
		out.writeUTF(password);
		out.defaultWriteObject();
	}
	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
		name = in.readUTF();		//문자열
		password = in.readUTF();
		in.defaultReadObject();
	}
}
public class ObjectOutputStreamEx2 {
	public static void main(String[] args) throws IOException{
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object2.ser"));
		User u1 = new User("홍길동", "1234", 20);
		User u2 = new User("김삿갓", "5678", 30);
		oos.writeObject(u1); oos.writeObject(u2);
		System.out.println("사용자 1 : " + u1);
		System.out.println("사용자 2 : " + u2);
	}
}