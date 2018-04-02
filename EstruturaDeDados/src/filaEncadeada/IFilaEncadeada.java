package filaEncadeada;

public interface IFilaEncadeada<T> {
	/**
	 * 
	 * insere um elemento na última posição da fila;
	 */
	public void inserir(T valor);
	
	/**
	 * 
	 * retira o primeiro elemento da fila; deve lancar uma excecao caso a fila esteja vazia;
	 */
	public T retirar() throws Exception;
}
