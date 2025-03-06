package com.practise;

public class Problem_25 {

	public static void main(String[] args) {

		int a = 7;// a = 7,8,9
		boolean res = (a++ == 7) && (++a == 9) || (a++ == 9); // 7==7(true) && 9==9(true) || a++=9 = true
		System.out.println("a = " + a);
		System.out.println("res = " + res);
	}
}
