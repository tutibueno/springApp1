package com.vv.app.model;

import java.io.Serializable;
import java.sql.Date;
import java.time.Instant;

public abstract class PedidoBase implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected int codigo;
	protected String dataHoraInclusao;
	
	protected String dataHoraEdicao;
	
	private static int codigoNextNumber; //geracao de codigo automatico
	
	public PedidoBase()
	{
		codigoNextNumber++;
		setDataHoraInclusao(Date.from(Instant.now()).toString());
		setCodigo(codigoNextNumber);
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDataHoraInclusao() {
		return dataHoraInclusao;
	}
	public void setDataHoraInclusao(String dataHoraInclusao) {
		this.dataHoraInclusao = dataHoraInclusao;
	}
	public String getDataHoraEdicao() {
		return dataHoraEdicao;
	}
	public void setDataHoraEdicao() {
		this.dataHoraEdicao = Date.from(Instant.now()).toString();
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PedidoBase other = (PedidoBase) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}
	
	

}
