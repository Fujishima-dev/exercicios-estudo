package entitiesE134;

public abstract class  Pessoa {
      
	   private String nome;
	   protected double rendaAnual;
	   protected double total = 0;
	   
	   public Pessoa() {
		   
	   }
       
	   public Pessoa(String nome, double rendaAnual) {
		      this.nome = nome;
		      this.rendaAnual = rendaAnual;
	   }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getRendaAnual() {
		return rendaAnual;
	}
	
	public abstract String results();
	
	public abstract double pagImposto();
}
