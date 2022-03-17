/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aishaexam.factory;

import com.mycompany.aishaexam.common.SpeedBoat;
import com.mycompany.aishaexam.common.CruiseShip;
import com.mycompany.aishaexam.common.Boat;

/**
 *
 * @author skliz
 */
public class BoatFactory {
    
    static Boat boat;
    
    public static Boat create(String s){
        
        if(s.equalsIgnoreCase("big")){
            
           boat =new CruiseShip();
        }
        
        else if(s.equalsIgnoreCase("small")){
           
              boat = new SpeedBoat();
        }
        
        return boat;
    }
    
}
