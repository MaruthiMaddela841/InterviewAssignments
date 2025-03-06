package com.practise;

public class Problem_9 {

	public static void main(String[] args) {

		int x = 10, y = 15;
		if (++x < 10 & ++y > 15) { // 11<10(false) & 16>15(true)
			x++;
		} else {
			y++;// 17
		}
		System.out.println(x + "----" + y);

	}

}
