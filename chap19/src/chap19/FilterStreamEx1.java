package chap19;

import java.util.Arrays;
import java.util.List;

public class FilterStreamEx1 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("È«±æµ¿", "±è»ñ°«", "ÀÌ¸ù·æ","¼ºÃáÇâ","ÀÓ²©Á¤","Çâ´ÜÀÌ","È«±æµ¿","±è»ñ°«");
		list.stream().forEach(n -> System.out.print(n + ","));
		System.out.println();
		list.stream().distinct().forEach(n -> System.out.print(n + ","));
		System.out.println();
		list.stream().filter(n->n.startsWith("È«")).forEach(n -> System.out.print(n+","));
		System.out.println();
		list.stream().filter(n->n.startsWith("È«")).distinct().forEach(n -> System.out.print(n+","));
		System.out.println();
		//ÀÌ¸§¿¡ 'ÀÌ'ÀÚ¸¦ °¡Áø ÀÌ¸§µé¸¸ Áßº¹¾øÀÌ ½ºÆ®¸²À¸·Î Ãâ·Â
		list.stream().filter(n->n.contains("ÀÌ")).distinct().forEach(n -> System.out.print(n+","));
	}
}