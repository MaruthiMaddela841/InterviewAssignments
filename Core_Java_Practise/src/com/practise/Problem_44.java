package com.practise;

interface DeclareStuff {
	public static final int EASY = 3;

	void doStuff(int t);
}

public class Problem_44  implements DeclareStuff {

	public static void main(String[] args) {

		int x = 5;
	    new Problem_44().doStuff(++x);
		
	}

	@Override
	public void doStuff(int s) {
		s += EASY + ++s;
	    System.out.println("s " + s);
	}
}
