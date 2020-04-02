import java.util.Arrays;
import java.util.List;
/*
 * 2. 다음 결과가 나오도록 프로그램을 완성하시오
[결과]
수학 점수 총점:265
영어 점수 총점:290
수학 점수 평균:66.25
영어 점수 평균:72.5
컴공학생 목록
[name=홍길동, eng=60, math=70, major=컴공]
[name=임꺽정, eng=85, math=65, major=컴공]
컴공 수학 점수 총점:135
영어 점수 총점:145
수학 점수 평균:67.5
영어 점수 평균:72.5
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
	    new Student("홍길동",60,70,"컴공"),new Student("김삿갓",65,55,"경영"),
	    new Student("이몽룡",80,75,"화공"),new Student("임꺽정",85,65,"컴공")
	  );
	  
	  System.out.println("수학 점수 총점:" + list.stream().mapToInt(Student::getMath).sum());
	  System.out.println("영어 점수 총점:" + list.stream().mapToInt(Student::getEng).sum());
	  System.out.println("수학 점수 평균:" + list.stream().mapToDouble(Student::getMath).average().getAsDouble());
	  System.out.println("영어 점수 평균:"+ list.stream().mapToDouble(Student::getEng).average().getAsDouble()); 
	  System.out.println("컴공학생 목록");
	  list.stream().filter(s->s.getMajor().equals("컴공")).forEach(s->System.out.println(s));

	  System.out.println("컴공 수학 점수 총점:" + list.stream().filter(s->s.getMajor().equals("컴공")).mapToInt(Student::getMath).sum());
	  System.out.println("컴공 영어 점수 총점:" + list.stream().filter(s->s.getMajor().equals("컴공")).mapToInt(Student::getEng).sum());
	  System.out.println("컴공 수학 점수 평균:" + list.stream().filter(s->s.getMajor().equals("컴공")).mapToDouble(Student::getMath).average().getAsDouble()); 
	  System.out.println("컴공 영어 점수 평균:" + list.stream().filter(s->s.getMajor().equals("컴공")).mapToDouble(Student::getEng).average().getAsDouble());
	 }
	}