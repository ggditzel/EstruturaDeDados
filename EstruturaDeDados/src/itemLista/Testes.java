package itemLista;

public class Testes {

	public static void main(String[] args) {
		
		ItemID<Double> item1 = null;;
		ItemID<Double> item2 = null;
		ItemID<Double> item3 = null;
		ItemID<Double> item4 = null;;
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
	}

}
