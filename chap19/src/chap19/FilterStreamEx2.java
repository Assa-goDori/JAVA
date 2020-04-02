package chap19;

import java.util.Arrays;
import java.util.List;

class Person {
	private String name;
	private String gender;
	private int age;
	Person(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	public String getName() { return name; }
	public String getGender() { return gender; }
	public int getAge() { return age; }
}
public class FilterStreamEx2 {
	public static void main(String[] args) {
		List<Person> list = Arrays.asList(
				new Person("ȫ�浿","��",30),
				new Person("���","��",40),
				new Person("������","��",20),
				new Person("�����","��",22));
		System.out.print("���ڵ��� �̸�(����) : ");
		list.stream().filter(n -> n.getGender().equals("��")).forEach(s -> System.out.printf("%s(%d),", s.getName(), s.getAge()));
		System.out.println();
		
		System.out.print("���ڵ��� �̸�(����) : ");
		list.stream().filter(n -> n.getGender().equals("��")).forEach(s -> System.out.printf("%s(%d),", s.getName(), s.getAge()));
		list.stream().filter(n -> n.getGender().equals("��")).forEach(s -> System.out.printf("%s(%d),", s.getName(), s.getAge()));
		System.out.println();
		
		//mapXXX()
		//mapToInt : Stream�� �ٽ� IntStream���� ���º�ȯ
		double ageAvg = list.stream().filter(s -> s.getGender().equals("��")).mapToDouble(Person::getAge).average().getAsDouble();
		//double ageAvg = list.stream().filter(s -> s.getGender().equals("��")).mapToDouble(p->p.getAge).average().getAsDouble(); ����ǥ����. �̸��� ���� ���ÿ� �ҷ����°� �Ұ���
		System.out.print("���ڵ��� ��� ���� : " + ageAvg);
		ageAvg = list.stream().filter(s -> s.getGender().equals("��")).mapToDouble(Person::getAge).average().getAsDouble();
		System.out.println("   ���ڵ��� ��� ���� : " + ageAvg);
		
		list.stream().map(Person::getName).forEach(System.out::println);
	}
}