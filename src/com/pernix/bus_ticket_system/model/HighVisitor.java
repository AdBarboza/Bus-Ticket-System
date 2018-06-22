/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pernix.bus_ticket_system.model;

/**
 *
 * @author curso
 */
public class HighVisitor implements Visitor{

    @Override
    public void visit(NormalPassage passage) {
        passage.collect(700);
    }

    @Override
    public void visit(PremiunPassage passage) {
        passage.collect(500);
    }
    
}
