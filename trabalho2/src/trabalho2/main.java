package trabalho2;

public class main {

	public static void main(String[] args) {
		Item i = new Item(1233, "cd bom" );
		System.out.println(i);
		System.out.println("\n");
		
		
		Livro l = new Livro(2345, "agradavel", "zeca pagodinho" );
		System.out.println(l);
		System.out.println("\n");

		Midia m = new Midia(5465, "muito bom", "dicmiusic", 20 );
		System.out.println(m);
		System.out.println("\n");
		
		CD c = new CD(5449, "agradavel", "somdig", 31, 12, "vitor do borogodo", "a vida boa");
		System.out.println(c);
		System.out.println("\n");
		
		VHS v = new VHS(1485, "encorajador", "discwqe", 23,  "cana");
		System.out.println(v);
	}
	

}
