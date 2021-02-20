package trabalho;

public class main {

	public static void main(String[] args) {
		pessoa p = new pessoa("Carlos","Rancho Queimado");
		System.out.println(p);
		System.out.println("\n");
		
		pessoaFisica pf = new pessoaFisica("Vitor", "Timbo", "123.456.789.12", "soltero");
		 //pf.setNome("Vitor");
		 //pf.setEndereco("Timbo");
		 //pf.setCpf("123.456.789.12");
		 //pf.setEstadoCivil("soltero");
		System.out.println(pf);
		System.out.println("\n");
		
		pessoaJuridica pj = new pessoaJuridica("carlos","Rancho Queimado","44.234.456/0001-22","juridica");
		//pj.setNome("Carlos");
		//pj.setEndereco("Rancho queimado");
		//pj.setCnpj("44.234.456/0001-22");
		//pj.setTipoEmpresa("juridica");
		System.out.println(pj);
		
		

	}

}
