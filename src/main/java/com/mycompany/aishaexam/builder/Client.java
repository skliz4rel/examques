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
public class Client {
    
    public static void main(String[] args){
        
        Product p= new ConcreteBuilder1().buildPart();
        
        System.out.println(p);
        
        p= new ConcreteBuilder2().buildPart();
        
        System.out.println(p);
        
        p= new ConcreteBuilder3().buildPart();
        
        System.out.println(p);
    }
    
}
