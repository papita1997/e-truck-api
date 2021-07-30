package com.pawan.etruckapi.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class LoadOrders {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String loadingPoint;
    private String unloadingPoint;
    private String productType;
    private String truckType;
    private int noOfTrucks;
    private double weight;
    private String comment;
    private String shipperId;
    private String date;

    public void setId(int id) {
        this.id = id;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public void setLoadingPoint(String loadingPoint) {
        this.loadingPoint = loadingPoint;
    }
    public void setNoOfTrucks(int noOfTruck) {
        this.noOfTrucks = noOfTruck;
    }
    public void setProductType(String productType) {
        this.productType = productType;
    }
    public void setShipperId(String shipperId) {
        this.shipperId = shipperId;
    }
    public void setTruckType(String truckType) {
        this.truckType = truckType;
    }
    public void setUnLoadingPoint(String unLoadingPoint) {
        this.unloadingPoint = unLoadingPoint;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public String getComment() {
        return comment;
    }
    public String getDate() {
        return date;
    }
    public int getId() {
        return id;
    }
    public String getLoadingPoint() {
        return loadingPoint;
    }
    public int getNoOfTrucks() {
        return noOfTrucks;
    }
    public String getProductType() {
        return productType;
    }
    public String getShipperId() {
        return shipperId;
    }
    public String getTruckType() {
        return truckType;
    }
    public String getUnloadingPoint() {
        return unloadingPoint;
    }
    public double getWeight() {
        return weight;
    }

    public LoadOrders() {
        
    }
}
