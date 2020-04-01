import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

/*
 * [°á°ú]
ÀÌ¸§ ¸ñ·Ï :È«±æµ¿,±è»ñ°«,ÀÌ¸ù·æ,±èÀÚ¹Ù,¹ÚÀÚ¹Ù,
³ªÀÌ ¸ñ·Ï :10,30,15,25,20,
ÃÑ³ªÀÌÀÇ ÇÕ»ê :100
³ªÀÌÀÇ Æò±Õ :20.0
 */
public class Test2 {
	static Person[] arr = {
			new Person("È«±æµ¿", 10),
			new Person("±è»ñ°«", 30),
			new Person("ÀÌ¸ù·æ", 15),
			new Person("±èÀÚ¹Ù", 25),
			new Person("¹ÚÀÚ¹Ù", 20)};

	public static void main(String[] args) {
		System.out.print("ÀÌ¸§ ¸ñ·Ï :");
		printString(p -> p.getName());
		System.out.print("³ªÀÌ ¸ñ·Ï :");
		printString(p -> String.format("%d,", p.getAge()));
		System.out.print("ÃÑ³ªÀÌÀÇ ÇÕ»ê :");
		printTot(p -> p.getAge());
		System.out.print("³ªÀÌÀÇ Æò±Õ :");
		printAvg(p -> p.getAge());
	}

	static void printString(Function<Person, String> f) {
		for(Person s : arr)
			System.out.print(f.apply(s));
		System.out.println();
	}

	static void printTot(ToIntFunction<Person> f) {
		int sum = 0;
		for(Person p : arr)
			sum += f.applyAsInt(p);
		System.out.println(sum);
	}

	static void printAvg(ToDoubleFunction<Person> f) {
		double sum = 0;
		for(Person p : arr)
			sum += f.applyAsDouble(p);
		System.out.println(sum/arr.length);
	}
}