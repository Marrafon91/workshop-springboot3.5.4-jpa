package com.educandoweb.SpringBoot_354.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.SpringBoot_354.entities.OrderItem;
import com.educandoweb.SpringBoot_354.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
