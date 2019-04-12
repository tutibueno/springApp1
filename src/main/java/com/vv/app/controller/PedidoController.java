package com.vv.app.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.vv.app.model.Pedido;
import com.vv.app.service.PedidoService;

@RestController("pedido")
public class PedidoController {
	
	@Autowired
	PedidoService pedidoService;
	
	@RequestMapping(value="/addPedido")
	@ResponseBody
	public String addPedido(Pedido pedido)
	{
		//System.out.println(pedido.toString());
		return pedidoService.criarPedido(pedido);
	}
	
	@RequestMapping("/alterarPedido")
	public String alterarPedido(Pedido p)
	{
		return pedidoService.alterarPedido(p) != null ? p.toString() : "Pedido não encontrado";
	}
	
	@RequestMapping("/listarPedidos")
	public ArrayList<Pedido> listaPedidos()
	{
		return pedidoService.listarPedidos();
	}
	
	@RequestMapping("/deletaPedido")
	public String deletaPedido(Pedido p)
	{
		return pedidoService.excluirPedido(p) ? "OK" : "Pedido nao encontrado";
	}
	
}
