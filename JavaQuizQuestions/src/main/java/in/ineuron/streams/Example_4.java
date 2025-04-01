package in.ineuron.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.OptionalInt;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Example_4 {

	public static void main(String[] args) {
		
		System.out.println("*****************************");
		
		//Group the strings based on the middle character
		String[] str1= {"ewe","jji","jhj","kwk","aha"};
		Map<String, List<String>> str1Ans = Arrays.stream(str1).collect(Collectors.groupingBy(x->x.toString()
				.substring(1,2)));
		System.out.println(str1Ans);
		
		System.out.println("*****************************");
		
		//Sort alphabetically
				Arrays.stream(str1).sorted().forEach(System.out::println);
		
		System.out.println("*****************************");
		
		//Find sum of all elements
		int[] arr1= {1,2,3,4,5,6};
		int arr1Ans = Arrays.stream(arr1).reduce(0,(a,b)->a+b);
		System.out.println(arr1Ans);
		System.out.println(Arrays.stream(arr1).sum());
		
		System.out.println("*****************************");
		
		//Convert list of integers to squares
		Arrays.stream(arr1).map(x->x*x).forEach(System.out::println);
		
		System.out.println("*****************************");
		//Print distinct odd numbers
		Arrays.stream(arr1).filter(x->x%2!=0).distinct().forEach(System.out::println);
		
		System.out.println("*****************************");
		//Union of two list of integers
		int[] arr2= {2,5,1,7,1,6};
		Stream.concat(Arrays.asList(arr1).stream(),Arrays.asList(arr2).stream()).distinct()
		.collect(Collectors.toList()).forEach(x->{
			for(int s:x) {
				System.out.print(s+" ");
			}
		});
		System.out.println();
		
		System.out.println("*****************************");
		//Find the kth smallest element in a list of integers
		int k=3;
		int arr2Ans = Arrays.stream(arr2).sorted().skip(k-1)
				.findFirst().orElseThrow(()->new IllegalArgumentException("Invalid k value"));
		System.out.println(arr2Ans);
		
		System.out.println("*****************************");
		//Remove all non numeric chars from list
		String[] str2= {"a1b2c3","4a9df3j","sk3nsh7"};
		Pattern pattern=Pattern.compile("[^0-9]");
		Arrays.asList(str2).stream().map(x->pattern.matcher(x).replaceAll("")).collect(Collectors.toList())
		.forEach(System.out::println);
		
		System.out.println("*****************************");
		//Print strings containing digits
		String[] str3= {"Maru","m1a2r3u4","Shi123","Bobbiti"};
		Arrays.asList(str3).stream().filter(x->x.matches(".*\\d+.*"))
		.collect(Collectors.toList()).forEach(System.out::println);
		
		System.out.println("*****************************");
		//Convert list of strings to uppercase
		String[] str4= {"Obama","Martin","Luther"};
		Arrays.asList(str4).stream().map(x->x.toUpperCase()).forEach(System.out::println);
		Arrays.asList(str4).stream().map(String::toUpperCase).forEach(System.out::println);
	}

}