/*
 * ȭ�鿡�� �������� �ڿ����� �Է¹޾� �̵� �� Ȧ�� �� �ڿ������� ��� ���

 ������ ���ϰ�, Ȧ���� �ִ밪�� �ּҰ��� ã�� ���α׷��� �ۼ��ϱ�

 Ȧ�� ��θ� �̷���� List ��ü�� �����Ͽ� ����ϱ�

 �ִ밪 : Collections.max(list)  

 �ּҰ� : Collections.man(list)




 7���� �ڿ��� : 12 77 38 41 53 92 85 �� ���

  

  77 41 63 85 �� Ȧ�� �̹Ƿ�

  77+41+53+85 = �� 

  Ȧ ���� �ִ밪 : 85

  Ȧ ���� �ּҰ� : 41

  �Էµ� Ȧ�� : [77,41,63,85]
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test1 {
 public static void main(String[] args) {
  List<Integer> list = new ArrayList<Integer>();
  int sum = 0;
  int max = 0;
  int min;
  System.out.println("�ڿ����� �Է��ϼ���");
  Scanner scan = new Scanner(System.in);
  String inputs = scan.nextLine();
  Scanner scan2 = new Scanner(inputs).useDelimiter(" ");
  while(scan2.hasNextInt()) {
   int input = scan2.nextInt();
   if(input%2==1) {
     list.add(input);
     sum += input;
    }
  }
   
  int k = 0;
  for(Integer a : list) {
   k++;
   System.out.print(a + (k==list.size()?" = "+sum:" + "));
  }
  System.out.println("\nȦ���� �ִ� �� : " + Collections.max(list));
  System.out.println("Ȧ���� �ּ� �� : " + Collections.min(list));
  System.out.println("Ȧ���� �ִ밪 ��ġ : " + list.indexOf(Collections.max(list)));
  System.out.println("Ȧ���� �ּҰ� ��ġ : " + list.indexOf(Collections.min(list)));
  System.out.println("�Էµ� Ȧ�� : " + list);
 }
}