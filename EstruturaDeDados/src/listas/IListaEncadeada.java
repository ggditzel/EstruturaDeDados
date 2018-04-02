package listas;

import itemLista.Item;

public interface IListaEncadeada<T> {
	   
    public void inserirFinal(T valor);
    public void inserirInicio(T valor);
    public void inserirApos(Item<T> item, T valor);
    public void inserirAntes(Item<T> item, T valor);
    public void excluirItem(Item<T> item);
    public void excluirInicio();
    public Item<T> buscarItem(int Codigo);
}