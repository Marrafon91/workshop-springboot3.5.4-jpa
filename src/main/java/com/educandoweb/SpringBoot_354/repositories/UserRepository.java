package com.educandoweb.SpringBoot_354.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.SpringBoot_354.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
