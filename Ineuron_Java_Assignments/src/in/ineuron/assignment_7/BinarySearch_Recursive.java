package in.ineuron.assignment_7;

import java.util.Scanner;

public class BinarySearch_Recursive {

	public static void main(String[] args) {
		
		int[] arr= {1,6,9,11,45,55};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Num::");
		int search=sc.nextInt();
		int first=0;
		int last=arr.length;
		int mid=(first+last)/2;
		
		checkBinarySearch(arr,search,first,last,mid);

	}

	private static void checkBinarySearch(int[] arr, int search, int first, int last, int mid) {
		
		System.out.println("First::"+first);
		System.out.println("Last::"+last);
		System.out.println("Mid::"+mid);
		if(search==arr[mid]) {
			System.out.println("Element found at position::"+mid);
			return;
		}
		else if(first==mid) {
			System.out.println("Element not found");
			return;
		}
		else if(search<arr[mid]) {
			last=mid;
			mid=(first+last)/2;
		}
		else if(search>arr[mid]) {
			first=mid;
			mid=(first+last)/2;
		}
		
		checkBinarySearch(arr,search,first,last,mid);
		
	}

}
