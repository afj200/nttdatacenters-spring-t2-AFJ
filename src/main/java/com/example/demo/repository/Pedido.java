package com.example.demo.repository;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


public class Pedido {

	private int idPedido;
	private String destinatario;
	private String direccion;
	private boolean fuerPeninsula;
	private Producto[] productos;
	
	
	public int getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}
	public String getDestinatario() {
		return destinatario;
	}
	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public boolean isFuerPeninsula() {
		return fuerPeninsula;
	}
	public void setFuerPeninsula(boolean fuerPeninsula) {
		this.fuerPeninsula = fuerPeninsula;
	}
	public Producto[] getProductos() {
		return productos;
	}
	public void setProductos(Producto[] productos) {
		this.productos = productos;
	}
	public Pedido(int idPedido, String destinatario, String direccion, boolean fuerPeninsula, Producto[] productos) {
		super();
		this.idPedido = idPedido;
		this.destinatario = destinatario;
		this.direccion = direccion;
		this.fuerPeninsula = fuerPeninsula;
		this.productos = productos;
	}
	
	
}
