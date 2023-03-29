import javax.swing.JOptionPane;
public class UsaJOPShowOptionDialog {
    public static void main (String[] args) {
        String[] tiposConexao = {"Wireless","ADSL","Fibra ótica"};
        int opcaoEscolhida = 
        JOptionPane.showOptionDialog (null,
        "Escolha uma das conexões: ", "Tipos de conexão",
        
       JOptionPane.DEFAULT_OPTION,
       JOptionPane.QUESTION_MESSAGE,null,
       tiposConexao, "Wireless");
       System.out.println ("A opção escolhida foi: " + opcaoEscolhida);
    }
}