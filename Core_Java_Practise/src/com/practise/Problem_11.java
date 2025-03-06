package com.practise;

public class Problem_11 {

	public static void main(String[] args) {

		 int x= 10; 
		 //int y = 20;
		 final int y = 20;
		  switch(x) 
		 { 
		 case 10: System.out.println("hello"); 
		   break;
		  case y:System.out.println("hiee"); //CE: 'y' value is not CompileTime Constant
		  }
	}

}
