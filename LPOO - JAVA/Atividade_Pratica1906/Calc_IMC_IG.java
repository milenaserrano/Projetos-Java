import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Calc_IMC_IG extends JFrame {
    //Declara e cria os componentes
    JLabel jlPaciente = new JLabel("Paciente");
    JTextField jtfPaciente = new JTextField(40);
    JLabel jlPeso = new JLabel("Peso");
    JTextField jtfPeso = new JTextField(5);
    JLabel jlAltura = new JLabel("Altura");
    JTextField jtfAltura = new JTextField(5);
    //Componentes de Saída
    JLabel jlIMC = new JLabel("IMC");
    JLabel jlRIMC = new JLabel("");  
    //Botões
    JButton jbCalcular = new JButton("Calcular");
    JButton jbLimpar = new JButton("Limpar");
    //Construtor
    private Calc_IMC_IG() {
        setTitle("Cálculo e Classificação de IMC");
        setSize(350,125);
        setLocation(50,50);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5,2));
        setVisible(true);
        
        add(jlPaciente);
        add(jtfPaciente);
        add(jlPeso);
        add(jtfPeso);
        add(jlAltura);
        add(jtfAltura);
        add(jlIMC);
        add(jlRIMC);
        
        add(jbCalcular);
        add(jbLimpar);
        
        jbCalcular.addActionListener(new EventoJCalcular());   
        jbLimpar.addActionListener(new EventoJLimpar());  
    }
    
    public static void main(String[] args) {
        new Calc_IMC_IG();    
    }
    
    /*Classe interna que implementa os métodos da interface
      ActionListener */
      
      
    private class EventoJCalcular implements ActionListener {
        
        public void actionPerformed(ActionEvent ev) {
            
                     
            String paciente;
            double peso;
            double altura;
            double imc;
            
            paciente = jtfPaciente.getText();
            peso = Double.parseDouble(jtfPeso.getText());
            altura = Double.parseDouble(jtfAltura.getText());
            
            imc = peso/(altura * altura);
            
            jlRIMC.setText(Double.toString(imc));
            
            if (imc <= 18.5) {
                JOptionPane.showMessageDialog(null,"Abaixo do Peso !!!");       
            } else if (imc < 25) {
                JOptionPane.showMessageDialog(null,"Peso Ideal - Parabéns !!!");   
            } else if (imc < 30) {
                JOptionPane.showMessageDialog(null,"Levemente acima do Peso !!!");   
            } else if (imc < 35) {
                JOptionPane.showMessageDialog(null,"Obesidade Grau I !!!");   
            } else if (imc < 40) {
                JOptionPane.showMessageDialog(null,"Obesidade Grau II - Severa !!!");   
            } else {   
                JOptionPane.showMessageDialog(null,"Obesidade Grau III - Mórbida !!!");       
            }        
            
        }
    }
    
    private class EventoJLimpar implements ActionListener {        
        public void actionPerformed(ActionEvent ev) {            
            jtfPaciente.setText("");
            jtfPeso.setText("");    
            jtfAltura.setText("");    
            jlRIMC.setText("");    
            jtfPaciente.requestFocus();
        }
    }
}
