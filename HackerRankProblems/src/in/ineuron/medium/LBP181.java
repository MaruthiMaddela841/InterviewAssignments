package in.ineuron.medium;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LBP181 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arr = str.split("");

		Map<String, Integer> map = new LinkedHashMap<>();
		for (String s : arr) {
			map.put(s, map.getOrDefault(s, 0) + 1);
		}
		int count = 1;
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				if (count == 1) {
					count++;
					continue;
				} else {
					System.out.println(entry.getKey());
					break;
				}
			}
		}
	}
}
/*
 * sofia loved to play with the programs unfortunately. she got stuck in one of
 * the questions. she tought to take help of james. james asked her the problem
 * statement. The problem statement was. "for the given string S of length N
 * consist of stream of character not in predefined order. Write a program to
 * find second non-repeating character in a string S. Write a program to help
 * sofia and james for the given problem statements.
 * 
 * Input Format
 * 
 * string from the user
 * 
 * Constraints
 * 
 * no
 * 
 * Output Format
 * 
 * single character
 * 
 * Sample Input 0
 * 
 * gaahaajapsps Sample Output 0
 * 
 * h Sample Input 1
 * 
 * welcome Sample Output 1
 * 
 * l Sample Input 2
 * 
 * demo Sample Output 2
 * 
 * e
 */