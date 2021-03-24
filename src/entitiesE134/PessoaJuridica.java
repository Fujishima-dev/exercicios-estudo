package entitiesE134;

public class PessoaJuridica extends Pessoa {

	private int nFuncionarios;
	
	
	public PessoaJuridica() {
		super();
	}
    	
	
	public PessoaJuridica(String nome, double rendaAnual, int nFuncionarios) {
		super(nome, rendaAnual);
		this.nFuncionarios = nFuncionarios;
	}

	public int getnFuncionarios() {
		return nFuncionarios;
	}

	public void setnFuncionarios(int nFuncionarios) {
		this.nFuncionarios = nFuncionarios;
	}

	@Override
	public double pagImposto() {
		   if(nFuncionarios > 10) {
			     return total = rendaAnual * 0.14;
		   }
		   else {
			   return total = rendaAnual * 0.16;
		   }
	     
	}
	
	@Override
	public String results() {
		return getNome() + ": $ " + String.format("%.2f", pagImposto());
	}
    
	
}
