package ItemLista;


public class Item<T> {
	
	private T valor;
	private Item<T> enderecoProximo;
	
	public Item() {};
	
	public Item(T valor) {
		this.enderecoProximo = null;
		this.valor = valor;
	}
	
	public Item(T valor, Item<T> enderecoProximo) {
		this.enderecoProximo = enderecoProximo;
		this.valor = valor;
	}
	
	public T getValor() {
		return this.valor;
	}
	public void setValor(T valor) {
		this.valor = valor;
	}
	public Item<T> getEnderecoProximo() {
		return enderecoProximo;
	}
	public void setEnderecoProximo(Item<T> enderecoProximo) {
		this.enderecoProximo = enderecoProximo;
	}
}
