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
		System.out.println("�й� : " + num + "\n�̸� : " + name +
				"\n���� : " + lNum + "\n���� : " + eNum +
				"\n���� : " + mNum + "\n���� : " + getTotal() +
				"\n��� : " + getAverage());
		System.out.println("==========================");
	}
}
public class Test3 {
	public static void main(String[] args) {
		Student s = new Student("ȫ�浿", 1);
		s.info();
		Student s2 = new Student("���", 2, 80, 90, 70);
		s2.info();
	}
}