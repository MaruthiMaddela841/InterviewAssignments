package in.ineuron.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Example_9 {

	public static void main(String[] args) {
				
		//Print the middle char of given string
		String str1 = "Maruthi";
        int len = str1.length();
        int mid = len / 2;

        String midChar = IntStream.range(0, len)
            .filter(x -> len % 2 == 0 ? (x == mid || x == mid - 1) : x == mid)
            .mapToObj(str1::charAt)
            //.collect(Supplier, Accumulator, Combiner)
            .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
            .toString();
        System.out.println("Middle character(s): " + midChar);
        System.out.println("***************************");
        //Print distinct numbers which starts with 1 in descending order
        int[] arr1= {12,34,11,34,67,121,121,52,78,114,565,1643,11};
        Arrays.stream(arr1)
        .distinct().filter(x->String.valueOf(x).startsWith("1")).boxed()
        .sorted((a,b)->b-a).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("***************************");
        //Return comparison of a Person object based on first name and then last name
        Person2 p1=new Person2("Maruthi","Maddela");
        Person2 p2= new Person2("Shishira","Bobbiti");
        Person2 p3= new Person2("Shishira","Maddela");
        Person2 p4= new Person2("Maruthi","Bobbiti");
        Person2 p5= new Person2("Maruthi","Bobbiti");
        
        List<Person2> pList = List.of(p1,p2,p3,p4,p5);
        pList.stream().sorted(Comparator.comparing(Person2::getFirstName)
        		.thenComparing(Person2::getLastName))
        	.collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("***************************");
      //Print the count of a particular substring
    	String str2="byebyeBirdiebye";
    	String check="bye";
    	long count = IntStream.range(0,str2.length()-2)
    	.filter(x->str2.substring(x,x+3).equals(check))
    	.count();
    	System.out.println(count);
    	System.out.println("***************************");
    	
    	//Find the department with maximum people
    	EmpDept e1=new EmpDept("Maru","SE",1000);
    	EmpDept e2=new EmpDept("Shishira","SSE",2000);
    	EmpDept e3=new EmpDept("Anil","SSE",3000);
    	EmpDept e4=new EmpDept("Maddela","SSE",2000);
    	EmpDept e5=new EmpDept("MM","AE",1000);
    	
    	List<EmpDept> eList = List.of(e1,e2,e3,e4,e5);
    	Map<String, Long> collect = eList.stream().collect(Collectors.groupingBy(EmpDept::getDept,Collectors.counting()));
    	Optional<Entry<String, Long>> max = collect.entrySet().stream().max(Map.Entry.comparingByValue());
    	System.out.println(max);
    	
    	System.out.println("***************************");
    	//Find the average salary from each department
    	Map<String, Double> collect2 = eList.stream()
    			.collect(Collectors.groupingBy(EmpDept::getDept,Collectors.averagingDouble(EmpDept::getSalary)));
    	System.out.println(collect2);
    	
    	System.out.println("***************************");
    	//Reorder message from format in chronological order
    	List<String> logs=Arrays.asList(
    			"14:30:3:Server Started",
    			"14:30:1:User logged in",
    			"14:29:2:Database Connected",
    			"18:32:4:User Logged out"
    			);
    	
    	List<String> collect3 = logs.stream().sorted((log1,log2)->{
    		String[] part1=log1.split(":");
    		String[] part2=log2.split(":");
    		int hour1=Integer.parseInt(part1[0]);//HH
    		int min1=Integer.parseInt(part1[1]);//MM
    		int id1=Integer.parseInt(part1[2]);//id
    		
    		int hour2=Integer.parseInt(part2[0]);//HH
    		int min2=Integer.parseInt(part2[1]);//MM
    		int id2=Integer.parseInt(part2[2]);//id
    		
    		if(hour1!=hour2) {
    			return Integer.compare(hour1,hour2);
    		}
    		
    		if(min1!=min2) {
    			return Integer.compare(min1,min2);
    		}
    		return Integer.compare(id1,id2);
    	}).map(log->log.split(":",4)[3]).collect(Collectors.toList());
    	System.out.println(collect3);
    	
    	System.out.println("***************************");
    	//Return character with the maximum frequency
    	String str3="abracadabra";
    	Map<Character, Long> collect4 = str3.chars().mapToObj(x->(char)x).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    	Character c = collect4.entrySet().stream().max(Map.Entry.comparingByValue())
    	.map(Map.Entry::getKey)
    	.orElse(null);
    	System.out.println(c);
    	
    	System.out.println("***************************");
    	//Convert list of string into map of String and its equivalent length
    	//Collectors.toMap(keyMapper,valueMapper,mergeFunction)
    	List<String> fruits = Arrays.asList("orange","banana","kiwi");
    	Map<String, Integer> collect5 = fruits.stream()
    			.collect(Collectors.toMap(Function.identity(),String::length,(existing,duplicate)->existing));
    	System.out.println(collect5);
    	
    	System.out.println("***************************");
    	//Transform one object into another . Transform Employee to EmployeeDTO
    	
	}
}

class EmpDept{
	private String name;
	private String dept;
	private double salary;
	public EmpDept(String name, String dept, double salary) {
		super();
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EmpDept [name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}

class Person2{
	private String firstName;
	private String lastName;
	@Override
	public String toString() {
		return "Person2 [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Person2(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
}