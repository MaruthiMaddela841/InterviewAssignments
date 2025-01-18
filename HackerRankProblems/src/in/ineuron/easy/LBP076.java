package in.ineuron.easy;

import java.util.Scanner;

public class LBP076 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        String[] words=str.split(" ");
        String temp;
        for(int j=0;j<words.length;j++){
        for(int i=0;i<words.length-1;i++){
            if(words[i+1].length()>words[i].length()){
                temp=words[i];
                words[i]=words[i+1];
                words[i+1]=temp;
            }
        }
        }
        System.out.println(words[0]);

	}

}
/*Write a function that finds the longest word in a sentence. If two or more words are found, return the first longest word. Characters such as apostophe, comma, period (and the like) count as part of the word (e.g. O'Connor is 8 characters long).

Input Format

a string from the user

Constraints

no

Output Format

longest word

Sample Input 0

Hello Welcome to the world of Java
Sample Output 0

Welcome
Sample Input 1

C CPP Java and Python
Sample Output 1

Python
*/