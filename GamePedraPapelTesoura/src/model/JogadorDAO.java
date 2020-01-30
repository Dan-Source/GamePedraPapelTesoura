
package model;

import java.awt.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.naming.spi.DirStateFactory;

public class JogadorDAO {
    public void inserir(Jogador jogador) throws SQLException{
        // conectando 
        java.sql.Connection conexao = new Conexao().getConexao();
        
        // cria um prapareStatemat
        String sql = "insert into jogo.RelatorioDeJogos"
                + "(nomeJogador, empatePontuacao, perdeuPontuacao, ganhouPontuacao)"
                + "values (?,?,?,?)";
        
        try{
            PreparedStatement stmt = conexao.prepareStatement(sql);
            
            // preencher o valores
            stmt.setString(1, jogador.getNomeJogador());
            stmt.setInt(2, jogador.getEmpatePontuacao());
            stmt.setInt(3, jogador.getPerdeuPontuacao());
            stmt.setInt(4, jogador.getGanhouPontuacao());
            stmt.execute();
            stmt.close();
            System.out.println("Inserido!");
            conexao.close();
            
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
                
                
    }
    
    public ArrayList<Jogador> getRelatorioJogadores(){
        try{ // conectando 
            java.sql.Connection conexao = new Conexao().getConexao();
            // criando uma lista para armazenar o dados
            ArrayList<Jogador> relatorio;
            relatorio = new ArrayList<Jogador>();

            PreparedStatement stmt = conexao.prepareStatement("select * from jogo.RelatorioDeJogos");

            ResultSet rs = stmt.executeQuery();

                while(rs.next()){
                    // Cria o objeto jogador
                    Jogador j = new Jogador();
                    j.setIdJogador(rs.getInt("idJOgador"));
                    j.setNomeJogador(rs.getString("nomeJogador"));
                    j.setEmpatePontuacao(rs.getInt("empatePontuacao"));
                    j.setPerdeuPontuacao(rs.getInt("perdeuPontuacao"));
                    j.setGanhouPontuacao(rs.getInt("ganhouPontuacao"));
                    relatorio.add(j);
                }
                
            rs.close();
            stmt.close();
            return relatorio;
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    
    public String imprimirRelatorio(){      
        ArrayList<Jogador> relatorio = this.getRelatorioJogadores();
        StringBuilder msg = new StringBuilder();
        for(Jogador e: relatorio ){
            msg.append("Id: " + e.getIdJogador());
            msg.append("Nome: " + e.getNomeJogador());
            msg.append("Empate: " + e.getEmpatePontuacao());
            msg.append("Perdeu: " + e.getPerdeuPontuacao());
            msg.append("Ganhou: " + e.getGanhouPontuacao());
            msg.append("\n");
        }
        System.out.println(msg.toString());
        return msg.toString();
        
        
    }
}
