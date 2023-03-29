import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exemplo_Evento implements ActionListener{
    JFrame janela = new JFrame ("ExemploActionEvent");
    JPanel painel = new JPanel();
    JButton botao1 = new JButton ("Botão1");
    JButton botao2 = new JButton ("Botão2");
    JButton botao3 = new JButton ("Botão3");
    JLabel rotulo = new JLabel();
    JLabel mensagem = new JLabel();
    
    public  Exemplo_Evento() {
        janela.setSize (250,150);
        janela.setDefaultCloseOperation (JFrame. EXIT_ON_CLOSE);
        janela.setVisible(true);
        
        painel.add (botao1);
        painel.add (botao2);
        painel.add (botao3);
        painel.add (rotulo);
        janela.add (painel);
        
        //Registro do listener junto dos componentes botao1 e botao2
        botao1.addActionListener (this);
        botao2.addActionListener (this);
        botao3.addActionListener (this);
    }
    public void actionPerformed (ActionEvent e) {
        if (e. getSource () == botao1) {
            rotulo.setText ("Clicou o botão1!");
        }
        if (e. getSource () == botao2) {
            rotulo.setText ("Clicou o botão2!");
        }
        if (e. getSource () == botao3) {
            rotulo.setText ("Clicou o botão3!");
        }
        
        
    }
    
    public static void main (String args []) {
        new Exemplo_Evento();
       
    }
}
