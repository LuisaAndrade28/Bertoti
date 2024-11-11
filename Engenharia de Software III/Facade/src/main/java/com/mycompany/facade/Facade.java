/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.facade;

/**
 *
 * @author Manhã
 */
public class Facade {

    public static void main(String[] args) {
        // Criando o objeto Facade
        RestauranteFacade restaurante = new RestauranteFacade();

        // Cliente fazendo um pedido
        restaurante.fazerPedido("Pizza de Calabresa", 45.50);
        restaurante.fazerPedido("Hamburguer", 25.00);
    }
}
