package entitiesE96;

public class Employees {
     
    private String name;
    private double salary;
	private int id;  
    
    public Employees() {
		   
	   }
	   
    public Employees(String name, double salary, int id) {
		      this.name = name;
		      this.salary = salary;
		      this.id = id;
	   }

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public double increaseSalary(double percentage) {
		   return salary += salary * percentage / 100;
	}
    
	public String toString() {
		   return getId() + ", " + getName() + ", " + String.format("%.2f", getSalary());
	}






}
