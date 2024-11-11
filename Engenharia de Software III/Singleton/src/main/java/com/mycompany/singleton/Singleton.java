/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.singleton;

/**
 *
 * @author Manhã
 */
public class Singleton {

    public static void main(String[] args) {

        SingletonInstancia instancia1 = SingletonInstancia.getInstancia();
        instancia1.mostrarMensagem();


        SingletonInstancia instancia2 = SingletonInstancia.getInstancia();
        instancia2.mostrarMensagem();


        System.out.println("As instâncias são iguais? " + (instancia1 == instancia2));
    }
}
