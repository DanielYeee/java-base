package javabase.construtor_and_static;

public class Employee {
	private String name;
	private String id;
	private double salary; 

	public Employee() {}
	
	public Employee(String name, String id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		
		return "my name is : " + name 
				+ "\rmy id is : " + id + "\rmy salary is : " + salary;
	}
	
	
	
}
