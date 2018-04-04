package listas;

import itemLista.Item;

public class ListaEncadeada<T> {
	
	private Item<T> novo;
	private Item<T> primeiro;
	private Item<T> ultimo;
	
	public ListaEncadeada(){
		novo = null;
		primeiro = null;
		ultimo = null;
	}

	public void inserirFinal(T valor) {
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

    public void inserirInicio(T valor) {
		if (primeiro == null) {
			novo = new Item<T>(valor);
			primeiro = novo;
			ultimo = novo;
		} else {
			novo = new Item<T>(valor);
			novo.setEnderecoProximo(primeiro);
			primeiro = novo;
		}
    }
    
    public T retirar() throws Exception {
    	if (primeiro != null) {
    		T elemento = primeiro.getValor();
    		primeiro = primeiro.getEnderecoProximo();
    		return elemento;
    	} else throw new Exception("Fila Vazia");
    }
    
//    public void inserirApos(Item<T> item, T valor);
//    
//    public void inserirAntes(Item<T> item, T valor);
//    
//    public void excluirItem(Item<T> item);
//    
//    public T excluirInicio();
//    
//    public Item<T> buscarItem(Item<T> item);
	
}
