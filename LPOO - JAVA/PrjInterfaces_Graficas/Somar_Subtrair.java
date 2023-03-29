
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Somar_Subtrair extends JFrame {
    //Declara e cria os componentes
    JLabel jlValor1 = new JLabel("Primeiro número");
    JTextField jtfValor1 = new JTextField(5);
    JLabel jlValor2 = new JLabel("Segundo número");
    JTextField jtfValor2 = new JTextField(5);
    JLabel jlValor3 = new JLabel("Terceiro número");
    JTextField jtfValor3 = new JTextField(5);
    
    JButton jbSomar = new JButton("Somar");
    
    JButton jbSubtrair = new JButton("Subtrair");
    
    JButton jbLimpar = new JButton("Limpar");
    
    JLabel jlResultado = new JLabel("Resultado");
    JLabel jlResultado_Calc = new JLabel("");
    
    JLabel jlEspaco = new JLabel("");
    
    //Construindo
    private Somar_Subtrair() {
        setTitle("Soma e Subtração");
        setSize(250,125);
        setLocation(50,50);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6,2));
        setVisible(true);
        
        add(jlValor1);
        add(jtfValor1);
        add(jlValor2);
        add(jtfValor2);
        add(jlValor3);
        add(jtfValor3);
        add(jbSomar);
        add(jbSubtrair);
        add(jbLimpar);
        add(jlEspaco);
        add(jlResultado);
        add(jlResultado_Calc);
        
        jbSomar.addActionListener(new EventoJSomar());   
        jbSubtrair.addActionListener(new EventoJSubtrair());   
        jbLimpar.addActionListener(new EventoJLimpar());  
    }
    
    public static void main(String[] args) {
        new Somar_Subtrair();    
    }
    
    /*Classe interna que implementa os métodos da interface
      ActionListener */
      
      
    private class EventoJSomar implements ActionListener {
        
        public void actionPerformed(ActionEvent ev) {
            
            double resultadoDouble = 0;
            String resultadoString = "";
            
            resultadoDouble = Double.parseDouble(jtfValor1.getText())
            + Double.parseDouble(jtfValor2.getText()) + Double.parseDouble(jtfValor3.getText());

            resultadoString = Double.toString(resultadoDouble);
            
            jlResultado_Calc.setText(resultadoString);
        }
    }
    
    
    private class EventoJSubtrair implements ActionListener {
        
        public void actionPerformed(ActionEvent ev) {
            
            double resultadoDouble = 0;
            String resultadoString = "";
            
            resultadoDouble = Double.parseDouble(jtfValor1.getText())
            - Double.parseDouble(jtfValor2.getText()) - Double.parseDouble(jtfValor3.getText());

            resultadoString = Double.toString(resultadoDouble);
            
            jlResultado_Calc.setText(resultadoString);
        }
    }
    
    
    private class EventoJLimpar implements ActionListener {        
        public void actionPerformed(ActionEvent ev) {            
            jtfValor1.setText("");
            jtfValor2.setText("");    
            jtfValor3.setText("");  
            jlResultado_Calc.setText("");
            jtfValor1.requestFocus();
        }
    }
}
