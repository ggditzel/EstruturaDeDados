package itemLista;

public class Testes {
	
	/*
	 * Apenas para testar a geracao do codigo automatico para cada item; este codigo pode ser usado numa lista ordenada
	 */

	public static void main(String[] args) {
		
		ItemID<Double> item1 = null;
		ItemID<Double> item2 = null;
		ItemID<Double> item3 = null;
		ItemID<Double> item4 = null;
		
		try {
			item1 = new ItemID<Double>(13.2);
			item2 = new ItemID<Double>(1.3);
			item3 = new ItemID<Double>(5.4);
			item4 = new ItemID<Double>(9.7);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.printf("codigo: %d; valor: %.2f\n", item1.getCodigo(), item1.getValor());
		System.out.printf("codigo: %d; valor: %.2f\n", item2.getCodigo(), item2.getValor());
		System.out.printf("codigo: %d; valor: %.2f\n", item3.getCodigo(), item3.getValor());
		System.out.printf("codigo: %d; valor: %.2f\n", item4.getCodigo(), item4.getValor());
		System.out.println("\n(Codigo do item1 é menor que o codigo do item2)");
		System.out.println("Comparacao de item1 e item2: " + item1.compareTo(item2));
		System.out.println("Comparacao de item2 e item1: " + item2.compareTo(item1));
		System.out.println("Comparacao de item1 e item1: " + item1.compareTo(item1));
		
	}

}
