package listas;

public class Testes {

	public static void main(String[] args) {
		
		ListaEncadeada<String> l1 = new ListaEncadeada<String>();
		
		for (int i = 1; i <= 5; i++) {
			String s = "* " + Integer.toString(i) + " *";
			l1.inserir(s);
			System.out.println("Item inserido na lista de String: " + s);
		}

		System.out.println("===================");

		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Elemento retirado da lista de String: " + l1.retirar());
			}
		} catch(Exception e) {
			System.out.println(e);
		}
	}

}
