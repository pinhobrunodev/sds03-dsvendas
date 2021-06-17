package com.pinhobrunodev.dsvendas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pinhobrunodev.dsvendas.dto.SaleDTO;
import com.pinhobrunodev.dsvendas.dto.SaleSucessDTO;
import com.pinhobrunodev.dsvendas.dto.SaleSumDTO;
import com.pinhobrunodev.dsvendas.service.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

	@Autowired
	private SaleService service;

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable) {
		return ResponseEntity.ok().body(service.findAll(pageable));
	}

	@GetMapping(value = "/amount-by-seller", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<SaleSumDTO>> amountGroupedBySeller() {
		return ResponseEntity.ok().body(service.amountGroupedBySeller());
	}

	@GetMapping(value = "/sucess-by-seller", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<SaleSucessDTO>> sucessGroupedBySeller() {
		return ResponseEntity.ok().body(service.sucessGroupedBySeller());
	}

}
