package chap7;
class Animal {
	String name;
	int age;
	String eat() {
		return "���ְ� ���";
	}
}
public class Test2 {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.name = "������";
		animal.age = 20; 
		System.out.println("�̸�(name) : " + animal.name + "\n����(age) : " + animal.age + "\n" + animal.eat());
	}
}