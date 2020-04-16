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
		super("정규직", name, address, dept); 
		this.empNo = empNo;
		this.salary = salary;
		this.position = position;
	}
	
	int getPay() {
		return salary/12;
	}
	
	public String toString() {
		return type + ", 이름 = " + name + ", 주소 = " + address + ", 부서 = " + dept
				+", 직원번호 = " + empNo + ", 직급 = " + position + ", 연봉 = " + salary;
	}
}

class InformalEmployee extends Employee {
	Date expireDate;
	int primaryPay;
	
	InformalEmployee(String name, String address, String dept, Date expireDate, int primaryPay) {
		super("비정규직", name, address, dept);
		this.primaryPay = primaryPay;
		this.expireDate = expireDate;
	}
	
	int getPay() {
		return primaryPay;
	}
	
	public String toString() {
		return type + ", 이름 = " + name + ", 주소 = " + address + ", 부서 = " + dept
				+ ", 계약만료일 = " + expireDate + ", 기본임금 = " + primaryPay;
	}
}

public class Problem1 {
	public static void main(String[] args) {
		FormalEmployee fe = new FormalEmployee("김정규", "서울시 용산구", "총무부", "1", 5000, "과장");
		System.out.println(fe);
		System.out.println(fe.name + "의 급여 : " + fe.getPay());
		
		Date expireDate = new Date();		// 오늘 날짜
		//expireDate.getTime() : 현재시간을 밀리초로 리턴. 1970.1.1. 부터 현재까지의 시간을 밀리초(1/1000초)
		expireDate.setTime(expireDate.getTime() + 1000L * 60 * 60 * 24 * 365 * 2);

		InformalEmployee ie = new InformalEmployee("이비정", "서울시 구로구", "영업부", expireDate, 1000);
		System.out.println(ie);
		System.out.println(ie.name + "의 급여 : " + ie.getPay());
	}
}