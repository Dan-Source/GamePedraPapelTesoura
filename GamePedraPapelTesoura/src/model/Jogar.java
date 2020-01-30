
package model;

import javax.swing.JOptionPane;


public class Jogar {
    private Jogador jogador;
    private Jogador computador;

    public Jogar(Jogador jogador, Jogador computador) {
        this.jogador = jogador;
        this.computador = computador;
    }

    
    // Condicionais
    public String jogar(String a, String b){
        String pedra = "pedra";
        String papel = "papel";
        String tesoura = "tesoura";
        
        /*String a = jogador.escolhe(op);
        this.exibirMensagem("Esolha do Jogador:" + a);
        System.out.println("Esolha do Jogador:" + a);
        String b = computador.escolhaAleatoria();
        this.exibirMensagem("Esolha do Computador:" + b);
        System.out.println("Esolha do Computador:" + b);*/
        
        // Caso a opções sejam iguais
        if(a.equals(b)){
            int x = this.jogador.getEmpatePontuacao();
            this.jogador.setEmpatePontuacao(x+1);
            System.out.println("Empate: " + this.jogador.getEmpatePontuacao());
            return "Voce Empatou!";
            
        }else if(a.equals(pedra)){
                if(b.equals(tesoura)){
                
                int x = this.jogador.getGanhouPontuacao();
                this.jogador.setGanhouPontuacao(x+1);
                
                return "Você ganhou.";

                } else if(b.equals(papel)){

                    int x = this.jogador.getPerdeuPontuacao();
                    this.jogador.setPerdeuPontuacao(x);
                    
                    // computador ganhou
                    int y = this.computador.getGanhouPontuacao();
                    this.computador.setGanhouPontuacao(y+1);
                    

                    return "Você perdeu.";
                }
            }else
        // Papel ganha de pedra e perde para tesoura
        if(a.equals(papel)){
            if(b.equals(pedra)){
                
                int x = this.jogador.getGanhouPontuacao();
                this.jogador.setGanhouPontuacao(x+1);

                return "Você ganhou.";

            } else if(b.equals(tesoura)){

                int x = this.jogador.getPerdeuPontuacao();
                this.jogador.setPerdeuPontuacao(x+1);
                
                // computador ganhou
                    int y = this.computador.getGanhouPontuacao();
                    this.computador.setGanhouPontuacao(y+1);

                return "Você perdeu.";
           }
        }else
        // Tesoura ganha de papel e perde para pedra
        if(a.equals(tesoura)){
            if(b.equals(papel)){
                String msg = "Tesoura ganha de Papel" + "Você ganhou.";
                int x = this.jogador.getGanhouPontuacao();
                this.jogador.setGanhouPontuacao(x+1);
                return "Você ganhou.";
            } else if(b.equals(pedra)){
                
                int x = this.jogador.getPerdeuPontuacao();
                this.jogador.setPerdeuPontuacao(x+1);
                
                // computador ganhou
                    int y = this.computador.getGanhouPontuacao();
                    this.computador.setGanhouPontuacao(y+1);

                return "Você perdeu.";
           
                }
         }
        int ganhou = this.jogador.getGanhouPontuacao();
        int perdeu = this.jogador.getPerdeuPontuacao();
        int empatou = this.jogador.getEmpatePontuacao();
        System.out.println(" " + ganhou + " ");
        System.out.println(" " + perdeu + " ");
        System.out.println(" " + empatou + " ");
        return null;
}
    public void exibirMensagem(String msg){
        JOptionPane.showMessageDialog(null,msg);
    }
    
    
    
}
