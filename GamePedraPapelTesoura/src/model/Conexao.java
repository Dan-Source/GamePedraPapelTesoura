
package model;

import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {
    //private static final String DRIVER = "com.mysql.jdbc.driver";
    private static final String URL = "jdbc:mysql://localhost:3306/?user=root";
    private static final String USER = "root";
    private static final String PASS = "12345678";
    public java.sql.Connection getConexao(){
        try{
            return DriverManager.getConnection(URL, USER, PASS);
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
