package com.vv.app.repository;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.vv.app.model.Pedido;

@Service
public class MemoryRepository implements IDataSource {

	private ArrayList<Pedido> pedidoList = new ArrayList<>();

	@Override
	public void addPedido(Pedido pedido) {
		pedidoList.add(pedido);
	}

	@Override
	public Pedido consultaPedido(Pedido p) {
		int i = pedidoList.indexOf(p);
		return pedidoList.get(i);
	}

	@Override
	public boolean excluiPedido(Pedido p) {
		return pedidoList.remove(p);
	}
	
	@Override
	public void editaPedido(Pedido p) {
		
		int i = pedidoList.indexOf(p);
		
		Pedido o = pedidoList.get(i);
		
		o = p;	
	}

	@Override
	public ArrayList<Pedido> getPedidoList() {
		return pedidoList;
	}

}
