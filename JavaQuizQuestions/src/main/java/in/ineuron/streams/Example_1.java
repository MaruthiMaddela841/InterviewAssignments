package in.ineuron.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Example_1 {

	public static void main(String[] args) {
		
		//Sum of All elements
		List<Integer> nums=Arrays.asList(1,2,3,4,5,5);
		int sum=nums.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
		
		System.out.println("*******************************");
		
		//Find max element
		int maxNum=nums.stream().max(Comparator.naturalOrder()).get();
		System.out.println(maxNum);
		
		System.out.println("*******************************");
		
		//Find no of Strings which starts with specific character
		List<String> fruits=Arrays.asList("Mango","Banana","Apple","Avacado");
		long count = fruits.stream().filter(s->s.startsWith("M")).count();
		System.out.println(count);
		
		System.out.println("*******************************");
		
		//Convert list of string to uppercase
		fruits.stream().map(String::toUpperCase).collect(Collectors.toList()).forEach(System.out::println);
		
		System.out.println("*******************************");
		
		//Find the average of a list of floating - point numbers using streams
		List<Double> floatNums=Arrays.asList(1.1,1.2,1.3,1.4,1.5);
		double floatAvg = floatNums.stream().mapToDouble(Double::doubleValue).average().getAsDouble();
		System.out.println(floatAvg);
		
		System.out.println("*******************************");
		
		//Concatenate all the strings
		String collectedFruits = fruits.stream().collect(Collectors.joining(","));
		System.out.println(collectedFruits);
		
		System.out.println("*******************************");
		
		//Remove duplicates from a list
		nums.stream().distinct().forEach(System.out::println);
		
		System.out.println("*******************************");
		
		//Sort the objects based on a specific attribute using streams
		List<Person> people=Arrays.asList(
				new Person("Mike",23),
				new Person("Maruthi",25),
				new Person("Shishira",24),
				new Person("Maddela",32)
				);
		Collections.sort(people);
		people.forEach(System.out::println);
		
		System.out.println("*******************************");
		
		Collections.sort(people,Comparator.comparing(Person::getAge));
		people.forEach(System.out::println);
		
		System.out.println("*******************************");
		people.stream().sorted(Comparator.comparing(Person::getName)).forEach(System.out::println);
	}

}

class Person implements Comparable<Person>{
	
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Person o) {
		return (this.name).compareTo(o.name);
	}
	
	
	
	
}