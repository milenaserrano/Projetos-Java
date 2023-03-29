import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.FlowLayout;
public class UsaJtextField {
public static void main (String[] args) {
    JFrame janela = new JFrame ();
    janela.setTitle ("JTextField");
    janela.setSize (350,150);
    janela.setLocation (50,50);
    janela.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    
    //Por definição a janela (JFrame) só aceita um componente de cada vez, assim sendo é necessário 
    //aplicar um gestor de layout para conseguirmos adicionar o rótulo e a caixa de texto. 
    
    janela.setLayout (new FlowLayout());
    JLabel rotulo = new JLabel ("Escreva o seu nome: ");
    JTextField CaixaTexto = new JTextField (10);
    janela.add (rotulo);
    janela.add (CaixaTexto);
    janela.setVisible (true);
}
}
