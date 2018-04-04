package listas;

import itemLista.Item;

public interface IListaEncadeada<T> {
	   
    public void inserirFinal(T valor);

    public void inserirInicio(T valor);
    
    public void inserirApos(Item<T> item, T valor);
    
    public void inserirAntes(Item<T> item, T valor);
    
    public void excluirItem(Item<T> item);
    
    public T excluirInicio();
    
    /**
     * Busca e retorna o item selecionado
     * @param item - a ser buscado
     * @return o proprio item, ou null (se item nao esta na lista)
     */
    public Item<T> buscarItem(Item<T> item);
}