package com.practise;

interface DoStuff2 {
	float getRange(int low, int high);
}

interface DoMore {
	float getAvg(int a, int b, int c);
}

abstract class DoAbstract implements DoStuff2, DoMore {
}// line-7

class DoStuff implements DoStuff2 {// line-8
	public float getRange(int x, int y) {
		return 3.14f;
	}
}// line-12

interface DoAll extends DoMore {// line-13
	float getAvg(int a, int b, int c, int d);
}

public class Problem_45 {

	public static void main(String[] args) {

	}
}
