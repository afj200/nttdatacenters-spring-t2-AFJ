package com.example.demo.repository;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


public class Producto {

	
	private int idProducto;
	private String nombre;
	//private double pvp;
	private double precioSinImp;
	
	
	public int getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecioSinImp() {
		return precioSinImp;
	}
	public void setPrecioSinImp(double precioSinImp) {
		this.precioSinImp = precioSinImp;
	}
	public Producto(int idProducto, String nombre, double precioSinImp) {
		super();
		this.idProducto = idProducto;
		this.nombre = nombre;
		this.precioSinImp = precioSinImp;
	}
	
	
	
	
}
