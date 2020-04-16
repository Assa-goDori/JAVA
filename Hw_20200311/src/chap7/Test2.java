package chap7;
class Animal {
	String name;
	int age;
	String eat() {
		return "¸ÀÀÖ°Ô ¾ä¾ä";
	}
}
public class Test2 {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.name = "¿ø¼şÀÌ";
		animal.age = 20; 
		System.out.println("ÀÌ¸§(name) : " + animal.name + "\n³ªÀÌ(age) : " + animal.age + "\n" + animal.eat());
	}
}