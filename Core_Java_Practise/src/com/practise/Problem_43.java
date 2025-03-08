package com.practise;

public class Problem_43 {

	String title;
	int value;

	public Problem_43() {
		title += " World";
	}

	public Problem_43(int value) {
		this.value = value;
		title = "Hello";
		//Problem_43();
	}

	public static void main(String[] args) {
		Problem_43 c = new Problem_43(5);
		 System.out.println(c.title);
	}
}
