package dev.ulman.dmsspringmvc.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;

public class OfferDetails implements Serializable {

    private Offer offer;

    private Product product;

    private double quantity;

    //Getters @ Setters--------------------->


    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public Offer getOffer() {
        return offer;
    }

    public void setOffer(Offer offer) {
        this.offer = offer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
