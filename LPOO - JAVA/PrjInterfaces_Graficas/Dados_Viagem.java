import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
public class Dados_Viagem extends JFrame {
        //declaração
        JFrame janela1= new JFrame ("quilometragem percorrida");
        JFrame janela2= new JFrame ("velocidade total");
        JFrame janela3= new JFrame ("média de consumo");
        JFrame janela4= new JFrame ("Consumo excessivo!");
        JFrame janela5= new JFrame ("Alto consumo");
        JFrame janela6= new JFrame ("Cosumo moderado");
        JFrame janela7= new JFrame ("veículo econômico");
        JFrame janela8= new JFrame ("Veiculo muito econômico");
        JLabel traj = new JLabel ("trajeto"); //trajeto
        JTextField trajE = new JTextField(5);
        JLabel kmi = new JLabel ("km inicial");  // km inicial
        JTextField kmiE = new JTextField(5);
        JLabel kmf = new JLabel ("km final"); //km final
        JTextField kmfE = new JTextField(5);
        JLabel nc = new JLabel ("quantidade de combustivel");  // numero combustivel
        JTextField ncE = new JTextField(5);
        JLabel vc = new JLabel ("valor combustível");  // valor combustível
        JTextField vcE = new JTextField(5);
        JButton calc = new JButton("calcular");
        JButton limp = new JButton("limpar");
        JLabel Result = new JLabel (" ");
        JPanel painel= new JPanel ();
        //interface
        private Dados_Viagem() {
         setTitle("calculo de viajem");
         setSize(500,250);
         setLocation(50,50);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setLayout(new GridLayout(6,2));
         setVisible(true);
           
         add(traj);
         add(trajE);
         add(kmi);
         add(kmiE);
         add(kmf);
         add(kmfE);
         add(nc);
         add(ncE);
         add(vc);
         add(vcE);
         add(calc);
         add(limp);
         
        calc.addActionListener(new Eventocalc());
        limp.addActionListener(new Eventolimp());

        
 
    }
    public static void main (String[] args) {
        new Dados_Viagem();
    }
    
    //eventos
    private class Eventocalc implements ActionListener {
        
        public void actionPerformed(ActionEvent ev) {
            
            double kmp = 0;           //km percorrida
            String kmpS = "";
            double vt = 0;                // velocidade total
            String vtS = "";
            double mc = 0;                // média de consumo
            String mcS = "";
            
            
            kmp = Double.parseDouble(kmfE.getText())
            - Double.parseDouble(kmiE.getText());
            /////////////////////////////////////////////////
            kmpS = Double.toString(kmp);
            
           JOptionPane.showMessageDialog(janela1,"quilometragem percorrida:  " + (kmpS));
            
            vt = Double.parseDouble(ncE.getText())
            * Double.parseDouble(vcE.getText());
            
            vtS = Double.toString(vt);
            
           JOptionPane.showMessageDialog(janela2,"Valor Total:  " + (vtS));
            
            
            mc = kmp /
            Double.parseDouble(ncE.getText());
            
            mcS = Double.toString(mc);
            
            JOptionPane.showMessageDialog(janela3,"média de consumo:  " +  (mcS));
           
            
           if (mc <= 5 ) {
               JOptionPane.showMessageDialog(janela4,"Consumo Excessivo!");
            }
            else if (mc <= 8 ) {
               JOptionPane.showMessageDialog(janela5,"Alto Consumo!");
            }
            else if (mc <= 12 ) {
               JOptionPane.showMessageDialog(janela5,"Consumo Moderado!");
            }
            else if (mc <= 14 ) {
               JOptionPane.showMessageDialog(janela5,"Veículo Econômico!");
            }
            else  {
               JOptionPane.showMessageDialog(janela5,"Veículo muito econômico!");
           }
        }
    }
       private class Eventolimp implements ActionListener {
        public void actionPerformed(ActionEvent ev) {
            trajE.setText("");
            kmiE.setText("");
            kmfE.setText("");
            ncE.setText("");
            vcE.setText("");
            trajE.requestFocus();
            Result.setText("");
            
 
        
        }
    }
}
   
        
    
    
        


        

        
     
   