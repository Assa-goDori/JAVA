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
		super("������", 4);
	}

	@Override
	void eat() {
		System.out.println("������ �ִ´�� �Դ´�."); 
	}

	@Override
	void sound() {
		System.out.println("�۸�¢�´�.");
	}
	
}

class Lion extends Animal {
	Lion() {
		super("����", 4);
	}

	@Override
	void eat() {
		System.out.println("�ʽĵ����� ��� �Դ´�.");
	}

	@Override
	void sound() {
		System.out.println("����Ÿ���.");
	}

}

public class Test1 {
	public static void main(String[] args) {
		Animal[] animal = new Animal[2];
		animal[0] = new Dog();
		animal[1] = new Lion();
		for(Animal a : animal) {
			System.out.print(a.type + ", �ٸ��� : " + a.legs + "��  =>");
			a.sound();
			a.eat();
		}
	}
}