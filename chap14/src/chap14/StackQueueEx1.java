package chap14;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 * Stack Ŭ���� : LIFO(Last IN First OUT)
 *              List ��ü.
 *              VectorŬ������ ���� Ŭ����
 *    push(Object o) : ��ü�� stack�� ����. �߰�.
 *    Object pop() : stack�� ����� ��ü�� ����. ����.
 *    Object peek() : stack�� ����� ��ü�� ��ȸ. ����x
 *
 *Queue �������̽� : FIFO(First IN First OUT)
 *                LinkedList Ŭ������ ���� Ŭ����(List, Queue ���� ���� Ŭ����)
 *    offer(Object o) : ��ü�� Queue�� ����. �߰�.
 *    Object poll() : Queue�� ����� ��ü�� ����. ����.
 *    Object peek() : Queue�� ����� ��ü�� ��ȸ. ����x
 */
public class StackQueueEx1 {
	public static void main(String[] args) {
		String[] cars = {"�ҳ�Ÿ", "�׷���", "SM5", "K9"};
		Stack<String> stack = new Stack<>();
		for(String s : cars) stack.push(s);
		System.out.println("���ÿ� ����� ��ü�� ���� : " + stack.size());
		System.out.println(stack.peek());
		System.out.println("���ÿ� ����� ��ü�� ���� : " + stack.size());
		System.out.println(stack.pop());
		System.out.println("���ÿ� ����� ��ü�� ���� : " + stack.size());
		
		Queue<String> queue = new LinkedList<String>();
		for(String s : cars) queue.offer(s);
		System.out.println("ť�� ����� ��ü�� ���� : " + queue.size());
		System.out.println(queue.peek());
		System.out.println("ť�� ����� ��ü�� ���� : " + queue.size());
		System.out.println(queue.poll());
		System.out.println("ť�� ����� ��ü�� ���� : " + queue.size());		
	}
}