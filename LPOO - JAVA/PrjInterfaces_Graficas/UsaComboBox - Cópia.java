import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.FlowLayout;
public class UsaComboBox {
    public static void main (String[] args) {
       JFrame janela = new JFrame();
       janela.setTitle ("JComboBox");
       janela.setSize (350,150);
       janela.setLocation (50,50);
       
       janela.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
       janela.setLayout (new FlowLayout());
       JLabel rotulo = new JLabel ("Selecione uma cor: ");
       JComboBox caixaCombinacao = new JComboBox ();
       janela.add(rotulo);
       caixaCombinacao.addItem("Branco");
       caixaCombinacao.addItem("Preto");
       caixaCombinacao.addItem("Amarelo");
       janela.add(caixaCombinacao);
       janela.setVisible (true);
    }
}