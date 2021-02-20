package trabalho;

public class pessoaJuridica extends pessoa {
	private String cnpj;
	private String tipoEmpresa;
	
public pessoaJuridica() {
	super();	
	}
	
	public pessoaJuridica(String nome, String endereco) {
		super(nome,endereco);
	}
	
	public pessoaJuridica(String nome, String endereco, String cnpj, String tipoEmpresa) {
		super(nome,endereco);
		setCnpj(cnpj);
		setTipoEmpresa(tipoEmpresa);
	}
	
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		if(cnpj.length() > 0 )
		 this.cnpj = cnpj;
	}
	public String getTipoEmpresa() {
		return tipoEmpresa;
	}
	public void setTipoEmpresa(String tipoEmpresa) {
		if(tipoEmpresa.length() > 0)
		 this.tipoEmpresa = tipoEmpresa;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("pessoaJuridica [cnpj=");
		builder.append(cnpj);
		builder.append(", tipoEmpresa=");
		builder.append(tipoEmpresa);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
