
package model;

import java.util.Random;


public class Jogador {
    // Armazena um id autoincrementado para o Jogador, além de nome e pontução referente ao jogos
    private int idJogador;
    private String nomeJogador;
    private int empatePontuacao;
    private int perdeuPontuacao;
    private int ganhouPontuacao;

    public Jogador(String nomeJogador, int empatePontuacao, int perdeuPontuacao, int ganhouPontuacao) {
        this.idJogador = idJogador;
        this.nomeJogador = nomeJogador;
        this.empatePontuacao = empatePontuacao;
        this.perdeuPontuacao = perdeuPontuacao;
        this.ganhouPontuacao = ganhouPontuacao;
    }

    public Jogador() {
        
    }   

    public int getIdJogador() {
        return idJogador;
    }

    public void setIdJogador(int idJogador) {
        this.idJogador = idJogador;
    }

    public String getNomeJogador() {
        return nomeJogador;
    }

    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }

    public int getEmpatePontuacao() {
        return empatePontuacao;
    }

    public void setEmpatePontuacao(int empatePontuacao) {
        this.empatePontuacao = empatePontuacao;
    }

    public int getPerdeuPontuacao() {
        return perdeuPontuacao;
    }

    public void setPerdeuPontuacao(int perdeuPontuacao) {
        this.perdeuPontuacao = perdeuPontuacao;
    }

    public int getGanhouPontuacao() {
        return ganhouPontuacao;
    }

    public void setGanhouPontuacao(int ganhouPontuacao) {
        this.ganhouPontuacao = ganhouPontuacao;
    }
   
    public String escolhaAleatoria(){
        Random gerador = new Random();
        Objetos o = new Objetos();
        
        switch(gerador.nextInt(6)){
            case 0:
                return o.getPedra();
            case 1:
                return o.getPapel();
            case 2:
                return o.getTesoura();
            case 3:
                return o.getPedra();
            case 4:
                return o.getPapel();
            case 5:
                return o.getTesoura();
                
        }
                
        return null;
        
    }
    
    public String escolhe(int op){
        Objetos o = new Objetos();
        
        switch(op){
            case 0:
                return o.getPedra();
            case 1:
                return o.getPapel();
            case 2:
                return o.getTesoura();
                
        }
                
        return null;
        
    }
    
    
    
}
