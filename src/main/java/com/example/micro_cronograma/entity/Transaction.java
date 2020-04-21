package com.example.micro_cronograma.entity;

import java.io.Serializable;

public class Transaction implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -9092689662332964448L;
	
	
	private Integer id;
	private int nroprestamo ;
	private double importeCuota ;
	private int cuota ;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getNroprestamo() {
		return nroprestamo;
	}

	public void setNroprestamo(int nroprestamo) {
		this.nroprestamo = nroprestamo;
	}

	public double getImporteCuota() {
		return importeCuota;
	}

	public void setImporteCuota(double importeCuota) {
		this.importeCuota = importeCuota;
	}

	public int getCuota() {
		return cuota;
	}

	public void setCuota(int cuota) {
		this.cuota = cuota;
	}
	
	
	
}
