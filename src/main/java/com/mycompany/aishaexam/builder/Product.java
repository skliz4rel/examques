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
public class Product {
    
    private int Part1, Part2, Part3, Part4;

    public int getPart1() {
        return Part1;
    }

    public void setPart1(int Part1) {
        this.Part1 = Part1;
    }

    public int getPart2() {
        return Part2;
    }

    public void setPart2(int Part2) {
        this.Part2 = Part2;
    }

    public int getPart3() {
        return Part3;
    }

    public void setPart3(int Part3) {
        this.Part3 = Part3;
    }

    public int getPart4() {
        return Part4;
    }

    public void setPart4(int Part4) {
        this.Part4 = Part4;
    }
    
    @Override
    public String toString(){
        
        return "{ Part1 : "+this.Part1+", Part2 : "+this.Part2+", Part3 : "+this.Part3+", Part4 : "+this.Part4 +" }";
    }
}
