/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.composite;

/**
 *
 * @author Manhã
 */
public class Arquivo implements Componente {
    private String nome;
    private int tamanho;

    public Arquivo(String nome, int tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Arquivo: " + nome + " - Tamanho: " + tamanho + "KB");
    }
}
