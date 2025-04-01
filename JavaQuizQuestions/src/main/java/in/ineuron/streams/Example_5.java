package in.ineuron.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.StringJoiner;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example_5 {

	public static void main(String[] args) {

		// Calculate average of all numbers
		Integer[] arr1 = { 1, 6, 3, 8, 2, 6, 3 };
		int[] arr2 = { 1, 6, 3, 8, 2, 6, 3 };
		double arr1Ans = Arrays.stream(arr1).mapToDouble(Integer::doubleValue).average().orElse(0.0);
		System.out.println(arr1Ans);

		double arr2Ans = Arrays.stream(arr2).average().orElse(0.0);
		System.out.println(arr2Ans);

		System.out.println("*****************************");
		// Intersection of two lists
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> list2 = Arrays.asList(3, 5, 6, 7);
		List<Integer> collect = list1.stream().filter(list2::contains).collect(Collectors.toList());
		System.out.println(collect);

		System.out.println("*****************************");
		// Find the list of domains
		Employee e1 = new Employee("Sam", "Sam@gmail.com");
		Employee e2 = new Employee("Adam", "Adam@gmail.com");
		Employee e3 = new Employee("John", "John@outlook.com");

		List<Employee> empList = new ArrayList<Employee>();
		empList.add(e1);
		empList.add(e3);
		empList.add(e2);

		Map<String, Long> collect2 = empList.stream().map(x -> x.getEmail().substring(x.getEmail().indexOf("@")))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(collect2);

		// Fibonacci Series
		int a = 0;
		int b = 1;
		List<Integer> fibonacci = Stream.iterate(new int[] { 0, 1 }, 
				f -> new int[] { f[1], f[0] + f[1] }).limit(10)
				.map(f -> f[0]).collect(Collectors.toList());
		System.out.println(fibonacci);
		System.out.println("***************************");
		System.out.print(a + " ");
		for (int i = 1; i < 10; i++) {
			System.out.print(b + " ");
			int sum = a + b;
			a = b;
			b = sum;

		}
		
		System.out.println();
		System.out.println("***************************");
		//Employee names in a single string separated by |
		Collector<Employee, StringJoiner, String> empCollector = Collector.of(
				()->new StringJoiner(" | "),
				(j,p)->j.add( p.getName()).toString().toUpperCase(),
				(j1,j2)->j1.merge(j2),
				StringJoiner::toString);
		String names = empList.stream().collect(empCollector);
		System.out.println(names);
		
		System.out.println("***************************");
		//Group Strings based on first character
		List<String> strings=Arrays.asList("apple","banana","apricot","cherry","blueberry","avacado");
		Map<String, Long> collect3 = strings.stream().map(x->x.substring(0,1)).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(collect3);
		Map<String, Long> collect4 = strings.stream().collect(Collectors.groupingBy(x->x.substring(0,1),Collectors.counting()));
		System.out.println(collect4);
		
		System.out.println("***************************");
		//Convert list to map
		empList.stream().collect(Collectors.groupingBy(Employee::getName))
		.forEach((k,v)->System.out.println(k+" "+v));
		
		System.out.println("***************************");
		//Multiply array elements
		Integer[] arr3 = { 1, 6, 3};
		Optional<Integer> reduce = Arrays.asList(arr3).stream().reduce((e,f)->e*f);
		if(reduce.isPresent()) {
			System.out.println(reduce.get());
		}
		
		System.out.println("***************************");
		//Reusing streams more than once
		List<String> names1=Arrays.asList("Alice","Bob","Charlie");
		Supplier<Stream<String>> namesStream=()->names1.stream();
		
		//Consumption1
		namesStream.get().forEach(System.out::println);
		//Consumption2
		long listsize=namesStream.get().count();
		System.out.println(listsize);
	}

}

class Employee {
	private String name;
	private String email;

	public Employee() {
		super();
	}

	public Employee(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", email=" + email + "]";
	}
	
	

}