package com.wampublicidad.model;

import java.util.Date;

public class Orden {
	
	private Integer id;
	private String numero;
	private Date fechaCreacion;
	private Date fechaRecivida;
	private double total;
	
	public Orden() {
		
	}

	public Orden(Integer id, String numero, Date fechaCreacion, Date fechaRecivida, double total) {
		super();
		this.id = id;
		this.numero = numero;
		this.fechaCreacion = fechaCreacion;
		this.fechaRecivida = fechaRecivida;
		this.total = total;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Date getFechaRecivida() {
		return fechaRecivida;
	}

	public void setFechaRecivida(Date fechaRecivida) {
		this.fechaRecivida = fechaRecivida;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Orden [id=" + id + ", numero=" + numero + ", fechaCreacion=" + fechaCreacion + ", fechaRecivida="
				+ fechaRecivida + ", total=" + total + "]";
	}

	
}
