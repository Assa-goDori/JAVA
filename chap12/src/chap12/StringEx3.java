package chap12;
// String �޼��� 2
// ��ū : �ǹ̸� ������ �ִ� �ּ� ������ ���ڿ�
public class StringEx3 {
	public static void main(String[] args) {
		String s = "HTML-CSS-JavaScript-JAVA-SJP-������";
		String[] subject = s.split("-");
		for(int i = 0; i<subject.length;i++) {
			System.out.println((i+1) + " : " + subject[i]);
		}
		s = "ȫ�浿  , ���  , �̸���   , ������   , �Ӳ���";
		//���ڿ��� �̸��� ���. �̸� ���� ����ϱ�
		String[] subject2 = s.split(",");
		for(int i = 0; i<subject2.length; i++) {
			System.out.println(subject2[i].trim());
			if(i==subject2.length-1) {
				System.out.println("�� " + (i+1) + "�� �Դϴ�.");
			}
		}
		//���ڿ� => ���� ����
		int i = Integer.parseInt("255");
		System.out.println(i+1);		//101
		double d = Double.parseDouble("10.5");
		System.out.println(d+1.1);		//11.6
		float f = Float.parseFloat("10.5");
		System.out.println(f + 1.1);	//11.6
		
		//���ڿ��� Format ���·� ����ϱ�
		//%.2f : �Ǽ��� �Ҽ��� ���� 2�ڸ����� ���. �ڵ��ݿø�
		//%10d : 10�ڸ��� Ȯ���Ͽ� 10������ ���
		//%X : 16������ ���
		//%o : 8������ ���
		String sf = String.format("%.2f", d+0.125);
		System.out.println(sf);				//10.63
		sf = String.format("%10d", i);		//          255
		System.out.println(sf);
		sf = String.format("%X", i);		//FF
		System.out.println(sf);
		sf = String.format("%x", i);		//ff
		System.out.println(sf);
		sf = String.format("%o", i);		//377
		System.out.println(sf);
	}
}