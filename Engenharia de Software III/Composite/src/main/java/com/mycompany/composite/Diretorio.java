/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.composite;

/**
 *
 * @author Manhã
 */
import java.util.ArrayList;
import java.util.List;

public class Diretorio implements Componente {
    private String nome;
    private List<Componente> componentes = new ArrayList<>();

    public Diretorio(String nome) {
        this.nome = nome;
    }

    public void adicionarComponente(Componente componente) {
        componentes.add(componente);
    }

    public void removerComponente(Componente componente) {
        componentes.remove(componente);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Diretório: " + nome);
        for (Componente componente : componentes) {
            componente.exibirDetalhes(); // Delegação da exibição para os componentes filhos
        }
    }
}
