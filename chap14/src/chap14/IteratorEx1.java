package chap14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IteratorEx1 {
	public static void main(String[] args) {
		Iterator it = null;
		List list = new ArrayList();
		Set set = new HashSet();
		for(int i =1; i<=5; i++) {
			list.add(i*10);
			set.add(i);
		}
		System.out.println(list);
		System.out.println(set);
		it = list.iterator();
		print(it);
		it = set.iterator();
		print(it);
		System.out.println(list);
		System.out.println(set);
		print(list);
		print(set);
	}
	private static void print(Collection c) {
		for(Object o : c) {
			System.out.println(o);
		}
	}
	private static void print(Iterator it) {
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
			if(o.equals(30)) it.remove();
		}
	}
}