package com.pinhobrunodev.dsvendas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pinhobrunodev.dsvendas.dto.SaleDTO;
import com.pinhobrunodev.dsvendas.entities.Sale;
import com.pinhobrunodev.dsvendas.repositories.SaleRepository;
import com.pinhobrunodev.dsvendas.repositories.SellerRepository;

@Service
public class SaleService {

	
	
	@Autowired
	private SaleRepository repository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable){
		sellerRepository.findAll(); // trazendo pra memoria , que sera armazenado em cache
		Page<Sale>result = repository.findAll(pageable);
		return result.map(x->new SaleDTO(x));
	}
	
}
