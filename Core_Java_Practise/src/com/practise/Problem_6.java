package com.practise;

public class Problem_6 {

	public static void main(String[] args) {
		
		char c = 'Z';
        long l = 100_00l;//from JDK1.7 for a literal we can give _ also, if we give compiler will remove that _ in .class file
        int i = 9_2;//from JDK1.7 for a literal we can give _ also, if we give compiler will remove that _ in .class file
        float f = 2.02f; 
        double d = 10_0.35d;//from JDK1.7 for a literal we can give _ also, if we give compiler will remove that _ in .class file
        l = c + i;//char + int = int   int -----> long (implicit)
        f = c * l * i * f;//char * long*int*float = float
        f = l + i + c;//long+int+char = long  long---> float(implicit)
        i = (int)d;//double----> int(explicit)
        f = (long)d;//double---> long  , long ---> float (implicit)

	}

}
