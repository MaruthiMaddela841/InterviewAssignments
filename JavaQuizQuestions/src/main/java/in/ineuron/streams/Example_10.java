package in.ineuron.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example_10 {

	public static void main(String[] args) {
				
    	System.out.println("***************************");
    	//Transform one object into another . Transform Employee to EmployeeDTO
    	Employee4 e1=new Employee4(1,"Maru");
    	Employee4 e2=new Employee4(2,"Shishira");
    	Employee4 e3=new Employee4(3,"Mike");
    	
    	List<Employee4> employees = Arrays.asList(e1,e2,e3);
    	List<EmployeeDTO> collect = employees.stream().map(e->new EmployeeDTO(e.getId(),e.getName())).collect(Collectors.toList());
    	System.out.println(collect);
	}
}

class Employee4{
	private int id;
	private String name;
	public Employee4(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee4 [id=" + id + ", name=" + name + "]";
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
}

class EmployeeDTO{
	private int id;
	private String name;
	public EmployeeDTO(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee4 [id=" + id + ", name=" + name + "]";
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
}