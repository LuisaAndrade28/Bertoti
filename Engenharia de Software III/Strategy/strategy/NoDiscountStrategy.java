/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.strategy;

/**
 *
 * @author Manhã
 */
public class NoDiscountStrategy implements DiscountStrategy {
    @Override
    public double applyDiscount(double price){
        return price;
    }
    
}

