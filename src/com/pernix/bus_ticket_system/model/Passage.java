/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pernix.bus_ticket_system.model;

/**
 *
 * @author Adrián
 */
public abstract class Passage {
    protected float money;
    
    public abstract void accept(Visitor visitor);
    
    public void deposit(float money){
        this.money+=money;
    }
    
    public void collect(float money){
        this.money-=money;
    }
    
}
