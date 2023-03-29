import javax.swing.JFrame;
import javax.swing.JCheckBox;
import java.awt.FlowLayout;

public class UsaCheckBox {
    public static void main (String[] args) {
    JFrame janela = new JFrame();
    janela.setTitle("JChekBox");
    janela.setSize (150,150);
    janela.setLocation (50,50);
    janela.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    janela.setLayout (new FlowLayout());
    JCheckBox CaixaVerificacao1 = new JCheckBox ("Branco");
    JCheckBox CaixaVerificacao2 = new JCheckBox ("Preto");
    JCheckBox CaixaVerificacao3 = new JCheckBox ("Amarelo");
    
    janela.add (CaixaVerificacao1);
    janela.add (CaixaVerificacao2);
    janela.add (CaixaVerificacao3);
    janela.setVisible (true);
    
}
}