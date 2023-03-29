import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Calc_Media_IG extends JFrame {
    //Declara e cria os componentes
    JLabel jlAluno = new JLabel("Aluno");
    JTextField jtfAluno = new JTextField(40);
    JLabel jlDisciplina = new JLabel("Disciplina");
    JTextField jtfDisciplina = new JTextField(20);
    JLabel jlNota1 = new JLabel("1º Bimestre");
    JTextField jtfNota1 = new JTextField(5);
    JLabel jlNota2 = new JLabel("2º Bimestre");
    JTextField jtfNota2 = new JTextField(5);
    JLabel jlNota3 = new JLabel("3º Bimestre");
    JTextField jtfNota3 = new JTextField(5);
    JLabel jlNota4 = new JLabel("4º Bimestre");
    JTextField jtfNota4 = new JTextField(5);
    //Componentes de Saída
    JLabel jlMF = new JLabel("Média Final");
    JLabel jlRMF = new JLabel("");  
    //Botões
    JButton jbCalcular = new JButton("Calcular");
    JButton jbLimpar = new JButton("Limpar");
    //Construtor
    private Calc_Media_IG() {
        setTitle("Cálculo de Média Final");
        setSize(350,300);
        setLocation(50,50);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(8,2));
        setVisible(true);
        
        add(jlAluno);
        add(jtfAluno);
        add(jlDisciplina);
        add(jtfDisciplina);
        add(jlNota1);
        add(jtfNota1);
        add(jlNota2);
        add(jtfNota2);
        add(jlNota3);
        add(jtfNota3);
        add(jlNota4);
        add(jtfNota4);
        add(jlMF);
        add(jlRMF);
        
        add(jbCalcular);
        add(jbLimpar);
        
        jbCalcular.addActionListener(new EventoJCalcular());   
        jbLimpar.addActionListener(new EventoJLimpar());  
    }
    
    public static void main(String[] args) {
        new Calc_Media_IG();    
    }
    
    /*Classe interna que implementa os métodos da interface
      ActionListener */
      
      
    private class EventoJCalcular implements ActionListener {
        
        public void actionPerformed(ActionEvent ev) {
            
                     
            String aluno;
            String disciplina;
            double nota1;
            double nota2;
            double nota3;
            double nota4;
            double mf;
            
            aluno = jtfAluno.getText();
            disciplina = jtfDisciplina.getText();
            nota1 = Double.parseDouble(jtfNota1.getText());
            nota2 = Double.parseDouble(jtfNota2.getText());
            nota3 = Double.parseDouble(jtfNota3.getText());
            nota4 = Double.parseDouble(jtfNota4.getText());
            
            mf = (nota1 + nota2 + nota3 + nota4)/4;
            
            jlRMF.setText(Double.toString(mf));
            
            if (mf < 3) {
               JOptionPane.showMessageDialog(null,"Aluno retido !!!");
            } else {
               if (mf < 6) {
                   JOptionPane.showMessageDialog(null,"Aluno de recuperação !!!");
               } else {
                   JOptionPane.showMessageDialog(null,"Aluno aprovado !!!");
               }    
            }    
            
            
            
        }
    }
    
    private class EventoJLimpar implements ActionListener {        
        public void actionPerformed(ActionEvent ev) {            
            jtfAluno.setText("");
            jtfDisciplina.setText("");    
            jtfNota1.setText("");  
            jtfNota2.setText("");    
            jtfNota3.setText("");    
            jtfNota4.setText("");    
            jlRMF.setText("");    
            jtfAluno.requestFocus();
        }
    }
}
