package dev.ulman.dmsspringmvc.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Collection;

public class Estimator extends Employee {

    private Collection<Contract> contracts;

    //Getters @ Setters--------------------->
    public Collection<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(Collection<Contract> contracts) {
        this.contracts = contracts;
    }
}