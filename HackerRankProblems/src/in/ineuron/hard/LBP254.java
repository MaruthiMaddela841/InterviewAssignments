package in.ineuron.hard;

import java.util.Scanner;

public class LBP254 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            int temp=arr[i];
            for(int j=1;j<=temp;j++){
                int cube=(int)Math.pow(j,3);
                if(cube==arr[i]){
                    System.out.print(arr[i]+" ");
                    break;
                }
            }
        }

	}

}
/*The e-commerce company 'Easy Shopping' displays some specific products for its premium customers on its user interface. The company shortlisted a list of N products. The list contains the price of each product. The company will select random products for display. The selection criteria states that only those products whose price is a perfect cube number will be selected for display. The selection process is automated and is done by the company's system. The company wishes to know the total count of the products selected for display.
Write an algorithm to find the count of products that will be displayed.

Input Format

an array size and elements

Constraints

no

Output Format

perfect cube elements

Sample Input 0

5
1 2 3 4 5
Sample Output 0

1
Sample Input 1

10
1 2 3 4 5 6 7 8 9 10
Sample Output 1

1 8
Sample Input 2

5
1 2 4 8 27
Sample Output 2

1 8 27
*/