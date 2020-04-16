package chap17;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * InetAddress Ŭ����
 *   - IP �ּ� ������ �����ϴ� Ŭ����
 *   - ��ü������ ���� �޼���
 *   getByName("�������̸�")
 *   getAllByName("�������̸�")
 *   getByAddress(byte[])
 *   getLocalHost()
 */ 
public class InetAddressEx1 {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress ip = InetAddress.getByName("www.goodee.co.kr");
		System.out.println("getByName �޼��� ȣ��");
		System.out.println("hostname : " + ip.getHostName());
		System.out.println("hostaddress : " + ip.getHostAddress());	//���� IP �ּ�
		InetAddress[] ips = InetAddress.getAllByName("www.naver.com");
		System.out.println("getAllByName �޼��� ȣ��");
		for(InetAddress add : ips)
			System.out.println("IP �ּ� : " + add);
		//Ipv4 : 32bit(4byte)
		byte[] ipAddr = ip.getAddress();
		for(byte b : ipAddr)
			System.out.print(((b<0)?256+b:b)+".");
		System.out.println();
		InetAddress ip2 = InetAddress.getByAddress(ipAddr);
		System.out.println("ip2�� �ּ� : "+ip2);
		System.out.println("\ngetLocalHost �޼��� ȣ��");
		InetAddress local = InetAddress.getLocalHost();
		System.out.println("�� ��ǻ�� : " + local);
	}
}