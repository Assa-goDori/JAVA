package chap8;
import java.util.Date;
class Employee {
	String type;
	String name;
	String address;
	String dept;
	
	Employee(String type, String name, String address, String dept) {
		this.type = type;
		this.name = name;
		this.address = address;
		this.dept = dept;
	}

}

class FormalEmployee extends Employee {
	String empNo;
	String position;
	int salary;
	
	FormalEmployee(String name, String address, String dept, String empNo, int salary, String position) {
		super("������", name, address, dept); 
		this.empNo = empNo;
		this.salary = salary;
		this.position = position;
	}
	
	int getPay() {
		return salary/12;
	}
	
	public String toString() {
		return type + ", �̸� = " + name + ", �ּ� = " + address + ", �μ� = " + dept
				+", ������ȣ = " + empNo + ", ���� = " + position + ", ���� = " + salary;
	}
}

class InformalEmployee extends Employee {
	Date expireDate;
	int primaryPay;
	
	InformalEmployee(String name, String address, String dept, Date expireDate, int primaryPay) {
		super("��������", name, address, dept);
		this.primaryPay = primaryPay;
		this.expireDate = expireDate;
	}
	
	int getPay() {
		return primaryPay;
	}
	
	public String toString() {
		return type + ", �̸� = " + name + ", �ּ� = " + address + ", �μ� = " + dept
				+ ", ��ุ���� = " + expireDate + ", �⺻�ӱ� = " + primaryPay;
	}
}

public class Problem1 {
	public static void main(String[] args) {
		FormalEmployee fe = new FormalEmployee("������", "����� ��걸", "�ѹ���", "1", 5000, "����");
		System.out.println(fe);
		System.out.println(fe.name + "�� �޿� : " + fe.getPay());
		
		Date expireDate = new Date();		// ���� ��¥
		//expireDate.getTime() : ����ð��� �и��ʷ� ����. 1970.1.1. ���� ��������� �ð��� �и���(1/1000��)
		expireDate.setTime(expireDate.getTime() + 1000L * 60 * 60 * 24 * 365 * 2);

		InformalEmployee ie = new InformalEmployee("�̺���", "����� ���α�", "������", expireDate, 1000);
		System.out.println(ie);
		System.out.println(ie.name + "�� �޿� : " + ie.getPay());
	}
}