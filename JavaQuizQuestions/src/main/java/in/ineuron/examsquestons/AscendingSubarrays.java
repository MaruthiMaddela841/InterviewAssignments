package in.ineuron.examsquestons;

import java.util.ArrayList;
import java.util.List;

public class AscendingSubarrays {

	public static void main(String[] args) {

		int[] array = { 1, 3, 5, 3, 6, 9 };

		List<List<Integer>> ascendingSubarrays = findAscendingSubarrays(array);

		// Print each ascending subarray
		System.out.println("Ascending subarrays:");
		for (List<Integer> subarray : ascendingSubarrays) {
			System.out.println(subarray);
		}
	}

	public static List<List<Integer>> findAscendingSubarrays(int[] array) {
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> currentSubarray = new ArrayList<>();

		for (int i = 0; i < array.length; i++) {
			// Add the current element to the current subarray
			currentSubarray.add(array[i]);

			// Check if the next element breaks the ascending order or if it's the last
			// element
			if (i == array.length - 1 || array[i] >= array[i + 1]) {
				// Add the current subarray to the result if it has more than one element
				if (currentSubarray.size() > 1) {
					result.add(new ArrayList<>(currentSubarray));
				}
				// Reset the current subarray
				currentSubarray.clear();

			}

		}
		return result;
	}
}