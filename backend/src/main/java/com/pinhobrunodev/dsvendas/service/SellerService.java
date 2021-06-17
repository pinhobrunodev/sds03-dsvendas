package com.pinhobrunodev.dsvendas.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pinhobrunodev.dsvendas.dto.SellerDTO;
import com.pinhobrunodev.dsvendas.repositories.SellerRepository;

@Service
public class SellerService {

	
	
	@Autowired
	private SellerRepository repository;
	
	@Transactional(readOnly = true)
	public List<SellerDTO> findAll(){
		return repository.findAll().stream().map(x->new SellerDTO(x)).collect(Collectors.toList());
	}
	
}
