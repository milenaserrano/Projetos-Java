 import javax.swing.JOptionPane;
    public class UsaJOPshowInputDialog {
        public static void main (String[] args) {
            String nome= 
            JOptionPane.showInputDialog ("Escreva o seu nome: ");
            System.out.println ("O nome inserido foi: " + nome);
        }
    }