package chap9;
/*
 * 인터페이스 예제
 * 
 * 인터페이스
 *     1. 인터페이스의 멤버는 상수, 추상메서드, default 메서드, static 메서드만 가능하다.
 *       상수 선언 : (public static final) 자료형 상수명;
 *               int NUM = 100;
 *               public int NUM = 100;
 *               static int NUM = 100;
 *               final int NUM = 100;
 *       추상 메서드 선언 : (public abstract) 리턴타입 메서드명();
 *               int getA();
 *               abstract int getA();
 *               public int getA();
 *       defualt 메서드 => jdk 8.0 이후부터 사용가능, 구현부가 존재함.
 *                  : public default 리턴타입 메서드명() { 구현부 }
 *       static 메서드 => jdk 8.0 이후부터 사용가능, 구현부가 존재함.
 *                  : public static 리턴타입 메서드명() { 구현부 }
 *     2. 인터페이스의 멤버의 접근 제어자 : public
 *     3. 객체화 불가 => 구현 클래스의 객체화를 통해서 객체화 됨.
 *     4. 클래스와 인터페이스간은 구현(implements)으로 표현한다. -> 다중 구현이 가능 
 *     5. 인터페이스간의 상속이 가능하다. -> 다중 상속이 가능         
 */
interface Printerable {
	int INK = 100;	// 상수  = (public static final) int INK = 100;
	void print();	// (public abstract) void print();
}
interface Scannerable { 
	void scan();
}
interface Faxable {
	String FAX_NO = "010-12345";
	void send(String tel);
	void receive(String tel);
}
interface Complexerable extends Printerable, Scannerable, Faxable {}

// 구현클래스 : 인터페이스를 구현한 클래스.
class Complexer implements Complexerable {
	int ink;
	Complexer() {
		this.ink = INK;
	}
	@Override
	public void print() {
		System.out.println("종이에 출력합니다. 남은 잉크량 : " + --ink);
	}

	@Override
	public void scan() {
		System.out.println("이미지를 스캔 합니다.");
	}

	@Override
	public void send(String tel) {
		System.out.println(FAX_NO + "에서 " + tel + "번호로 FAX를 전송합니다.");
	}

	@Override
	public void receive(String tel) {
		System.out.println(tel + "에서 " + FAX_NO + "번호로 FAX를 받았습니다.");
	}
	
}
public class ComplexerEx1 {
	public static void main(String[] args) {
		Complexer com = new Complexer();
		System.out.println("기본 잉크량 : " + Printerable.INK);
		System.out.println("기본 잉크량 : " + Complexerable.INK);
		System.out.println("FAX 번호 : " + Complexerable.FAX_NO);
		System.out.println("FAX 번호 : " + Faxable.FAX_NO);
		System.out.println("FAX 번호 : " + Complexer.FAX_NO);
		com.print();
		com.scan();
		com.receive("02-5678");
		com.send("02-5678");
		if(com instanceof Complexer) {
			System.out.println("com 객체는 Complexer 객체임");
		}
		if(com instanceof Complexerable) {
			System.out.println("com 객체는 Complexerable 객체임");
		}
		if(com instanceof Printerable) {
			System.out.println("com 객체는 Printerable 객체임");
			Printerable p = (Printerable)com; // 자동형변환 됨
			p.print();
//			p.scan(); // error, Printerable 멤버가 아님
		}
		if(com instanceof Scannerable) {
			System.out.println("com 객체는 Scannerable 객체임");
			Scannerable s = com;
			s.scan();
//			s.print(); // error, Scannernable 멤버가 아님
		}
		if(com instanceof Faxable) {
			System.out.println("com 객체는 Faxable 객체임");
			Faxable f = com;
			System.out.println(Faxable.FAX_NO);
			f.send("01234");
			f.receive("1212");
		}
	}
}