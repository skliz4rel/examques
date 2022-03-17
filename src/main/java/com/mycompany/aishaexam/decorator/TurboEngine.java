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
public class TurboEngine extends BoatDecorator{
    
    public TurboEngine(Boat decoratedBoat){
        
        super(decoratedBoat);
    }
    
    @Override
    public int topSpeed (){
        //int a = this.maxCapacity;
        return this.add10(decoratedBoat.topSpeed());
    }
    
    private int add10(int num){
        
        return (num+10);
    }
    
}
