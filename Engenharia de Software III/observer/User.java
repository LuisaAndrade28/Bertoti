/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.observer;

/**
 *
 * @author Manhã
 */
public class User {
     private String name;

    public User(String name) {
        this.name = name;
    }

    public void update(String news) {
        System.out.println(name + " recebeu a notícia: " + news);
    }
}
