package com.vv.app.model;

import java.io.Serializable;

public class ItemPedido extends PedidoBase implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6767788101539782799L;
	private double valor;
	private int quantidade;
	private String nome;
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * Calcula automaticamente o valor total de um pedido (quantidade * valor unitario) retornando o valor total.
	 */
	public double getValorTotal()
	{
		return valor * quantidade;
	}
	
	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		
		sb.append("\tCodigo: ").append(codigo).append(" Produto: ").append(nome).
			append(" Quantidade: ").append(quantidade).append(" Valor Unitario: ").
			append(valor).append(" Valor Total: ").append(getValorTotal()).append("\n");
		
		return sb.toString();
	}
	
	
}
