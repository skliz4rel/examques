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
public class ConcreteBuilder1 implements Builder {
    
    
     public Product buildPart(){
        
       Product p= new Product();
       
       p.setPart1(11);
       p.setPart2(12);
       p.setPart3(13);
       p.setPart4(14);
       
       return p;
    }

    
}
