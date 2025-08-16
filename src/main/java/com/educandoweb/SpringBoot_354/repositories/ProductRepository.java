package com.educandoweb.SpringBoot_354.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.SpringBoot_354.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
