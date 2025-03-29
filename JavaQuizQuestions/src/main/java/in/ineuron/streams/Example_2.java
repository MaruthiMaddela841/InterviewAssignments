package in.ineuron.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Example_2 {

	public static void main(String[] args) {
		
	//Finding word with highest length
	String s1="I am learning Streams API in java";
	String s1Ans = Arrays.stream(s1.split(" ")).max(Comparator.comparing(String::length)).get();
	System.out.println(s1Ans);
	
	System.out.println("*****************************");
	
	//Remove duplicate characters and return in same order
	String s2="dabcadefg";
	s2.chars().distinct().mapToObj(x->(char)x).forEach(System.out::print);
	System.out.println();
	Arrays.stream(s2.split("")).distinct().forEach(System.out::print);
	System.out.println();
	
	System.out.println("*****************************");
	//Find word with second highest length
	String s1Ans2 = Arrays.stream(s1.split(" ")).sorted(Comparator.comparing(String::length).reversed()).skip(1).findFirst().get();
	System.out.println(s1Ans2);
	
	System.out.println("*****************************");
	////Find word with second highest length digit in a sentence
	Integer s1Ans3 = Arrays.stream(s1.split(" ")).map(x->x.length()).sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
	System.out.println(s1Ans3);
	
	System.out.println("*****************************");
	//Find occurence of each word
	String s3="I am learning Streams API API in java java";
	Map<String, Long> s3Ans = Arrays.stream(s3.split(" ")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	System.out.println(s3Ans);
	Map<String, Long> s3Ans2 = Arrays.stream(s3.split(" ")).collect(Collectors.groupingBy(x->x,Collectors.counting()));
	System.out.println(s3Ans2);
	
	System.out.println("*****************************");
	//Find the words with specified no of vowels
	Arrays.stream(s3.split(" ")).filter(x->x.replaceAll("[^aeiouAEIOU]","").length()==2).forEach(System.out::println);
	
	System.out.println("*****************************");
	//Divide given Integer list into even & odd
	int[] arr1= {1,2,3,4,5,6,7,8,9};
	List<Integer> list1 = Arrays.stream(arr1).boxed().collect(Collectors.toList());
	Map<Boolean, List<Integer>> checkedList = list1.stream().collect(Collectors.groupingBy(x->x%2==0,Collectors.toList()));
	System.out.println(checkedList);
	List<List<Integer>> checkedList2 = list1.stream().collect(Collectors.groupingBy(x->x%2==0,Collectors.toList())).entrySet().stream().map(x->x.getValue()).collect(Collectors.toList());
	System.out.println(checkedList2);
	//PartitioningBy uses a Predicate
	//GroupingBy uses a Function
	List<List<Integer>> checkedList3 = list1.stream().collect(Collectors.partitioningBy(x->x%2==0,Collectors.toList())).entrySet().stream().map(x->x.getValue()).collect(Collectors.toList());
	System.out.println(checkedList3);
	
	System.out.println("*****************************");
	//Find the occurence of each character
	String s4="mississipi";
	Map<String, Long> s4Ans = Arrays.stream(s4.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	System.out.println(s4Ans);
	
	System.out.println("*****************************");
	//Arrange ascending and descending order
	int[] arr2= {3,6,4,8,2,9,1};
	Arrays.stream(arr2).mapToObj(x->x).sorted().forEach(System.out::print);
	System.out.println();
	Arrays.stream(arr2).mapToObj(x->x).sorted(Collections.reverseOrder()).forEach(System.out::print);
	System.out.println();
	
	System.out.println("*****************************");
	//Find the sum of unique elements
	int[] arr3= {1,3,5,2,5,3,6,4};
	Integer sumOfDistinct = Arrays.stream(arr3).mapToObj(x->x).distinct().reduce(0,(a,b)->a+b);
	System.out.println(sumOfDistinct);
	int sum = Arrays.stream(arr3).distinct().sum();
	System.out.println(sum);
	}

}