package com.practise;

class A {
    public String toString() {
        return null;
    }
 }

public class Problem_35 {

	public static void main(String[] args) {

		String text = null;
		text = text + new A(); // Line n1 "nullnull"
		System.out.println(text.length()); // Line n2

	}
}
