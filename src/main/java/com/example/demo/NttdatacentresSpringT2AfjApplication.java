package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.Pedido;
import com.example.demo.repository.Producto;
import com.example.demo.service.GestionPedidosI;

@SpringBootApplication
public class NttdatacentresSpringT2AfjApplication implements CommandLineRunner{

	@Autowired
	@Qualifier("fueraPeninsula")
	GestionPedidosI pedidosFueraService;
	
	@Autowired
	GestionPedidosI pedidosService;
	
	public static void main(String[] args) {
		SpringApplication.run(NttdatacentresSpringT2AfjApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Producto[] listaProducto = new Producto[3];
		
		listaProducto[0] = new Producto(1, "Piano", 500.00);
		listaProducto[1] = new Producto(1, "Guitarra", 150.00);
		listaProducto[2] = new Producto(1, "Violin", 100.00);
		
		Pedido pedidoPeninsula = new Pedido(1, "Angel", "Calle flor de retama", false, listaProducto);
		
		Pedido pedidoFueraPeninsula = new Pedido(2, "Manuel", "Calle Isla de Lanzarote", true, listaProducto);
		
		
		System.out.println("El piano tiene un precio con IVA de " + pedidosService.calcularPVP(listaProducto[0].getPrecioSinImp()));
		
		System.out.println(pedidosService.calcularPrecioPedido(pedidoPeninsula));
		System.out.println(pedidosFueraService.calcularPrecioPedido(pedidoFueraPeninsula));
		
	}

}
