/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.singleton;

/**
 *
 * @author Manhã
 */
public class SingletonInstancia {

    private static SingletonInstancia instancia;


    private SingletonInstancia() {

    }


    public static SingletonInstancia getInstancia() {

        if (instancia == null) {
            instancia = new SingletonInstancia();
        }
        return instancia;
    }


    public void mostrarMensagem() {
        System.out.println("Instância do SingletonInstancia acessada!");
    }
}
