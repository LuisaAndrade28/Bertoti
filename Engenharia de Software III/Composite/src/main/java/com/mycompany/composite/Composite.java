/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.composite;

/**
 *
 * @author Manhã
 */
public class Composite {

    public static void main(String[] args) {
       // Criando arquivos individuais
        Arquivo arquivo1 = new Arquivo("Arquivo1.txt", 20);
        Arquivo arquivo2 = new Arquivo("Arquivo2.txt", 50);
        Arquivo arquivo3 = new Arquivo("Arquivo3.txt", 100);

        // Criando diretórios
        Diretorio diretorio1 = new Diretorio("Fotos");
        Diretorio diretorio2 = new Diretorio("Documentos");

        // Adicionando arquivos aos diretórios
        diretorio1.adicionarComponente(arquivo1);
        diretorio1.adicionarComponente(arquivo2);

        diretorio2.adicionarComponente(arquivo3);

        // Criando um diretório principal e adicionando subdiretórios
        Diretorio diretorioPrincipal = new Diretorio("Diretório Principal");
        diretorioPrincipal.adicionarComponente(diretorio1);
        diretorioPrincipal.adicionarComponente(diretorio2);

        // Exibindo os detalhes de todos os componentes (arquivos e diretórios)
        diretorioPrincipal.exibirDetalhes();
    
    }
}
