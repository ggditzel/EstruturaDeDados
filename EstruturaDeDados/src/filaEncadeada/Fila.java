

package filaEncadeada;

import itemLista.*;

public class Fila<T> implements IFilaEncadeada<T> {
	private Item<T> novo;
	private Item<T> primeiro;
	private Item<T> ultimo;
	
	public Fila(){
		novo = null;
		primeiro = null;
		ultimo = null;
	}
	
	public void inserir(T valor) {
		if (primeiro == null) {
			novo = new Item<T>(valor);
			primeiro = novo;
			ultimo = novo;
		} else {
			novo = new Item<T>(valor);
			ultimo.setEnderecoProximo(novo);
			ultimo = novo;
		}
	}
	
	public T retirar() throws Exception {
		if (primeiro != null) {
			T elemento = primeiro.getValor();
			primeiro = primeiro.getEnderecoProximo();
			return elemento;
		} else throw new Exception("Fila Vazia");
	}

}
