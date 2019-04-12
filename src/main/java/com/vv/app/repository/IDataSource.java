package com.vv.app.repository;

import java.util.ArrayList;

import com.vv.app.model.Pedido;

public interface IDataSource {
	
	/**
	 * Retorna uma lista de pedidos no formato texto. Utiliza o toString() da classe
	 * Pedido.
	 */
	ArrayList<Pedido> getPedidoList();

	/**
	 * Adiciona o pedido na lista de pedidos em memoria.
	 * 
	 * @param pedido
	 *            - Pedido a ser adicionado
	 */
	void addPedido(Pedido pedido);

	/**
	 * Obtem um pedido a partir da lista de pedidos em memoria.
	 * 
	 * @param pedido
	 *             pedido a ser consultado
	 * @return um objeto Pedido
	 */
	Pedido consultaPedido(Pedido p);

	/**
	 * Exclui um pedido da lista de pedidos em memoria.
	 * 
	 * @param p Pedido a ser excluido
	 *            
	 * @return retorna se a exclusao foi bem sucedida em String (boolean)
	 */
	boolean excluiPedido(Pedido p);
	
	/**
	 * Edita um pedido da lista de pedidos em memoria.
	 * 
	 * @param p Pedido a ser editado
	 * 
	 */
	void editaPedido(Pedido p);

}
