package com.practise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Problem_19 {

	public static void main(String[] args) {

		ArrayList a = new ArrayList();
		a.add(100);
		a.add(10);
		a.add(80);
		a.add(50);
		Iterator i = a.iterator();
		System.out.println("Acccesing data in Forward direction using Iterator");
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		ListIterator l = a.listIterator(a.size());
		// cursor is in last position
		System.out.println("Accessing data in Backward direction using ListIterator");
		while (l.hasPrevious()) {
			System.out.println(l.previous());
		}
		System.out.println("Accessing data in Forward direction using ListIterator");
		while (l.hasNext()) {
			System.out.println(l.next());
		}

	}

}
