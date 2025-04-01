package in.ineuron.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.StringJoiner;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example_7 {

	public static void main(String[] args) {

		//Commonly used methods in streams
		List<String> names=Arrays.asList("Ema","John","Amit","Karen");
		
		//1. stream() -> Converts Collection to Stream
		Stream<String> stream = names.stream();
		System.out.println(stream);
		
		System.out.println("***************************");
		//2. filter() -> Filters Based on a Predicate
		List<String> collect = names.stream().filter(x->x.startsWith("A")).collect(Collectors.toList());
		System.out.println(collect);
		
		System.out.println("***************************");
		//3. map() -> Transforms each element into another form
		List<Integer> collect2 = names.stream().map(String::length).collect(Collectors.toList());
		System.out.println(collect2);
		
		System.out.println("***************************");
		//4. flatMap() -> Flattens nested structure into a single stream
		List<List<String>> names2 = Arrays.asList(Arrays.asList("Ema","John","Amit","Karen"),Arrays.asList("Mike"));
		List<String> collect3 = names2.stream().flatMap(Collection::stream).collect(Collectors.toList());
		System.out.println(collect3);
		
		System.out.println("***************************");
		//5. forEach()-> Performs an action on each element
		names.stream().collect(Collectors.toList()).forEach(System.out::println);
		
		System.out.println("***************************");
		//6. collect()-> Collects the element into a collection
		names.stream().collect(Collectors.toList()).forEach(System.out::println);
		
		System.out.println("***************************");
		//7. sorted() -> Sorts the collection
		names.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);
		
		System.out.println("***************************");
		//8. limit() -> Limits the no of elements in a stream
		names.stream().limit(2).collect(Collectors.toList()).forEach(System.out::println);
		
		System.out.println("***************************");
		//9. distinct() ->returns distinct elements in collection
		List<String> names3=Arrays.asList("Ema","John","Amit","Karen","Karen");
		names3.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
		
		System.out.println("***************************");
		//10. skip() -> Skips first n elements from stream
		names3.stream().skip(2).collect(Collectors.toList()).forEach(System.out::println);
		
		System.out.println("***************************");
		//peek() -> Allowing inspection of each element in the stream
		List<String> collect4 = names.stream().peek(System.out::println).collect(Collectors.toList());
		//System.out.println(collect4);
		
		System.out.println("***************************");
		//count() -> count of elements in a collection
		long count = names3.stream().count();
		System.out.println(count);
		
		System.out.println("***************************");
		//allMatch() -> Returns boolean value if all elements in collection match the condition
		List<Integer> li=Arrays.asList(1,2,9,4,4);
		boolean allMatch = li.stream().allMatch(x->x<10);
		System.out.println(allMatch);
		
		System.out.println("***************************");
		//anyMatch() -> Returns boolean value if any element in collection match the condition
		boolean anyMatch = li.stream().anyMatch(x->x==5);
		System.out.println(anyMatch);
		
		System.out.println("***************************");
		//noneMatch() -> Returns boolean value if no element in collection match the condition
		boolean noneMatch = li.stream().noneMatch(x->x==5);
		System.out.println(noneMatch);
		 
		System.out.println("***************************");
		//findFirst() -> Returns first element from the collection
		Integer integer = li.stream().filter(x->x>3).findFirst().get();
		System.out.println(integer);
		
		System.out.println("***************************");
		//findAny() -> Returns any element from the collection
		Integer integer2 = li.stream().filter(x->x>1).findAny().get();
		System.out.println(integer2);
		
		System.out.println("***************************");
		//toArray() -> Stream to Array
		List<String> asList = Arrays.asList("a","b","c","d");
		String[] array = asList.stream().toArray(String[]::new);
		for(String o:array) {
			System.out.print(o+" ");
		}
		System.out.println();
		
		System.out.println("***************************");
		//of() -> Creates a stream from set of values
		Stream<String> of = Stream.of("Maru","Mike","Bobbi","Madd");
		of.collect(Collectors.toList()).forEach(System.out::println);
		
		System.out.println("***************************");
		//concat() ->concatenate two streams
		List<String> collect5 = Stream.concat(Arrays.asList("Maruthi").stream(),Arrays.asList("Maddela").stream()).collect(Collectors.toList());
		System.out.println(collect5);
		
		System.out.println("***************************");
		//reduce() ->reduces the elements into single element
		Integer reduce = li.stream().reduce(0,(a,b)->a+b);
		System.out.println(reduce);
		
		System.out.println("***************************");
		List<Integer> li2=Arrays.asList(1,2,9,4,4);
		//max() -> Returns max from a stream
		Optional<Integer> max = li2.stream().max(Integer::compareTo);
		System.out.println(max.get());
		
		System.out.println("***************************");
		//min() -> Returns min from a stream
		Optional<Integer> min = li2.stream().min(Integer::compareTo);
		System.out.println(min.get());
		
		System.out.println("***************************");
		//generate() ->  Create an infinite stream of elements
		Stream.generate(Math::random).limit(10).forEach(System.out::println);
		Stream.generate(()->(int)(Math.random()*49+1)).limit(10).forEach(System.out::println);
		
		System.out.println("***************************");
		//iterate() -> generates infinite result
		Stream.iterate(1,x->x+1).limit(10).forEach(System.out::println);
	}

}