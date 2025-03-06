package com.practise;

public class Problem_7 {

	public static void main(String[] args) {
		
		int a = 20;   // a = 18
		 int var= --a * a++ + a-- - --a;//  var = 19 * 19 + 20 -18 = 363
		 System.out.println("a = " + a);// a = 18
		 System.out.println("var = " + var);//var= 363

	}

}
