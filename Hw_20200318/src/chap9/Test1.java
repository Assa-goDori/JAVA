package chap9;

interface Beta {}

class Alpha implements Beta {
	String testIt() {
		return "Tested";
	}
}

class Gamma implements Beta {
	String testIt2() {
		return "Gamma";
	}
}

public class Test1 {
	static Beta getIt() {
		return new Gamma();
	}
	public static void main(String[] args) {
		Beta b = getIt();
//		System.out.println(((Alpha)b).testIt());	//Beta 인터페이스는 멤버가 없으므로 오류 발생. Alpha타입으로 형변환
		if(b instanceof Alpha) {		//b객체가 Alpha 객체?
			Alpha a = (Alpha)b;
			System.out.println(a.testIt());
		}
		if(b instanceof Gamma) {
			Gamma g = (Gamma)b;
			System.out.println(g.testIt2());
		}
	}
}