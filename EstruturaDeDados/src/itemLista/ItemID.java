package itemLista;


public class ItemID<T extends Comparable<T>> {
	
	/*
	 * Classe de um item que possui um codigo unico, para poder ser inserido numa lista encadeada ordenada
	 */
	
	private static int codigoGerado;
	private Integer codigo; // para poder usar o metodo "compareTo" da classe Integer (e nao precisar fazer um especifico)
	private T valor;
	private ItemID<T> enderecoProximo;
	
	public ItemID() throws Exception {
		this.codigo = geraCodigo();
	};
	
	public ItemID(T valor) throws Exception  {
		this.codigo = geraCodigo();
		this.enderecoProximo = null;
		this.valor = valor;
	}
	
	public ItemID(T valor, ItemID<T> enderecoProximo) throws Exception {
		this.codigo = geraCodigo();
		this.enderecoProximo = enderecoProximo;
		this.valor = valor;
	}
	
	public T getValor() {
		return this.valor;
	}
	
	public int getCodigo() {
		return this.codigo;
	}
	
	public void setValor(T valor) {
		this.valor = valor;
	}
	
	public ItemID<T> getEnderecoProximo() {
		return enderecoProximo;
	}
	
	public void setEnderecoProximo(ItemID<T> enderecoProximo) {
		this.enderecoProximo = enderecoProximo;
	}
	
	public int compareTo(ItemID<T> i) {
		return this.codigo.compareTo(i.codigo); // se for necessario outro tipo de comparacao, deve ser implementado codigo especifico
	}
	
	private int geraCodigo() throws Exception {
		if (codigoGerado == Integer.MAX_VALUE) {
			throw new Exception("Limite de identificador atingido, impossível cria novo item.");
		}
		return ++codigoGerado;
	}
}
