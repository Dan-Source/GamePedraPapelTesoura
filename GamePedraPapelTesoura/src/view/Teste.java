/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.Jogador;
import model.Jogar;

/**
 *
 * @author aesshedai
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Jogador jogador = new Jogador();
        Jogador computador = new Jogador();
        
        Jogar j = new Jogar(jogador, computador);
      
    }
    
}
