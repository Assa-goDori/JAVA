package chap7;

class Student {
	int num, lNum, eNum, mNum;
	String name;
	Student(String name, int num) {
		this(name, num, 0, 0, 0);
	}
	Student(String name, int num, int lNum, int eNum, int mNum) {
		this.name = name;
		this.num = num;
		this.lNum = lNum;
		this.eNum = eNum;
		this.mNum = mNum;
	}
	int getTotal() {
		return lNum+eNum+mNum;
	}
	
	float getAverage() {
		return getTotal()/3;
	}
	void info() {
		System.out.println("ÇĞ¹ø : " + num + "\nÀÌ¸§ : " + name +
				"\n±¹¾î : " + lNum + "\n¿µ¾î : " + eNum +
				"\n¼öÇĞ : " + mNum + "\nÃÑÁ¡ : " + getTotal() +
				"\nÆò±Õ : " + getAverage());
		System.out.println("==========================");
	}
}
public class Test3 {
	public static void main(String[] args) {
		Student s = new Student("È«±æµ¿", 1);
		s.info();
		Student s2 = new Student("±è»ñ°«", 2, 80, 90, 70);
		s2.info();
	}
}