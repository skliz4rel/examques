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
public class ConcreteBuilder2 implements Builder{
    
     public Product buildPart(){
        
        Product p= new Product();
       
       p.setPart1(21);
       p.setPart2(22);
       p.setPart3(23);
       p.setPart4(24);
       
       return p;
    }

}
