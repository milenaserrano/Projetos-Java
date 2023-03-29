import javax.swing.JFrame;
import javax.swing.JLabel;
public class UsaLabel {
    public static void main (String[] args) {
        JFrame janela = new JFrame();
        janela.setVisible(true);
        janela.setTitle("Jlabel");
        janela.setSize(350,150);
        janela.setLocation (50,50);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel rotulo = new JLabel ("Escreva seu nome: ");
        janela.add(rotulo);
        
    }
}
