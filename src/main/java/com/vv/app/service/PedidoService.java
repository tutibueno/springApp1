package com.vv.app.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vv.app.model.Pedido;
import com.vv.app.repository.FileRepository;
import com.vv.app.repository.MemoryRepository;

@Service
public class PedidoService{

	@Autowired
	FileRepository fileRepository;
	
	@Autowired
	MemoryRepository memoryRepository;
	
	public String criarPedido(Pedido pedido)
	{
		//verifica se o pedido ja existe com o mesmo codigo
		Pedido p = fileRepository.consultaPedido(pedido);
		if(p != null)
			return "pedido ja cadastrado";
		fileRepository.addPedido(pedido);
		return pedido.toString();
	}
	
	public ArrayList<Pedido> listarPedidos()
	{
		return fileRepository.getPedidoList();
	}
	
	public Pedido alterarPedido(Pedido p)
	{
		//encontra o pedido
		Pedido _p = fileRepository.consultaPedido(p);
		if(_p != null) {
			fileRepository.editaPedido(_p);
			return _p;
		}
		return null;
	}
	
	public boolean excluirPedido(Pedido p)
	{
		return fileRepository.excluiPedido(p);
	}
	
}
