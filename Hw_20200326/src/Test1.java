import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Student implements Comparable<Student> {
	String name;
	int kor;
	int eng;
	int math;
	Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public int getTotal() {
		return kor+eng+math;
	}
	
	public String toString() {
		return name + ":����(" + kor + ")����(" + eng + ")����(" + math + "),����(" + getTotal() + "),���(" + String.format("%.2f", getTotal()/3.0) + ")";
	}
	@Override
	public int compareTo(Student s) {
		return name.compareTo(s.name);
	}
}

public class Test1 {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("ȫ�浿", 90, 80, 70));
		list.add(new Student("���", 95, 85, 75));
		list.add(new Student("�̸���", 80, 95, 95));
		list.add(new Student("�Ӳ���", 60, 75, 100));

		System.out.println("�⺻���Ĺ��");
		TreeSet<Student> set1 = makeTreeSet(list, null);
		System.out.println(set1);
		System.out.println("�������� �������� ����");
		Comparator<Student> c = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o2.getTotal() - o1.getTotal();
			}
		};
		TreeSet<Student> set2 = makeTreeSet(list, c);
		System.out.println(set2);
		System.out.println("���� ������������ ����");
		TreeSet<Student> set3 = makeTreeSet(list, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o2.kor - o1.kor;
			}
		});
		System.out.println(set3);
		System.out.println("���� ������������ ����");
		TreeSet<Student> set4 = makeTreeSet(list, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o2.eng - o1.eng;
			}
		});
		System.out.println(set4);
		System.out.println("���� ������������ ����");
		TreeSet<Student> set5 = makeTreeSet(list, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o2.math - o1.math;
			}
		});
		System.out.println(set5);
	}

	private static TreeSet<Student> makeTreeSet(List<Student> list, Comparator<Student> c) {
//		TreeSet<Student> set = new TreeSet<Student>(new Comparator<Student>() {		
//			@Override
//			public int compare(Student o1, Student o2) {
//				if (c==null) return o1.name.compareTo(o2.name);
//				else return c.compare(o1, o2);
//			}
//		});
//		for(int i = 0; i<list.size(); i++) {
//			set.add(list.get(i));
//		}
		TreeSet<Student> set = new TreeSet<Student>(c);
//		for(Student s : list) set.add(s);
		set.addAll(list);
		return set;
	}
}