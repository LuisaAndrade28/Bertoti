/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.strategy;

/**
 *
 * @author Manhã
 */
public class ShoppingCart {
    private DiscountStrategy discountStrategy;

    public ShoppingCart(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double calculateFinalPrice(double price) {
        return discountStrategy.applyDiscount(price);
    }
}
