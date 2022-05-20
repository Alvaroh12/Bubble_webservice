package com.TFG.Bubble.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "empleo")
@Entity
public class Empleo {

	@Id
	@Column
	private int id_empleo;
	@Column
	private int isAceptado;
	@Column
	private int isCancelado;
	@Column
	private double id_oferta;
	@Column
	private int id_usuario_comprador;
	@Column
	private int id_usuario_oferente;
	
	public Empleo() {
	
	}
	
	public Empleo(int id_empleo, int isAceptado, int isCancelado, double id_oferta, int id_usuario_comprador,
			int id_usuario_oferente) {
		this.id_empleo = id_empleo;
		this.isAceptado = isAceptado;
		this.isCancelado = isCancelado;
		this.id_oferta = id_oferta;
		this.id_usuario_comprador = id_usuario_comprador;
		this.id_usuario_oferente = id_usuario_oferente;
	}

	public int getId_empleo() {
		return id_empleo;
	}
	public void setId_empleo(int id_empleo) {
		this.id_empleo = id_empleo;
	}
	public int getIsAceptado() {
		return isAceptado;
	}
	public void setIsAceptado(int isAceptado) {
		this.isAceptado = isAceptado;
	}
	public int getIsCancelado() {
		return isCancelado;
	}
	public void setIsCancelado(int isCancelado) {
		this.isCancelado = isCancelado;
	}
	public double getId_oferta() {
		return id_oferta;
	}
	public void setId_oferta(double id_oferta) {
		this.id_oferta = id_oferta;
	}
	public int getId_usuario_comprador() {
		return id_usuario_comprador;
	}
	public void setId_usuario_comprador(int id_usuario_comprador) {
		this.id_usuario_comprador = id_usuario_comprador;
	}
	public int getId_usuario_oferente() {
		return id_usuario_oferente;
	}
	public void setId_usuario_oferente(int id_usuario_oferente) {
		this.id_usuario_oferente = id_usuario_oferente;
	}
	
	
	
}
