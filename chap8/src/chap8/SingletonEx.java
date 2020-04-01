package chap8;
/*
 * 접근 제한자를 이용한 객체수 관리하기
 */
class SingleObject {
	private static SingleObject obj = new SingleObject();
	private SingleObject() {}	//생성자
	private int value = 100;
	public static SingleObject getObject() {
		return obj;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
}
public class SingletonEx {
	public static void main(String[] args) {
//		SingleObject so = new SingleObject();	// 객체 생성 불가. (생성자에 접근 불가 private)
		SingleObject so1 = SingleObject.getObject();
		SingleObject so2 = SingleObject.getObject();
		System.out.println(so1.getValue());
		System.out.println(so2.getValue());
		so1.setValue(500);
		System.out.println(so1.getValue());
		System.out.println(so2.getValue());
		
		if(so1 == so2) {
			System.out.println("so1과 so2는 같은 객체를 참조하고 있다");
		}
	}
}