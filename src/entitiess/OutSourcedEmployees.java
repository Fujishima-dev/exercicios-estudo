package entitiess;

public class OutSourcedEmployees extends Employees {

	private double despesaAdd;

	public OutSourcedEmployees() {
		super();
		
	}

	public OutSourcedEmployees(String name, double valorHora, double HorasTrabalhadas, double despesaAdd) {
		super(name, valorHora, HorasTrabalhadas);
		this.despesaAdd = despesaAdd;
	}

	public double getDespesaAdd() {
		return despesaAdd;
	}

	public void setDespesaAdd(double despesaAdd) {
		this.despesaAdd = despesaAdd;
	}
	
	@Override
	public double pagamento(){
		return super.pagamento() + despesaAdd * 1.1;
	}
	
	
	
	
	
	
	
	
	
	
	
}
