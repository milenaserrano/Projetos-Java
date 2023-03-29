
package Utilitarios;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.util.Date;

public class Conexao {
    final private String driver = "com.mysql.jdbc.Driver";       
    final private String url = "jdbc:mysql://localhost/loja";
    final private String usuario = "root";
    final private String senha = "";
    private Connection conexao;
    public Statement statement;
    public ResultSet resultset;
    
     public boolean conecta() {
        Date d = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
        String Strd = dateFormat.format(d);
        boolean result = true;
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url,usuario,senha);
            JOptionPane.showMessageDialog(null,"Conexão estabelecida!\n" + Strd );
        } catch (ClassNotFoundException Driver) {
            JOptionPane.showMessageDialog(null,"\nDriver não localizado!\nErro: " + Driver);
            result = false;
        } catch (SQLException Fonte) {
            JOptionPane.showMessageDialog(null,"\nFonte de dados não localizada!\nErro: " + Fonte);
            result = false;
        }
        return result;        
    }
    public void desconecta () {
        try {
            conexao.close();
            JOptionPane.showMessageDialog(null,"Conexão com o banco de dados fechada");
        } catch (SQLException fecha) {
            JOptionPane.showMessageDialog(null, "\nErro no fechamento do Banco de Dados!\nErro: " + fecha);
        }
    }
    public void executaSQL(String sql) {
        try {            
            statement = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
            resultset = statement.executeQuery(sql);
        } catch (SQLException excecao) {
            JOptionPane.showMessageDialog(null,"\nErro no comando SQL!222222\nErro: " + excecao + "" + "\nComando SQL passado: " + sql);
        }
    }
}
