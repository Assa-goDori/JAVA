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
//		System.out.println(((Alpha)b).testIt());	//Beta �������̽��� ����� �����Ƿ� ���� �߻�. AlphaŸ������ ����ȯ
		if(b instanceof Alpha) {		//b��ü�� Alpha ��ü?
			Alpha a = (Alpha)b;
			System.out.println(a.testIt());
		}
		if(b instanceof Gamma) {
			Gamma g = (Gamma)b;
			System.out.println(g.testIt2());
		}
	}
}