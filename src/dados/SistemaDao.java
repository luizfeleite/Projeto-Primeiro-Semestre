package dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SistemaDao {
    
    public static Connection conectar() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/bancoprojeto", "root", "5521");
        return conectado;
    }
    public static ResultSet listarTodosProdutos() throws ClassNotFoundException, SQLException {
        Connection conectado = conectar();
        PreparedStatement stConsultar = conectado.prepareStatement("SELECT * FROM produtos");
        ResultSet resultado = stConsultar.executeQuery();
        return resultado;
    }
}