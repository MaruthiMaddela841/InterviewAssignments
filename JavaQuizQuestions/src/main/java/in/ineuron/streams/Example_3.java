package in.ineuron.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Example_3 {

	public static void main(String[] args) {

		// Finding first non repeated character
		String str = "HeHllo World";
		String strAns = str.chars().mapToObj(c -> String.valueOf((char) c))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(x -> x.getValue() == 1).map(Map.Entry::getKey).findFirst().orElse(null);
		System.out.println(strAns);

		String strAns2 = Arrays.stream(str.split("")).filter(c -> str.indexOf(c) == str.lastIndexOf(c)).findFirst()
				.get();
		System.out.println(strAns2);

		System.out.println("*****************************");
		// Find first repeated character
		String str2 = "Hello World";
		Entry<Character, Long> str2Ans = str2.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(x -> x.getValue() > 1).findFirst().get();
		System.out.println(str2Ans.getKey());

		System.out.println("*****************************");
		// Int array-> Group no's by range
		int[] arr1 = { 1, 3, 7, 9, 12, 15, 18, 23, 26, 28, 32, 45, 46, 55, 56, 51 };
		Map<Integer, List<Integer>> collect = Arrays.stream(arr1).boxed()
				.collect(Collectors.groupingBy(x -> x / 10 * 10, Collectors.toList()));
		System.out.println(collect);

		System.out.println("*****************************");
		// Given list of strings, create list contains only integers
		String[] str3 = { "Mike", "123", "Maru", "45" };
		Arrays.stream(str3).filter(x -> x.matches("[0-9]+")).map(Integer::valueOf).collect(Collectors.toList())
				.forEach(System.out::println);

		System.out.println("*****************************");
		// Find the product of first two elements in an array
		int[] arr2 = { 12, 5, 3, 4, 2, 9 };
		Integer arr2Ans = Arrays.stream(arr2).boxed().collect(Collectors.toList()).stream().limit(2).reduce(1,
				(a, b) -> a * b);
		System.out.println(arr2Ans);
		
		System.out.println("*****************************");
		// Find anagrams for list of strings. For 1 word consider only 1 anagram
		String[] str4 = { "pat", "tap", "pan", "nap", "Team", "tree", "meat" };
		Arrays.asList(str4).stream().collect(Collectors
				.groupingBy(x -> Arrays.stream(x.toLowerCase().split(""))
				.sorted().collect(Collectors.toList())))
				.entrySet().stream().forEach(c->System.out.println(c.getValue()));
		
		System.out.println("*****************************");
		//Multiply alternative numbers in an array
		int[] arr4= {1,4,2,7,3,5,4};
		int arr4Ans = IntStream.range(0,arr4.length).filter(x->x%2==0).map(x->arr4[x]).reduce(1,(a,b)->a*b);
		System.out.println(arr4Ans);
		
		System.out.println("*****************************");
		//Multiple 1st and last elemtn, 2nd and 2nd last and so on
		IntStream.range(0, arr4.length/2).map(x->arr4[x]*arr4[arr4.length-x-1]).forEach(System.out::println);
		
		System.out.println("*****************************");
		//Move all zeros to beginning of an array
		int[] arr5= {2,6,0,1,0,3};
		List<Integer> arr5Collect = Arrays.stream(arr5).boxed().collect(Collectors.toList());
		//1st approach
		List<Integer> zeros = arr5Collect.stream().filter(x->x==0).collect(Collectors.toList());
		List<Integer> nonZeros = arr5Collect.stream().filter(x->x!=0).collect(Collectors.toList());
		List<Integer> finalList=new ArrayList<>();
		finalList.addAll(zeros);
		finalList.addAll(nonZeros);
		finalList.forEach(System.out::print);
		System.out.println();
		
		//2nd approach
		Map<Boolean, List<Integer>> partitionMap = arr5Collect.stream().collect(Collectors.partitioningBy(x->x!=0));
		partitionMap.values().stream().flatMap(x->x.stream()).collect(Collectors.toList()).forEach(System.out::print);
		System.out.println();
		
		System.out.println("*****************************");
		//Given integer array, return true if array contains distinct elements or false
		int[] arr6= {1,2,3,4,5};
		boolean arr6Ans = Arrays.stream(arr6).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet().stream().allMatch(x->x.getValue()==1);
		System.out.println(arr6Ans);
		
		boolean arr6Ans1 = Arrays.stream(arr6).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet().stream().noneMatch(x->x.getValue()>1);
		System.out.println(arr6Ans1);
	}

}