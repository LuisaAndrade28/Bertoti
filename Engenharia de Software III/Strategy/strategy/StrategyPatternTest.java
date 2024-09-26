/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.strategy;

/**
 *
 * @author Manhã
 */
public class StrategyPatternTest {
    public static void main(String[] args) {
            double price = 100.0;

            // Usando a estratégia Sem Desconto
            ShoppingCart cart = new ShoppingCart(new NoDiscountStrategy());
            System.out.println("Preço final sem desconto: " + cart.calculateFinalPrice(price));

            // Usando a estratégia de Desconto de Fim de Semana
            cart.setDiscountStrategy(new WeekendDiscountStrategy());
            System.out.println("Preço final com desconto de fim de semana: " + cart.calculateFinalPrice(price));

            // Usando a estratégia de Desconto Promocional
            cart.setDiscountStrategy(new PromotinalDiscountStrategy());
            System.out.println("Preço final com desconto promocional: " + cart.calculateFinalPrice(price));
        }
}
