package com.devsuper.dsvendas.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuper.dsvendas.dto.SellerDTO;
import com.devsuper.dsvendas.entities.Seller;
import com.devsuper.dsvendas.repositories.SellerRepository;

@Service
public class SellerService {

	@Autowired
	private SellerRepository repository;
	
	public List<SellerDTO> findAll(){
		List<Seller> result = repository.findAll();
	
		return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList()); 
	}
	
}
