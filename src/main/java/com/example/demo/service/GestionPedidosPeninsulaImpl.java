package com.example.demo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.demo.repository.Pedido;
import com.example.demo.repository.Producto;

@Service
@Primary
public class GestionPedidosPeninsulaImpl implements GestionPedidosI{

	@Override
	public double calcularPVP(double precioSinImp) {
		double iva = precioSinImp * 0.21;
		
		return precioSinImp + iva;
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
