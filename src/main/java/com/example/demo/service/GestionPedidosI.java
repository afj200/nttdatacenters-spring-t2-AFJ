package com.example.demo.service;

import com.example.demo.repository.Pedido;

public interface GestionPedidosI {

	public double calcularPVP(double precioSinImp);
	public String calcularPrecioPedido(Pedido pedido);
}
