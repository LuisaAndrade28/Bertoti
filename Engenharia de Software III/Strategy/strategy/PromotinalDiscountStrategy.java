/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.strategy;

/**
 *
 * @author Manhã
 */
public class PromotinalDiscountStrategy implements DiscountStrategy{
     @Override
    public double applyDiscount(double price) {
        return price * 0.8; // 20% de desconto
    }
    
}
