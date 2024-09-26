/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.observer;

/**
 *
 * @author Manhã
 */
public class Observer {

    public static void main(String[] args) {
         // Criando o canal de notícias
        NewsChannel newsChannel = new NewsChannel();

        // Criando observadores (usuários)
        User user1 = new User("Alice");
        User user2 = new User("Bob");
        User user3 = new User("Charlie");

        // Registrando observadores no canal de notícias
        newsChannel.registerObserver(user1);
        newsChannel.registerObserver(user2);
        newsChannel.registerObserver(user3);

        // Publicando uma nova notícia
        newsChannel.publishNews("Novo padrão de design foi lançado!");

        // Remover um observador
        newsChannel.removeObserver(user2);

        // Publicando outra notícia
        newsChannel.publishNews("Nova versão do Java foi lançada!");
    }
}

