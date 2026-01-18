package com.ineuron;

public class PileOfStones {

	public static void main(String[] args) {
		
		int[] arr= {3,2,10,4};
		int i=0;
		int j=arr.length-1;
		int alice=0;
		int bob=0;
		
		for(int k=0;k<arr.length/2;k++) {
			if(arr[i]>arr[j]) {
				alice=alice+arr[i];
				i++;
			}
			else {
				alice=alice+arr[j];
				j--;
			}
			if(arr[i]>arr[j]) {
				bob=bob+arr[i];
				i++;
			}
			else {
				bob=bob+arr[j];
				j--;
			}
		}
		
		if(alice>bob)
			System.out.println(true);
		else
			System.out.println(false);

	}

}

//https://leetcode.com/problems/stone-game/description