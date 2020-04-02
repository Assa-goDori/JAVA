package chap18;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
 * Predicate 인터페이스
 *   매개변수 존재, 리턴 값은 boolean형이고 test() 메서드를 가짐.
 */
public class LambdaEx10 {
	private static List<Student> list = Arrays.asList
			(new Student("홍길동",55,60,"컴공"),
			new Student("이몽룡",95,90,"경영"),
			new Student("김삿갓",75,80,"심리"),
			new Student("임꺽정",65,70,"전자"),
			new Student("성춘향",65,10,"컴공")
			);
	public static void main(String[] args) {
		System.out.println("영어 점수가 60점 이상인 학생의 영어 평균 : " + avgEng(s -> s.getEng()>60));
		System.out.println("컴공과 학생의 영어 평균 : " + avgEng(s -> s.getMajor().equals("컴공")));
		System.out.println("컴공과를 제외한 학생들의 영어 평균 : " + avgEng(s->s.getMajor()!="컴공"));
		//문제
		System.out.println("컴공과 학생의 이름 : " + nameList(s -> s.getMajor().equals("컴공")));
		System.out.println("컴공과 학생이 아닌 학생들의 이름 : " + nameList(s -> !s.getMajor().equals("컴공")));
	}
	private static String nameList(Predicate<Student> pr) {
		String result = "";
		for(Student s : list) {
			if(pr.test(s)) {
				result += s.getName() + ",";
			}
		}
		return result;
	}
	private static double avgEng(Predicate<Student> pr) {
		int count = 0, sum = 0;
		for(Student s : list) {
			if(pr.test(s)) {
				count++;
				sum += s.getEng();
			}
		}
		return (double)sum/count;
	}
}