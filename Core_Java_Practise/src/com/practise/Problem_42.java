package com.practise;

class XYZ {
	private int counter = 0;
	public XYZ() {
		counter++;
	}
//	public static int getInstanceCount() {
//		return counter;
//	}
}

public class Problem_42 {

	public static void main(String[] args) {

		XYZ a1 = new XYZ();
		XYZ a2 = new XYZ();
		XYZ a3 = new XYZ();
		//System.out.println(XYZ.getInstanceCount());

	}
}
