/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aishaexam;

import com.mycompany.aishaexam.common.Boat;
import com.mycompany.aishaexam.factory.BoatFactory;

/**
 *
 * @author skliz
 */
public class Main {
    
    
    public static void main(String[] agrs){
    
        System.out.println("This is started working...");
        
       //Client.. Implementing the Factory design pattern objects below.
        Boat myBigBoat = BoatFactory.create("big");
        myBigBoat.topSpeed();
        
        Boat mySmallBoat = BoatFactory.create("small");
        mySmallBoat.topSpeed();
        
        
        //Implementing the Decorator design pattern below.
        
    }
    
    
}
