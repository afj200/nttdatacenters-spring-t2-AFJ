package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.repository.Pedido;
import com.example.demo.repository.Producto;

@Service("fueraPeninsula")
public class GestionPedidosFueraPeninsulaImpl implements GestionPedidosI{

	@Override
	public double calcularPVP(double precioSinImp) {
		double ispi = precioSinImp * 0.04;
		return precioSinImp + ispi;
	}

	@Override
	public String calcularPrecioPedido(Pedido pedido) {
		double precioPedido = 0;
		for(Producto producto : pedido.getProductos()) {
			precioPedido = precioPedido + calcularPVP(producto.getPrecioSinImp());
		}
		return "El pedido tiene un valor total de " + precioPedido;
	}

	
}
