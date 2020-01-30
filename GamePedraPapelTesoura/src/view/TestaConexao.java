
package view;

import java.sql.Connection;
import java.sql.SQLException;
import model.Conexao;
import model.Jogador;
import model.JogadorDAO;

public class TestaConexao {

    public static void main(String[] args) throws SQLException {
        java.sql.Connection conexao;
        conexao = new Conexao().getConexao();
        System.out.println("view.TestaConexao.main()");
        conexao.close();
        
        Jogador j1 = new Jogador();
        
        j1.setNomeJogador("Daniel");
        j1.setGanhouPontuacao(0);
        j1.setEmpatePontuacao(1);
        j1.setPerdeuPontuacao(0);
        
        JogadorDAO jogo = new JogadorDAO();
        
        jogo.inserir(j1);
        
        jogo.imprimirRelatorio();
    }
    
}
