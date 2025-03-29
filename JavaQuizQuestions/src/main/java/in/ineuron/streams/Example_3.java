package in.ineuron.streams;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Example_3 {

	public static void main(String[] args) {

		// Finding first non repeated character
		String str = "HeHllo World";
		String strAns = str.chars().mapToObj(c -> String.valueOf((char) c))
				.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting())).entrySet().stream()
				.filter(x -> x.getValue() == 1).map(Map.Entry::getKey).findFirst().orElse(null);
		System.out.println(strAns);

		String strAns2 = Arrays.stream(str.split("")).filter(c -> str.indexOf(c) == str.lastIndexOf(c)).findFirst()
				.get();
		System.out.println(strAns2);
		System.out.println("*****************************");

	}

}