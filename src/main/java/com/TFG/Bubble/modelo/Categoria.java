package com.TFG.Bubble.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "categoria")
@Entity
public class Categoria {
	
	@Id
	@Column
	private int id_categoria;
	@Column
	private String categoria;
	
	
	public Categoria(int id_categoria, String categoria) {
		this.id_categoria = id_categoria;
		this.categoria = categoria;
	}

	public int getId_categoria() {
		return id_categoria;
	}

	public void setId_categoria(int id_categoria) {
		this.id_categoria = id_categoria;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
	

}
