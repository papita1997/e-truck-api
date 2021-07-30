package com.pawan.etruckapi.controller;
import java.util.List;
import java.util.UUID;

import com.pawan.etruckapi.models.LoadOrders;
import com.pawan.etruckapi.services.LoadOrdersService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LoadOrdersController {

    @Autowired
    LoadOrdersService lOrdersService;
    
    @PostMapping("/load")
    public String addLoadOrders(@RequestBody LoadOrders load) {
        load.setShipperId("shipper:"+UUID.randomUUID());
        lOrdersService.saveLoadOrders(load);
        return "loads details added successfully ";
    }

    @GetMapping("/")
    public List<LoadOrders> showAllLoads() {
        return lOrdersService.findAllLoads();
    }

    @GetMapping("/load/{loadId}")
    public LoadOrders showLoadsById(@PathVariable int loadId) {
        return lOrdersService.findLoadsById(loadId).get();
    }

    @DeleteMapping("/load/{loadId}")
    public String deleteLoadsById(@PathVariable int loadId) {
        lOrdersService.deleteLoadsById(loadId);
        return "redirect:/";
    }

    @PutMapping("/load/{loadId}")
    public String updateLoadsById(@PathVariable int loadId, @RequestBody LoadOrders load) {
        lOrdersService.updateLoadById(loadId, load);
        return "updated successfully";
    }

    @GetMapping("/load") 
    public List<LoadOrders> showLoadByShipperId(@RequestParam String shipperId) {
        shipperId = "shipper:"+shipperId;
        return lOrdersService.findLoadsByShipperId(shipperId);
    }    
}
