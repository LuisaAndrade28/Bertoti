/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Manhã
 */
public class NewsChannel implements Subject{
 private List<ObserverFace> observers;
    private String latestNews;

    public NewsChannel() {
        observers = new ArrayList<>();
    }

    // Registrar um observador
    public void registerObserver(ObserverFace observer) {
        observers.add(observer);
    }

    // Remover um observador
    public void removeObserver(ObserverFace observer) {
        observers.remove(observer);
    }

    // Notificar todos os observadores
    @Override
    public void notifyObservers() {
        for (ObserverFace observer : observers) {
            observer.update(latestNews);
        }
    }

    // Publicar uma nova notícia
    public void publishNews(String news) {
        this.latestNews = news;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void removeObserver(Observer observer) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void removeObserver(User user2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void registerObserver(User user1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
