package chap14;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 * Stack 클래스 : LIFO(Last IN First OUT)
 *              List 객체.
 *              Vector클래스의 하위 클래스
 *    push(Object o) : 객체를 stack에 저장. 추가.
 *    Object pop() : stack에 저장된 객체를 꺼냄. 제거.
 *    Object peek() : stack에 저장된 객체를 조회. 제거x
 *
 *Queue 인터페이스 : FIFO(First IN First OUT)
 *                LinkedList 클래스가 구현 클래스(List, Queue 다중 구현 클래스)
 *    offer(Object o) : 객체를 Queue에 저장. 추가.
 *    Object poll() : Queue에 저장된 객체를 꺼냄. 제거.
 *    Object peek() : Queue에 저장된 객체를 조회. 제거x
 */
public class StackQueueEx1 {
	public static void main(String[] args) {
		String[] cars = {"소나타", "그랜저", "SM5", "K9"};
		Stack<String> stack = new Stack<>();
		for(String s : cars) stack.push(s);
		System.out.println("스택에 저장된 객체의 갯수 : " + stack.size());
		System.out.println(stack.peek());
		System.out.println("스택에 저장된 객체의 갯수 : " + stack.size());
		System.out.println(stack.pop());
		System.out.println("스택에 저장된 객체의 갯수 : " + stack.size());
		
		Queue<String> queue = new LinkedList<String>();
		for(String s : cars) queue.offer(s);
		System.out.println("큐에 저장된 객체의 갯수 : " + queue.size());
		System.out.println(queue.peek());
		System.out.println("큐에 저장된 객체의 갯수 : " + queue.size());
		System.out.println(queue.poll());
		System.out.println("큐에 저장된 객체의 갯수 : " + queue.size());		
	}
}