package chap9;

abstract class Animal {
	String name;
	Animal(String name) {
		this.name = name;
	}
	abstract void eat();
}

interface Flyable {
	void fly();
}
//Dove 클래스 구현하기
class Dove extends Animal implements Flyable {
	Dove() {
		super("비둘기");
	}
	@Override
	void eat() {
		System.out.println(name + "는 작은 벌레를 잡아 먹는다.");
	}
	@Override
	public void fly() {
		System.out.println(name + "는 날아다니는 새입니다.");
	}
}

class Monkey extends Animal {
	Monkey() {
		super("원숭이");
	}
	void eat() {
		System.out.println(name + "는 나무에서 열매를 따 먹는다.");
	}
}

public class Exam1 {
	public static void main(String[] args) {
		Animal a = new Dove();
		a.eat(); //비둘기는 작은 벌레를 잡아 먹는다.
		if(a instanceof Flyable) {
			Dove d = new Dove();
			d.fly();
			((Flyable) a).fly(); //비둘기는 날아다니는 새 입니다.
		}
		a = new Monkey();
		a.eat(); //원숭이는 나무에서 열매를 따 먹는다.
		if(a instanceof Flyable) {
			((Flyable) a).fly();
		}
	}
}