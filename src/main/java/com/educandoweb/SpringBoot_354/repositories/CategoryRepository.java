package com.educandoweb.SpringBoot_354.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.SpringBoot_354.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
