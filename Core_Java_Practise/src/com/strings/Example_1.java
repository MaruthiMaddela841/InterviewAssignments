package com.strings;

public class Example_1 {

	public static void main(String[] args) {

		// Example_1
//		String s1 = "sachin";
//		System.out.println(s1);
//		String s2 = new String("sachin");
//		System.out.println(s2);

		// Example_2
//		String s= "sachin";
//        s.concat("tendulkar");
//        System.out.println(s);
//        StringBuilder sb=new StringBuilder("sachin");
//        sb.append("tendulkar");
//        System.out.println(sb);

		// Example_3
//		String s1 = new String("sachin");
//		String s2 = new String("sachin");
//		System.out.println(s1 == s2);
//		System.out.println(s1.equals(s2));

		// Example_4
//		StringBuilder sb1 = new StringBuilder("sachin");
//		StringBuilder sb2 = new StringBuilder("sachin");
//		System.out.println(sb1 == sb2);
//		System.out.println(sb1.equals(sb2));

		// Example_5
//		String s1=new String("dhoni");
//        String s2=new String("dhoni");
//        String s3="dhoni";
//        String s4="dhoni";
//        System.out.println(s1==s2);
//        System.out.println(s3==s4);

		// Example_6
//		String s = new String("sachin");
//		s.concat("tendulkar");
//		s = s.concat("IND");
//		s = "sachintendulkar";
//		System.out.println(s);

		// Example_7
//		String s1 = new String("sachin");
//		s1.concat("tendulkar");
//		s1 += "IND";
//		String s2 = s1.concat("MI");
//		System.out.println(s1);

		// Example_8
//		String s1 = new String("you cannot change me!");
//		String s2 = new String("you cannot change me!");
//		System.out.println(s1 == s2);
//		String s3 = "you cannot change me!";
//		System.out.println(s1 == s3);
//		String s4 = "you cannot change me!";
//		System.out.println(s3 == s4);
//		String s5 = "you cannot " + "change me!";
//		System.out.println(s3 == s5);
//		String s6 = "you cannot ";
//		String s7 = s6 + "change me!";
//		System.out.println(s3 == s7);
//		final String s8 = "you cannot ";
//		String s9 = s8 + "change me!";
//		System.out.println(s3 == s9);
//		System.out.println(s6 == s8);

		// Exampl_9
//		String s1 = new String("sachin");
//		String s2 = s1.intern();
//		System.out.println(s1 == s2);
//		String s3 = "sachin";
//		System.out.println(s2 == s3);

		// Example_10
//		String s1 = new String("sachin");
//		String s2 = s1.concat("IND");
//		String s3 = s2.intern();
//		String s4 = "sachinIND";
//		System.out.println(s3 == s4);

		// Example_11
//		String s1 = "sachin";
//		String s2 = s1.toUpperCase();
//		String s3 = s1.toLowerCase();
//		System.out.print(s1 == s2);
//		System.out.print(s1 == s3);

		// Example_12
//		String s1 = "sachin";
//		String s2 = s1.toString();
//		System.out.print(s1 == s2);

		// Example_13
//		String s1 = new String("sachin");
//		String s2 = s1.toString();
//		String s3 = s1.toUpperCase();
//		String s4 = s1.toLowerCase();
//		String s5 = s1.toUpperCase();
//		String s6 = s1.toLowerCase();
//		System.out.print(s1 == s6);
//		System.out.print(s3 == s5);

		// Example_14
//		String s1 = "OcA";
//		String s2 = "oCa";
//		System.out.println(s1.equals(s2));

		// Example_15
//		String s1 = "OCAJP";
//		String s2 = "OCAJP" + "";
//		System.out.println(s1 == s2);

		// Example_16
//		final String fName = "James";
//		String lName = "Gosling";
//		String name1 = fName + lName;
//		String name2 = fName + "Gosling";
//		String name3 = "James" + "Gosling";
//		System.out.println(name1 == name2);
//		System.out.println(name2 == name3);

		// Example_17
//		String s1 = " ";
//		System.out.println(s1.isBlank());
//		System.out.println(s1.isEmpty());
		
		//Example_18
//		 String s1 = new String("JAVA");
//		 String s2 = new String("JAVA");
//		 System.out.println(s1 == s2);
//		 System.out.println(s1.equals(s2));
//		 System.out.println(s1 == s2.intern());
//		 System.out.println(s1.intern() == s2.intern());
//		 System.out.println(s1.intern() == s2);
		
		//Example_19
//		StringBuilder sb = new StringBuilder("Java");
//        String s1 = sb.toString();
//        String s2 = "Java";
//        System.out.println(s1 == s2);

	}

}

//Method								Creates a New Object?				
//toLowerCase()							✅ Only if case changes				
//toUpperCase()							✅ Always							
//trim()								✅ Only if spaces exist				
//intern()								✅ Only if not in pool				
//replace(char, char)					✅ Only if change occurs				
//replaceAll(String, String)			✅ Only if change occurs				
//substring(int beginIndex)				✅ Always new object
//substring(int begin, int end)			✅ Always new object
//concat(String)						✅ Always new object
//replace(CharSequence, CharSequence)	✅ Always new object
//split(String regex)					✅ Always new object(s)
//String.valueOf(any primitive)			✅ Always new object
//new String("example")					✅ Always new object (forces heap allocation)