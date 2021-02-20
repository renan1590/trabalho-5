package trabalho3;

public class main {

	public static void main(String[] args) {
		
		Conta c = new Conta("cresol", 7, 367, 350.20);
		System.out.println(c);
		System.out.println("\n");

		
		ContaSimples cs = new ContaSimples("bradesco", 6, 234, 456, 12);
		System.out.println(cs);
		System.out.println("\n");
		
		
		ContaEspecial ce = new ContaEspecial("itau", 5, 123, 78.990, 30, 5000);
		System.out.println(ce);
		
	}

}
