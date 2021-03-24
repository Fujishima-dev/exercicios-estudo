package entitiesE118;

import java.util.Date;

public class HourContract {
       
	 private Date contractDate;
	 private double valuePerHour;
	 private Integer hours;
	 
	 public HourContract() {
		 
	 }
	 
	 public HourContract(Date contractDate, double valuePerHour, Integer hours) {
		    this.contractDate = contractDate;
		    this.valuePerHour = valuePerHour;
		    this.hours = hours;
	 }

	public Date getContractDate() {
		return contractDate;
	}

	public void setContractDate(Date contractDate) {
		this.contractDate = contractDate;
	}

	public double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}
	 
	public double totalValue() {
		   return valuePerHour * hours;
	}
	 
}
