package com.example.micro_cronograma.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.example.micro_cronograma.entity.TablaCronogramaPrestamos;


@Repository
public interface CronogramaRepository extends CrudRepository<TablaCronogramaPrestamos, Integer> {
	
	// public TablaCronogramaPrestamos findAllByIdCronogramaAndNroprestamo(Integer id , Integer nroprestamo);
	
	public TablaCronogramaPrestamos findByNroprestamoAndCuota(int nroprestamo , int cuota);

}
