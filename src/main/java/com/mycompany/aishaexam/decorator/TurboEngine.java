/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aishaexam.decorator;

import com.mycompany.aishaexam.common.Boat;

/**
 *
 * @author skliz
 */
public abstract class TurboEngine  implements Boat {
    
    
    protected Boat decoratedBoat;
    
    public TurboEngine(Boat decoratedBoat){
        this.decoratedBoat = decoratedBoat;
    }
    
    public int topSpeed (){
               
        return this.maxCapacity;
    }
    
}
