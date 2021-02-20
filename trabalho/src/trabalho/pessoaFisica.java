package trabalho;

public class pessoaFisica extends pessoa {
      private String cpf;
      private String estadoCivil;
      
      public pessoaFisica() {
         super();
      }

      public pessoaFisica(String nome, String endereco) {
    	  super(nome,endereco);
      }

      public pessoaFisica(String nome, String endereco, String cpf, String estadoCivil) {
    	  super(nome,endereco);
    	  setCpf(cpf);
    	  setEstadoCivil(estadoCivil);
      }
      
      public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		if (cpf.length() > 0)
		  this.cpf = cpf;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		if (estadoCivil.length() > 0)
		  this.estadoCivil = estadoCivil;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("pessoaFisica [cpf=");
		builder.append(cpf);
		builder.append(", estadoCivil=");
		builder.append(estadoCivil);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
      
	
      
}
