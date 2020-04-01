package chap9;

class Outer {
	class Inner {
		int iv = 100;
	}
}

class Outer2 {
	static class Inner {
		int iv = 200;
	}
}

public class Test2 {
	public static void main(String[] args) {
		System.out.println(new Outer().new Inner().iv);
		System.out.println(new Outer2.Inner().iv);
	}
}