import java.util.Arrays;
import java.util.List;
/*
 * 2. ���� ����� �������� ���α׷��� �ϼ��Ͻÿ�
[���]
���� ���� ����:265
���� ���� ����:290
���� ���� ���:66.25
���� ���� ���:72.5
�İ��л� ���
[name=ȫ�浿, eng=60, math=70, major=�İ�]
[name=�Ӳ���, eng=85, math=65, major=�İ�]
�İ� ���� ���� ����:135
���� ���� ����:145
���� ���� ���:67.5
���� ���� ���:72.5
 */
class Student {
	 private String name;
	 private int eng;
	 private int math;
	 private String major;
	 public Student(String name, int eng, int math, String major) {
	  this.name = name;
	  this.eng = eng;
	  this.math = math;
	  this.major = major;
	 }
	 //getter
	 public String getName() {  return name; }
	 public int getEng() {  return eng; }
	 public int getMath() {  return math; }
	 public String getMajor() {  return major; }
	 @Override
	 public String toString() {
	  return "[name=" + name + ", eng=" + eng + ", math=" + math + ", major=" + major + "]";
	 }
	}
	public class Test2 {
	 public static void main(String[] args) {
	  List<Student> list = Arrays.asList(
	    new Student("ȫ�浿",60,70,"�İ�"),new Student("���",65,55,"�濵"),
	    new Student("�̸���",80,75,"ȭ��"),new Student("�Ӳ���",85,65,"�İ�")
	  );
	  
	  System.out.println("���� ���� ����:" + list.stream().mapToInt(Student::getMath).sum());
	  System.out.println("���� ���� ����:" + list.stream().mapToInt(Student::getEng).sum());
	  System.out.println("���� ���� ���:" + list.stream().mapToDouble(Student::getMath).average().getAsDouble());
	  System.out.println("���� ���� ���:"+ list.stream().mapToDouble(Student::getEng).average().getAsDouble()); 
	  System.out.println("�İ��л� ���");
	  list.stream().filter(s->s.getMajor().equals("�İ�")).forEach(s->System.out.println(s));

	  System.out.println("�İ� ���� ���� ����:" + list.stream().filter(s->s.getMajor().equals("�İ�")).mapToInt(Student::getMath).sum());
	  System.out.println("�İ� ���� ���� ����:" + list.stream().filter(s->s.getMajor().equals("�İ�")).mapToInt(Student::getEng).sum());
	  System.out.println("�İ� ���� ���� ���:" + list.stream().filter(s->s.getMajor().equals("�İ�")).mapToDouble(Student::getMath).average().getAsDouble()); 
	  System.out.println("�İ� ���� ���� ���:" + list.stream().filter(s->s.getMajor().equals("�İ�")).mapToDouble(Student::getEng).average().getAsDouble());
	 }
	}