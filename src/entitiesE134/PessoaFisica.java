package entitiesE134;

public class PessoaFisica extends Pessoa{

	
	private double gastoSaude;
	
	
	public PessoaFisica() {
		super();
	}
	
	

	public PessoaFisica(String nome, double rendaAnual, double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}
	
	public double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}
	
	public double getTotal() {
		 return  total;
	}
	
	public void setTotal(double total) {
		   this.total = total;
	}
	
	@Override
	public double pagImposto() {
		if(rendaAnual < 20000.00) {
			  if( gastoSaude <= 0) {
				  return total = (rendaAnual * 0.15);
				          
			 }
              if(gastoSaude > 1) {
            	  return total = (rendaAnual * 0.15) - (gastoSaude * 0.50);
              }
		}
		
		else if(rendaAnual > 20000.00) {
			     if (gastoSaude <= 0) {
				 return total = (rendaAnual * 0.25);
			  }
			     
			    if(gastoSaude > 1) {
			    	return total = (rendaAnual * 0.25) - (gastoSaude * 0.50);
			    }
		}
		return total;
		
		   
	}
	
	@Override
	public String results() {
		return getNome() + ": $ " + String.format("%.2f", pagImposto());
	}
	
	
}
