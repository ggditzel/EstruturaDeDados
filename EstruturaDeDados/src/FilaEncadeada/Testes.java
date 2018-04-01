package FilaEncadeada;


public class Testes {

	public static void main(String[] args) {
		Fila<Integer> fInt = new Fila<Integer>();
		Fila<Double> fDouble = new Fila<Double>();

		for (int i = 1; i <= 5; i++) {
			fInt.inserir(i);
			System.out.println("Item inserido Fila Inteiros: " + i);
		}

		System.out.println("===================");

		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Elemento retirado Fila Inteiros: " + fInt.retirar());
			}
		} catch(Exception e) {
			System.out.println(e);
		}
		
		for (int i = 1; i <= 5; i++) {
			double e = i * 3.14;
			fDouble.inserir(e);
			System.out.println("Item inserido Fila Doubles: " + e);
		}

		System.out.println("===================");

		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Elemento retirado Fila Doubles: " + fDouble.retirar());
			}
		} catch(Exception e) {
			System.out.println(e);
		}
		
		
		try {
			fInt.retirar();
			//fDouble.retirar();
		} catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
