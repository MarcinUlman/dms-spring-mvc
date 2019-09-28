package dev.ulman.dmsspringmvc.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Collection;


public class Offer {

    private long offerId;
    private Contract contract;
    private Collection<OfferDetails> offerDatails;


    //Getters @ Setters--------------------->

    public Collection<OfferDetails> getOfferDatails() {
        return offerDatails;
    }

    public void setOfferDatails(Collection<OfferDetails> offerDatails) {
        this.offerDatails = offerDatails;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public long getOfferId() {
        return offerId;
    }

    public void setOfferId(long offerId) {
        this.offerId = offerId;
    }
}