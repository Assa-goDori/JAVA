package chap12;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/*
 * Date 클래스 : 날짜(시간포함)를 표현하는 클래스
 * SimpleDateFormat 클래스 : 형식화 클래스. Date객체를 형식화된 문자열로 변경.
 *      String format(Date) : Date객체를 지정된 format에 맞도록 문자열로 변경 기능
 *      Date parse(String) : 형식화된 문자열을 Date 타입으로 변경 기능
 */
public class DateEx1 {
	public static void main(String[] args) {
		Date now = new Date();	//현재 일시
		System.out.println(now);
		
		SimpleDateFormat sf = new SimpleDateFormat("yyyy.MM.dd E요일  a HH:mm:ss");
		/*
		 *  yyyy : 년도 4자리 출력
		 *  MM : 월 2자리 출력
		 *  dd : 일 2자리 출력
		 *  HH : 시간 2자리 출력
		 *  mm : 분 2자리 출력
		 *  ss : 초 2자리 출력
		 *  E : 요일 출력
		 *  a : 오전/오후 구분 출력
		 */
		System.out.println(sf.format(now));
		
		SimpleDateFormat sf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateStr = "2020-03-24 12:10:10";
		Date day = null;
		try {
			day = sf2.parse(dateStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(day);
		//문제:2021년 3월 23일의 요일 출력하기
		String datestr2 = "2021-03-23 09:00:00";
		Date day2 = null;
		try {
			day2 = sf2.parse(datestr2);
		} catch (ParseException e) {
						e.printStackTrace();
		}
		SimpleDateFormat sf3 = new SimpleDateFormat("E요일");
		System.out.println("2021년 3월 23일의 요일은  " + sf3.format(day2) + " 입니다.");	//화요일
		//1970년 이후부터 현재까지의 시간을 밀리초로 리턴.
		System.out.println(now.getTime());	// now 시간을 밀리초로 리턴
		System.out.println(System.currentTimeMillis());	//현재시간을 밀리초로 리턴
		
		//now부터 3일 이후의 날짜와 요일을 출력하기
		now.setTime(now.getTime() + (1000*60*60*24*3));
		System.out.println(sf2.format(now));
	}
}