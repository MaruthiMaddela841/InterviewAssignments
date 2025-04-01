package in.ineuron.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Example_6 {

	public static void main(String[] args) {

		// Convert a list of String to Uppercase and then concatenate
		List<String> names = Arrays.asList("Maru", "Mike", "Bobbiti");
		String n = names.stream().map(String::toUpperCase).reduce((s1, s2) -> s1 + " " + s2).orElse("");
		System.out.println(n);

		System.out.println("************************");
		// Map vs Falt Map
		List<PersonExample> persons = Arrays.asList(new PersonExample("Alice", Arrays.asList("red", "blue")),
				new PersonExample("Bob", Arrays.asList("yellow", "blue")),
				new PersonExample("Jon", Arrays.asList("red", "green")),
				new PersonExample("Baby", Arrays.asList("violet", "pink")));

		List<List<String>> colorList = persons.stream().map(PersonExample::getColor).collect(Collectors.toList());
		System.out.println(colorList);
		List<String> collect = persons.stream().flatMap(x -> x.getColor().stream()).collect(Collectors.toList());
		System.out.println(collect);

		System.out.println("************************");
		// Concatenate two streams
		Stream<String> s1 = Stream.of("Java", "Python");
		Stream<String> s2 = Stream.of("C++", "Ruby");
		List<String> collect2 = Stream.concat(s1, s2).collect(Collectors.toList());
		System.out.println(collect2);

		System.out.println("************************");
		// Avoid complex Transformations
		// Bad Practise
		List<Person1> personList = Arrays.asList(new Person1("raj", 35), new Person1("bob", 23),
				new Person1("alan", 39), new Person1("chakry", 36), new Person1("harry", 32));
		List<String> collect3 = personList.stream().filter(p -> p.getAge() > 35).map(Person1::getName).distinct()
				.sorted().collect(Collectors.toList());
		System.out.println(collect3);

		System.out.println("************************");
		// good practise
		List<String> collect4 = personList.stream().filter(p -> p.getAge() > 35).map(Person1::getName)
				.collect(Collectors.toList());
		List<String> collect5 = collect4.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(collect5);

		System.out.println("************************");
		// Perform series of operations
		// Product class operations
		Product p1 = new Product(1, "Lifeboy", 20, "Soap");
		Product p2 = new Product(2, "portronics", 200, "Adapter");
		Product p3 = new Product(3, "SurfExcel", 90, "Washing Powder");
		Product p4 = new Product(4, "Yamaha", 8000, "Guitar");
		Product p5 = new Product(5, "Ikigai", 500, "Book");
		List<Product> productList = Arrays.asList(p1, p2, p3, p4, p5);

		System.out.println("1. names of products whose price is below a certain threshold 500");
		productList.stream().filter(p -> p.getPrice() < 500).collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("2. Create new list containing products with a price reduction of 20%");
		List<Product> collect6 = productList.stream().map(x->{
			double dprice=x.getPrice()*0.8;
			x.setPrice(dprice);
			return x;
		}).collect(Collectors.toList());
		System.out.println(collect6);
		System.out.println("3. Calculate the average price of all products");
		OptionalDouble average = productList.stream().mapToDouble(Product::getPrice).average();
		System.out.println(average);
		System.out.println("4. Find the product with lowest price");
		Optional<Product> min = productList.stream().min((x1,x2)->Double.compare(x1.getPrice(),x2.getPrice()));
		if(min.isPresent()) {
			System.out.println(min.get());
		}
		
		//Print 1 to 10
		Stream.iterate(1, x->x+1).limit(10).forEach(System.out::println);
		System.out.println("************************");
		//Print random
		Stream.iterate((Math.random()*100)+1,x->(Math.random()*100)+1).limit(10).forEach(System.out::println);
		System.out.println("************************");
		IntStream.generate(() -> (int)(Math.random() * 100) + 1)
        .limit(10)
        .forEach(System.out::println);
	}

}

class Product {
	private int id;
	private String name;
	private double price;
	private String category;

	public Product() {
		super();
	}

	public Product(int id, String name, double price, String category) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", category=" + category + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

}

class Person1 {
	private String name;
	private int age;

	public Person1() {
		super();
	}

	public Person1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

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
	public String toString() {
		return "Person1 [name=" + name + ", age=" + age + "]";
	}

}

class PersonExample {
	private String name;
	private List<String> color;

	public PersonExample() {
		super();
	}

	public PersonExample(String name, List<String> color) {
		super();
		this.name = name;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getColor() {
		return color;
	}

	public void setColor(List<String> color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "PersonExample [name=" + name + ", color=" + color + "]";
	}

}