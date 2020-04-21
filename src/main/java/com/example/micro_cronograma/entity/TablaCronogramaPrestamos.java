package com.example.micro_cronograma.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "tb_cronograma_prestamos")
public class TablaCronogramaPrestamos implements Serializable {

	private static final long serialVersionUID = -7823734661943925569L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_Cronograma")
	private Integer idCronograma;
	
	
	@Column(name = "nroprestamo")
	private int nroprestamo;
	
	
	@Column(name = "cuota")
	private int cuota;
	
	@Column(name = "fecha_vencimiento")
	private String fechaVencimiento;
	
	@Column(name = "dias")
	private int dias;
	
	
	@Column(name = "capital")
	private double capital;
	
	@Column(name = "interes")
	private double interes;
	
	@Column(name = "seguro_desgravamen")
	private double seguroDesgravamen;
	
	@Column(name = "importe_cuota")
	private double importeCuota;
	
	@Column(name = "saldo_pendiente")
	private double saldoPendiente;
	
	
	@Column(name = "ispagado")
	private boolean isPagado;

	public Integer getIdCronograma() {
		return idCronograma;
	}

	public void setIdCronograma(Integer idCronograma) {
		this.idCronograma = idCronograma;
	}

	public int getNroprestamo() {
		return nroprestamo;
	}

	public void setNroprestamo(int nroprestamo) {
		this.nroprestamo = nroprestamo;
	}

	public int getCuota() {
		return cuota;
	}

	public void setCuota(int cuota) {
		this.cuota = cuota;
	}

	public String getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}

	public double getCapital() {
		return capital;
	}

	public void setCapital(double capital) {
		this.capital = capital;
	}

	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}

	public double getImporteCuota() {
		return importeCuota;
	}

	public void setImporteCuota(double importeCuota) {
		this.importeCuota = importeCuota;
	}

	public boolean isPagado() {
		return isPagado;
	}

	public void setPagado(boolean isPagado) {
		this.isPagado = isPagado;
	}

	public double getSeguroDesgravamen() {
		return seguroDesgravamen;
	}

	public void setSeguroDesgravamen(double seguroDesgravamen) {
		this.seguroDesgravamen = seguroDesgravamen;
	}

	public double getSaldoPendiente() {
		return saldoPendiente;
	}

	public void setSaldoPendiente(double saldoPendiente) {
		this.saldoPendiente = saldoPendiente;
	}
	
	
		

}

