package itemLista;


public class ItemID<T> {
	
	private static int codigoGerado;
	private int codigo;
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
	
	private int geraCodigo() throws Exception {
		if (codigoGerado == Integer.MAX_VALUE) {
			throw new Exception("Limite de identificador atingigo, impossível cria novo item.");
		}
		return ++codigoGerado;
	}
}
