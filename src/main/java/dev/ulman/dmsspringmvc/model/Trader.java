package dev.ulman.dmsspringmvc.model;

import java.util.Collection;

public class Trader extends Employee {

    private int level; //mlodszy specjalist, inzynier sprzedazy, dyrektor oddzilu
    private Collection<Customer> customers;


    //Getters @ Setters--------------------->
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Collection<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Collection<Customer> customers) {
        this.customers = customers;
    }

}