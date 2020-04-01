package chap9;

class Unit {
	int hp;
	final int MAX;
	Unit(int hp) {
		this.hp = hp;
		MAX = hp;
	}
}
class AirUnit extends Unit {
	AirUnit(int hp) {
		super(hp);
	}
}
class GroundUnit extends Unit {
	GroundUnit(int hp) {
		super(hp);
	}
}

interface Repairable {}			// 멤버가 존재하지 않는다.

class Tank extends GroundUnit implements Repairable {
	Tank() { super(150); }
	public String toString() { return "Tank"; }
}

class DropShip extends AirUnit implements Repairable {
	DropShip() { super(125); }
	public String toString() { return "DropShip"; }
}
class Marine extends GroundUnit {
	Marine() { super(40); }
	public String toString() { return "Marine"; }
}
class SCV extends GroundUnit implements Repairable {
	SCV() { super(60); }
	void repair(Repairable r) {		// Repairable을 구현한 구현 객체만 호출 가능
		if(r instanceof Unit) {
			Unit u = (Unit)r;
			u.hp = u.MAX;
			System.out.println(r.toString() + " 수리완료");
			/*
			 * Repairable 타입의 r 참조변수로는 hp, MAX 멤버 접근 불가
			 * r은 멤버는 없지만 Object멤버 접근 가능함(toString)
			 */
		}
	}
	public String toString() { return "SCV"; }
}

public class RepairableEx1 {
	public static void main(String[] args) {
		Tank t = new Tank();
		DropShip d = new DropShip();
		Marine m = new Marine();
		SCV s = new SCV();
		s.repair(t);
		s.repair(d);
//		s.repair(m);	// error
		s.repair(s);
	}
}