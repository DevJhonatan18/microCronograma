package com.example.micro_cronograma.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.micro_cronograma.entity.TablaCronogramaPrestamos;
import com.example.micro_cronograma.service.ICronogramaService;



@RestController
public class AccountController {
	
	@Autowired
	private ICronogramaService service;
	
	
	@GetMapping("listar")
	public List<TablaCronogramaPrestamos> listar() {
		return (List<TablaCronogramaPrestamos>) service.findAll();
	}  
	
	@GetMapping("/ver/{id}")
	public TablaCronogramaPrestamos detalle( @PathVariable Integer id) {
		TablaCronogramaPrestamos account =  service.findById(id);
		return account ;
	}
	
	@GetMapping("/ver/{id}/{id2}")
	public TablaCronogramaPrestamos detalle2( @PathVariable int id , @PathVariable int id2 ) {
		TablaCronogramaPrestamos account =  service.findByNroprestamoAndCuota(id, id2);
		//System.out.print(account);
		return account ;
	}
	
}
