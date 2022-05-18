package com.TFG.Bubble.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "oferta")
@Entity
public class Oferta {

	@Id
	@Column
	private int id_oferta;
	@Column
	private String tipo_oferta;
	@Column
	private String descripcion;
	@Column
	private double precio;
	@Column
	private int id_usuario;
	
	public Oferta(int id_oferta, String tipo_oferta, String descripcion, double precio, int id_usuario) {
		this.id_oferta = id_oferta;
		this.tipo_oferta = tipo_oferta;
		this.descripcion = descripcion;
		this.precio = precio;
		this.id_usuario = id_usuario;
	}

	public int getId_oferta() {
		return id_oferta;
	}

	public void setId_oferta(int id_oferta) {
		this.id_oferta = id_oferta;
	}

	public String getTipo_oferta() {
		return tipo_oferta;
	}

	public void setTipo_oferta(String tipo_oferta) {
		this.tipo_oferta = tipo_oferta;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}
	
	
	
	
	
}
