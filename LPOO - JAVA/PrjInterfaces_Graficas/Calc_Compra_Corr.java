
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Calc_Compra_Corr extends JFrame {
    //Declara e cria os componentes
    JLabel jlCliente = new JLabel("Cliente");
    JTextField jtfCliente = new JTextField(50);
    JLabel jlVC = new JLabel("Valor da Compra R$");
    JTextField jtfVC = new JTextField(5);
    JLabel jlCond_Pag = new JLabel("À (V)ista ou A (P)razo");
    JTextField jtfCond_Pag = new JTextField(5);
    JLabel jlPDA = new JLabel("% Desconto/Acréscimo");
    JTextField jtfPDA = new JTextField(5);
    
    JLabel jlVDA = new JLabel("Valor do Desconto/Acréscimo R$");
    JLabel jlRVDA = new JLabel("");
    
    JLabel jlVP = new JLabel("Valor a Pagar R$");
    JLabel jlRVP = new JLabel("");
    
    JButton jbCalcular = new JButton("Calcular");
    JButton jbLimpar = new JButton("Limpar");
        //Construtor
    private Calc_Compra_Corr() {
        setTitle("Cálculo de Valor a Pagar");
        setSize(350,225);
        setLocation(50,50);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(7,2));
        setVisible(true);
        
        add(jlCliente);
        add(jtfCliente);
        add(jlVC);
        add(jtfVC);
        add(jlCond_Pag);
        add(jtfCond_Pag);
        add(jlPDA);
        add(jtfPDA);
        add(jlVDA);
        add(jlRVDA);
        add(jlVP);
        add(jlRVP);
        
        add(jbCalcular);
        add(jbLimpar);
        
        jbCalcular.addActionListener(new EventoJCalcular());   
        jbLimpar.addActionListener(new EventoJLimpar());  
    }
    
    public static void main(String[] args) {
        new Calc_Compra_Corr();    
    }
    
    /*Classe interna que implementa os métodos da interface
      ActionListener */
      
      
    private class EventoJCalcular implements ActionListener {
        
        public void actionPerformed(ActionEvent ev) {
            
            String Cliente, Cond_Pagto;
            double Valor_Compra, Perc_Desc_Acre, Vr_Desc_Acre, Vr_Pagar;
            
            Cliente = jtfCliente.getText();
            
            Valor_Compra = Double.parseDouble(jtfVC.getText());
            Cond_Pagto = jtfCond_Pag.getText();
            
            if (Cond_Pagto.equals("V")) {
                jlPDA.setText("% de Desconto..............: ");
            } else {    
                jlPDA.setText("% de Acréscimo.............: ");
            }    
            Perc_Desc_Acre = Double.parseDouble(jtfPDA.getText());
            //processamento
            Vr_Desc_Acre = Valor_Compra * Perc_Desc_Acre / 100;
            
            if (Cond_Pagto.equals("V")) {
                jlVDA.setText("Valor Desconto...........R$: ");
                Vr_Pagar = Valor_Compra - Vr_Desc_Acre;
            } else {
                jlVDA.setText("Valor Acréscimo..........R$: ");
                Vr_Pagar = Valor_Compra + Vr_Desc_Acre;
            }
            jlRVDA.setText(Double.toString(Vr_Desc_Acre));
            jlRVP.setText(Double.toString(Vr_Pagar));           
                
        }
    }  
    
    
    
    private class EventoJLimpar implements ActionListener {        
        public void actionPerformed(ActionEvent ev) {            
            jtfCliente.setText("");
            jtfVC.setText("");    
            jtfCond_Pag.setText("");    
            jlRVDA.setText("");    
            jlRVP.setText("");    
            jtfCliente.requestFocus();
        }
    }
}