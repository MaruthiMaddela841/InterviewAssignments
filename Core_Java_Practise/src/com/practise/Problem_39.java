package com.practise;

public class Problem_39 {

	public static void main(String[] args) {

		final int i1 = 1;
        final Integer i2 = 1;//memory will be decied at the runtime becoz it is wrapper class Object
        final String s1 = ":ONE";
        String str1 = i1 + s1;// Compiler :: 1 + :ONE => 1:ONE
        String str2 = i2 + s1;// Compiler :: i2 + :ONE 
        System.out.println(str1 == "1:ONE");//true
        System.out.println(str2 == "1:ONE");//false
        System.out.println(str1);
        System.out.println(str2);

	}
}
