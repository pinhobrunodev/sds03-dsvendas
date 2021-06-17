package com.pinhobrunodev.dsvendas.mapper;

import org.springframework.stereotype.Component;

import com.pinhobrunodev.dsvendas.dto.SellerDTO;
import com.pinhobrunodev.dsvendas.entities.Seller;

@Component
public class SellerMapper {

	public Seller toEntity(SellerDTO dto) {
		Seller entity = new Seller();
		entity.setId(dto.getId());
		entity.setName(dto.getName());
		return entity;
	}

	public SellerDTO toSellerDTO(Seller entity) {
		SellerDTO dto = new SellerDTO();
		dto.setId(entity.getId());
		dto.setName(entity.getName());
		return dto;
	}

}
