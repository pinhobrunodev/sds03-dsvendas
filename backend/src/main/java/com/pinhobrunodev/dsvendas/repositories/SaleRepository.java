package com.pinhobrunodev.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pinhobrunodev.dsvendas.entities.Sale;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long>{

}
