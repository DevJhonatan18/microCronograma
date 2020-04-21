package com.example.micro_cronograma.service;

import java.util.List;

import com.example.micro_cronograma.entity.TablaCronogramaPrestamos;



public interface ICronogramaService {

	public List<TablaCronogramaPrestamos> findAll();
	public TablaCronogramaPrestamos findById(Integer id);
	public TablaCronogramaPrestamos save(TablaCronogramaPrestamos save);
	//public TablaCronogramaPrestamos findAllByIdAndNroprestamo(Integer id , Integer nroprestamo);
	public TablaCronogramaPrestamos findByNroprestamoAndCuota(int nroprestamo, int cuota);
	
}
