package chap19;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;	//io 성능을 보조
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

// goodee.txt 문서를 분석하여 저장된 단어의 갯수를 추력하기
public class StreamEx1 {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("goodee.txt");	//대용량 파일의 데이터를 읽어 낼 때 유용한  path 클래스
		FileReader fr = new FileReader(path.toFile());
		BufferedReader br = new BufferedReader(fr);
		//flatMap : 다른형태의 스트림으로 변경
		Map<String, Long>wordcount = br.lines().flatMap( str-> {	//br.lines() : 모든 데이터를 읽어서 저장, str -> br.lines의 한 줄
			str = str.replace("가"," ");	//의미없는 글자 제거
			str = str.replace("는"," ");
			str = str.replace("을"," ");
			str = str.replace("."," ");
			str = str.replace(","," ");
			str = str.replace("!"," ");
			//\\s+ : \s : 공백문자, + : 1개이상 ==> \\s+ : 공백문자 1개 이상
			String[] strarr = str.split("\\s+");
			return Arrays.stream(strarr);	//공백을 제거한 단어들을 Stream화
			//Collectors.groupingBy(key값, value값)
		}).collect(Collectors.groupingBy(String::toString,
				Collectors.mapping(String::toString,Collectors.counting())));	//단어별 사용된 갯수 생성
		System.out.println(wordcount);
		//갯수의 내림차순으로 정렬
		//map(...) : Stream<Map.Entry> => Stream<String> 변환
		wordcount.entrySet().stream().map(s->s.getKey() + "," + s.getValue()).sorted((a,b) -> {	//compare메서드 오버라이딩
			String str1 = a.substring(a.lastIndexOf(",")+1);	//, 뒤의 숫자
			String str2 = b.substring(b.lastIndexOf(",")+1);
			return Integer.parseInt(str2)-Integer.parseInt(str1);	// 숫자의 역순으로 정렬
		}).forEach(s->System.out.println(s));
	}
}