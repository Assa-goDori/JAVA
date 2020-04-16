abstract class Animal {
	String type;
	int legs;
	Animal(String type, int legs) {
		this.type = type;
		this.legs = legs;
	}
	
	abstract void eat();
	abstract void sound();
}

class Dog extends Animal {
	Dog() {
		super("강아지", 4);
	}

	@Override
	void eat() {
		System.out.println("주인이 주는대로 먹는다."); 
	}

	@Override
	void sound() {
		System.out.println("멍멍짖는다.");
	}
	
}

class Lion extends Animal {
	Lion() {
		super("사자", 4);
	}

	@Override
	void eat() {
		System.out.println("초식동물을 잡아 먹는다.");
	}

	@Override
	void sound() {
		System.out.println("어흥거린다.");
	}

}

public class Test1 {
	public static void main(String[] args) {
		Animal[] animal = new Animal[2];
		animal[0] = new Dog();
		animal[1] = new Lion();
		for(Animal a : animal) {
			System.out.print(a.type + ", 다리수 : " + a.legs + "개  =>");
			a.sound();
			a.eat();
		}
	}
}