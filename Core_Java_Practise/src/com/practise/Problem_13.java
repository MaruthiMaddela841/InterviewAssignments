package com.practise;

public class Problem_13 {

	public static void main(String[] args) {

		 byte x=10; 
		 switch(x) 
		 { 
		 case 10:System.out.println("hello");
		  break;
		  case 100: System.out.println("hiee");
		    break;
		  case (byte) 1000: System.out.println("byee");//CE: possibly loss of precession from byte to int
		      break;
		 }

	}

}
