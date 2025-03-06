package com.practise;

public class Problem_1 {

	public static void main(String[] args) {
		
		byte b1 = ( byte ) ( 127 + 21 );    // byte b1 = (byte)(148)  
        System.out.println(b1);
//       VM : minrange + (result-maxrange-1)
//       = -128    + (148 - 127-1)
//       = -128     +(148-128)
//       = -128     +(20)
//       = -108

	}

}
