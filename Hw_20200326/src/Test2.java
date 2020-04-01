import java.util.*;

class Student1 implements Comparable<Student1> {
	String name;
	String count;
	Student1(String name, String count) {
		this.name =name;
		this.count = count;
	}
	public int compareTo(Student1 s) {
		return name.compareTo(s.name);
	}
	public String toString() {
		return name + " " + count;
	}
}

public class Test2 {

	public static void main(String[] args) {
		List<Student1> list = new ArrayList<Student1>();
		Set<Student1> set = new TreeSet<Student1>(new Comparator<Student1>() {
			@Override
			public int compare(Student1 o1, Student1 o2) {
				return o1.compareTo(o2);
			}
		});
		list.add(new Student1("È«±æµ¿", "123"));
		list.add(new Student1("±è»ñ°«", "234"));
		list.add(new Student1("ÀÌ¸ù·æ", "345"));
		set.add(list.get(0));
		System.out.println(set);
	}

}
