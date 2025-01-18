package in.ineuron.easy;

import java.util.Scanner;

public class LBP004 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>=30 && n<=100){
            if(n>=30 && n<=50)
                System.out.println("D");
            else if(n>=51 && n<=60)
                System.out.println("C");
            else if(n>=61 && n<=80)
                System.out.println("B");
            else
                System.out.println("A");
        }

	}

}


//The e-commerce company Bookshelf wishes to analyze its monthly sales data between minimum ranges 30 to maximum range 100. The company has categorized these book sales into four groups depending on the number of sales, with the help of these groups the company will know which stock they should increase or decrease in their inventory for the next month. The groups are as follows
//Sales range groups
//30-50 ------------------> D
//51-60 ------------------> C
//61-80 ------------------> B
//81-100 -----------------> A
//Write an algorithm to find the group for the given book sale count.
//
//Input Format
//
//An integer salesCount represent total sales of a book.
//
//Constraints
//
//30<=saleCount<=100
//
//Output Format
//
//A character representing the group of given sale count.
//
//Sample Input 0
//
//90
//Sample Output 0
//
//A
//Sample Input 1
//
//45
//Sample Output 1
//
//D
//Sample Input 2
//
//77
//Sample Output 2
//
//B