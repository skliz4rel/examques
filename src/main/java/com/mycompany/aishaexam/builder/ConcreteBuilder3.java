/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aishaexam.builder;

/**
 *
 * @author skliz
 */
public class ConcreteBuilder3 implements Builder{
    
     
     public Product buildPart(){
        
       Product p= new Product();
       
       p.setPart1(31);
       p.setPart2(32);
       p.setPart3(33);
       p.setPart4(34);
       
       return p;
    }

    
}
