package com.pawan.etruckapi.services;

import java.util.List;
import java.util.Optional;

import com.pawan.etruckapi.models.LoadOrders;
import com.pawan.etruckapi.repository.LoadOrdersRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoadOrdersService {

    @Autowired
    LoadOrdersRepo loadOrdersRepo;
    
    public void saveLoadOrders(LoadOrders load) {
        loadOrdersRepo.save(load);
    }

    public List<LoadOrders> findAllLoads() {
        List<LoadOrders> list = loadOrdersRepo.findAll();
        return list;
    }

    public Optional<LoadOrders> findLoadsById(int id) {
        return loadOrdersRepo.findById(id);
    }

    public void deleteLoadsById(int id) {
        loadOrdersRepo.deleteById(id);
    }

    public void updateLoadById(int id, LoadOrders load) {
        load.setId(id);
        load.setShipperId(findLoadsById(id).get().getShipperId());
        loadOrdersRepo.save(load);
    }

    public List<LoadOrders> findLoadsByShipperId(String shipperId) {
        return loadOrdersRepo.findAllByShipperId(shipperId);
    }
}
