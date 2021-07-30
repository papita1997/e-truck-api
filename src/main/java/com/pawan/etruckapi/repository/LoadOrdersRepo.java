package com.pawan.etruckapi.repository;

import java.util.List;

import com.pawan.etruckapi.models.LoadOrders;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LoadOrdersRepo extends JpaRepository<LoadOrders,Integer>{
    List<LoadOrders> findAllByShipperId(String shipperId);
}
