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

public class Example_8 {

	public static void main(String[] args) {

		Employee2 e1= new Employee2("Anil","anil@gmail.com",24,"M");
		Employee2 e2= new Employee2("Bob","bob@yahoo.com",35,"M");
		Employee2 e3= new Employee2("Cindy","cindy@yahoo.com",33,"F");
		Employee2 e4= new Employee2("Diana","diana@gmail.com",45,"F");
		
		List<Employee2> list=Arrays.asList(e1,e2,e3,e4);
		//Calculate average of age of male and female
		Map<String, Double> collect = list.stream().collect(Collectors.groupingBy(Employee2::getGender,Collectors.averagingInt(Employee2::getAge)));
		System.out.println(collect);
		
		
	}

}

class Employee2{
	private String name;
	private String email;
	private int age;
	private String gender;
	public Employee2() {
		super();
	}
	public Employee2(String name, String email, int age, String gender) {
		super();
		this.name = name;
		this.email = email;
		this.age = age;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", email=" + email + ", age=" + age + ", gender=" + gender + "]";
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}