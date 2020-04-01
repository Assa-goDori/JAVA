package chap12;

interface Actionable { }

class DanceRobot implements Actionable {
	public void dance() {
		System.out.println("���� ��ϴ�.");
	}
}

class SingRobot implements Actionable {
	public void sing() {
		System.out.println("�뷡�� �θ��ϴ�.");
	}
}

class DrawRobot implements Actionable {
	public void draw() {
		System.out.println("�׸��� �׸��ϴ�.");
	}
}

public class Problem {

	public static void main(String[] args) {
		Actionable[] a = {new DanceRobot(), new SingRobot(), new DrawRobot()};
		for(int i = 0; i<a.length;i++) {
			action(a[i]);
		}
	}
	
	static void action(Actionable p) {
		if(p instanceof DanceRobot) {
			DanceRobot dr = new DanceRobot();
			dr.dance();
		}
		if(p instanceof SingRobot) {
			SingRobot sr = new SingRobot();
			sr.sing();
		}
		if(p instanceof DrawRobot) {
			DrawRobot wr = new DrawRobot();
			wr.draw();
		}
	}
}