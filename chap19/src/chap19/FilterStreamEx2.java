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
				new Person("홍길동","남",30),
				new Person("김삿갓","남",40),
				new Person("성춘향","여",20),
				new Person("향단이","여",22));
		System.out.print("남자들의 이름(나이) : ");
		list.stream().filter(n -> n.getGender().equals("남")).forEach(s -> System.out.printf("%s(%d),", s.getName(), s.getAge()));
		System.out.println();
		
		System.out.print("여자들의 이름(나이) : ");
		list.stream().filter(n -> n.getGender().equals("여")).forEach(s -> System.out.printf("%s(%d),", s.getName(), s.getAge()));
		list.stream().filter(n -> n.getGender().equals("여")).forEach(s -> System.out.printf("%s(%d),", s.getName(), s.getAge()));
		System.out.println();
		
		//mapXXX()
		//mapToInt : Stream을 다시 IntStream으로 형태변환
		double ageAvg = list.stream().filter(s -> s.getGender().equals("남")).mapToDouble(Person::getAge).average().getAsDouble();
		//double ageAvg = list.stream().filter(s -> s.getGender().equals("남")).mapToDouble(p->p.getAge).average().getAsDouble(); 같은표현임. 이름과 나이 동시에 불러오는건 불가함
		System.out.print("남자들의 평균 나이 : " + ageAvg);
		ageAvg = list.stream().filter(s -> s.getGender().equals("여")).mapToDouble(Person::getAge).average().getAsDouble();
		System.out.println("   여자들의 평균 나이 : " + ageAvg);
		
		list.stream().map(Person::getName).forEach(System.out::println);
	}
}