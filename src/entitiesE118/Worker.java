package entitiesE118;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enumsE118.WorkerLevel;

public class Worker {
   
	  private String name;
	  private WorkerLevel level;
	  private double baseSalary;

	  private Department department;
	  private List<HourContract> list = new ArrayList<>();
	  
	  public Worker() {
		  
	  }
	  
	  public Worker(Department department, String name, WorkerLevel level, double baseSalary) {
		     this.department = department;
		     this.name = name;
		     this.level = level;
		     this.baseSalary = baseSalary;
	  }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

    public void addContract(HourContract contract) {
    	   list.add(contract);
    }
 
    public void removeContract(HourContract contract) {
    	   list.add(contract);
    }
    
    public double income(int year, int month) {
    	   double sum = baseSalary;
    	   Calendar cal = Calendar.getInstance();
    	   for(HourContract c : list) {
    		   cal.setTime(c.getContractDate());
    	       int c_year = cal.get(Calendar.YEAR);
    	       int c_month = 1 + cal.get(Calendar.MONTH);
    	       if(year == c_year && month == c_month) {
    	    	       sum += c.totalValue();
    	       }
    	   }
           return sum;
    }
    
    
    
}
