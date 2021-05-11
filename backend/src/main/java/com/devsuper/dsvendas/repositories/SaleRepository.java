package com.devsuper.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuper.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

}
