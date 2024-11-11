/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.facade;

/**
 *
 * @author Manhã
 */
public class RestauranteFacade {
    private Atendimento atendimento;
    private Cozinha cozinha;
    private Caixa caixa;

    public RestauranteFacade() {
        atendimento = new Atendimento();
        cozinha = new Cozinha();
        caixa = new Caixa();
    }

    // Método simplificado para fazer um pedido completo
    public void fazerPedido(String prato, double valor) {
        atendimento.receberPedido(prato);   // Atendimento recebe o pedido
        cozinha.prepararPrato(prato);       // Cozinha prepara o prato
        caixa.cobrar(valor);                // Caixa realiza o pagamento
    }
}
