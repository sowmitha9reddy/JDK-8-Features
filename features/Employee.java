package features;

public class Employee {
      private String name;
     
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(String name, String dept, int salary) {
		super();
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	private String dept;
      private int salary;
	public Employee() {
		super();
		
	}
	@Override
	public String toString() {
		
		return getName()+" "+getDept()+" "+getSalary();
	}
	
      
} 
