import javax.swing.JFrame;
public class UsaJFrame {
    public static void main(String[]args){
    JFrame janela = new JFrame();
    janela.setVisible(true);
    janela.setTitle("JFrame");
    
    /*Tamanho da janela*/
    janela.setSize(350,150);
     
    /*Cooredenadas do ponto onde a janela começa a ser desenhada*/
    janela.setLocation (100,50);
    
    /*Define que quando a janela é fechada a aplicação também será*/
    janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
    
    