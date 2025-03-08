package com.practise;

public class Problem_33 {
	
	private static void m(int i, int j) {
        i++;
        j--;
    }

	public static void main(String[] args) {

		int a = 3;
        m(++a, a++);
        System.out.println(a);

	}
}
