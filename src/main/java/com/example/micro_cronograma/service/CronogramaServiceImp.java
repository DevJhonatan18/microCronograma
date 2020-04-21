package com.example.micro_cronograma.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.example.micro_cronograma.entity.TablaCronogramaPrestamos;
import com.example.micro_cronograma.repository.CronogramaRepository;



@Service
public class CronogramaServiceImp implements ICronogramaService{
	
	@Autowired
	private CronogramaRepository accountRepo;

	@Override
	public List<TablaCronogramaPrestamos> findAll() {
		// TODO Auto-generated method stub
		return (List<TablaCronogramaPrestamos>) accountRepo.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public TablaCronogramaPrestamos findById(Integer id) {
		// TODO Auto-generated method stub
		return accountRepo.findById(id).orElse(null);
	}

	@Override
	public TablaCronogramaPrestamos save(TablaCronogramaPrestamos save) {
		// TODO Auto-generated method stub
		return accountRepo.save(save);
		
	}

	@Override
	@Transactional(readOnly = true)
	public TablaCronogramaPrestamos findByNroprestamoAndCuota(int nroprestamo, int cuota) {
		// TODO Auto-generated method stub
		//return accountRepo.findAllByIdCronogramaAndNroprestamo(id, nroprestamo);
		System.out.println("-------------------------------");
		System.out.println("-------------------------------" + nroprestamo);
		System.out.println("-------------------------------" + cuota);
		System.out.println("-------------aaaa------------------" + (accountRepo.findByNroprestamoAndCuota(nroprestamo, cuota)).getSeguroDesgravamen() + "-------------aaaa------------------"   );
		return accountRepo.findByNroprestamoAndCuota(nroprestamo, cuota);
		
	}

	
		

}