package entitiess;

public class Employees {

	   private String name;
	   private double valorHora;
	   private double horasTrabalhadas;
	   
	   public Employees() {
		   
	   }
	   
	   public Employees(String name, double valorHora, double horasTrabalhadas) {
		      this.name = name;
		      this.valorHora = valorHora;
		      this.horasTrabalhadas = horasTrabalhadas;
	   }
	   
	   public String getName() {
		return name;
	}
	
	   public void setName(String name) {
		this.name = name;
	}
	
	   public double getValorHora() {	
		return valorHora;
	}

	   public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
	   public double getHoraTrabalhada() {
		return horasTrabalhadas;
	}
	
	   public void setHoraTrabalhada(double horaTrabalhada) {
		horasTrabalhadas = horaTrabalhada;
	}
	
	   public double pagamento() {
		   return valorHora * horasTrabalhadas;
	   }
	
	
	
	
	
	
	
	
	
	
	
}
