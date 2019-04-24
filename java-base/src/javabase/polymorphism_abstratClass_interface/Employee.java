package javabase.polymorphism_abstratClass_interface;

public abstract class Employee {
	private String name;
	private String id;
	private double salary;
	
	public Employee() {}
	
	public Employee(String name,String id,double salary) {
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public abstract void work();
	
}

class Coder extends Employee {
	public Coder() {}
	
	public Coder(String name,String id,double salary) {
		super(name,id,salary);
	}
	
	public void work() {
		System.out.println("my name is:" + this.getName() 
		+ ",my id is:" + this.getId() + ",my salary is:"
		+ this.getSalary() + ".my job is coding");
	}
}

class Manager extends Employee {
	private int bonus;
	public Manager() {}
	
	public Manager(String name,String id,double salary,int bonus) {
		super(name,id,salary);
		this.bonus = bonus;
	}
	
	
	public void work() {
		System.out.println("my name is:" + this.getName() 
		+ ",my id is:" + this.getId() + ",my salary is:"
		+ this.getSalary() + ",my bonus is:" + this.getBonus() 
		+ ".my job is managing");
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
}