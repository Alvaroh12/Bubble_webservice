package com.TFG.Bubble.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "usuario")
@Entity
public class Usuario {
	
	@Id
	@Column
	private int id_usuario;
	@Column
	private String nombre;
	@Column
	private String correo;
	@Column
	private String password;
	
	public Usuario() {
		
	}

	
	public Usuario(int id_usuario, String nombre, String correo, String password) {
		this.id_usuario = id_usuario;
		this.nombre = nombre;
		this.correo = correo;
		this.password = password;
	}


	public int getId_usuario() {
		return id_usuario;
	}


	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}
