package in.ineuron.recursive;

public class SortArray {

	public static void main(String[] args) {
		
		int[] num= {0,2,5,1,6};
		sortArray(num,num.length);
		for(int n:num) {
			System.out.print(n+" ");
		}
	}

	private static void sortArray(int[] array,int n) {
		// Base case: If the array has one or no elements, it's already sorted
        if (n <= 1) {
            return;
        }

        // Reduce the problem by sorting the first n-1 elements
        sortArray(array, n - 1);

        // Insert the nth element in the correct position
        insertInSortedOrder(array, n - 1);
	}

	private static void insertInSortedOrder(int[] array, int endIndex) {
		int element=array[endIndex];
		int beforePos=endIndex-1;
		//System.out.println(beforePos+" "+element);
		while(beforePos>=0 && array[beforePos]>element) {
			array[beforePos+1]=array[beforePos];
			beforePos--;
		}
		array[beforePos+1]=element;
	}

}
