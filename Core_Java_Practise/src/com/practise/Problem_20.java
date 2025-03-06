package com.practise;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Problem_20 {

	public static void main(String[] args) {

		LinkedList l1 = new LinkedList();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		System.out.println("---------------");
		Iterator i = l1.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("---------------");
		ListIterator l = l1.listIterator();
		// here cursor is in first positions
		while (l.hasNext()) {
			System.out.println(l.next());
		}
		// cursor already in last location
		System.out.println("---------------");
		while (l.hasPrevious()) {
			System.out.println(l.previous());
		}
		System.out.println("---------------");
		Iterator d = l1.descendingIterator();
		while (d.hasNext()) {
			System.out.println(d.next());
		}

	}

}
