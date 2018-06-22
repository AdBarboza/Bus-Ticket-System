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
public interface Visitor {
    public void visit(NormalPassage passage);
    public void visit(PremiunPassage passage);
}
