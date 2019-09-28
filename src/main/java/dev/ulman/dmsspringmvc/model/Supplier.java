package dev.ulman.dmsspringmvc.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Collection;

public class Supplier {

    private long supplierId;
    private String name;
    private Address address;
    private int phoneNumber;
    private Collection<Product> products;

    //Getters @ Setters--------------------->

    public long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(long supplierId) {
        this.supplierId = supplierId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Collection<Product> getProducts() {
        return products;
    }

    public void setProducts(Collection<Product> products) {
        this.products = products;
    }
}
