import java.util.Scanner;
public class Matematica
{
        public static void main(String args[] ){
        Scanner Entrada_Dados = new Scanner(System.in);
        
        //Comandos de entrada!
        String Grafica;
        double Pb ;  
        double Ck ;
        double Ckx ;
        double Ga ;
        double Gb ;
        double Gc ;
        
        //Entrada
        System.out.println("*** qual gráfica apresentam menor custo ***");
        System.out.print("X: ");
        Pb = Entrada_Dados.nextDouble();
        System.out.print("Y: ");
        Ck = Entrada_Dados.nextDouble();
        System.out.print("Z: ");
        Ckx = Entrada_Dados.nextDouble();
        
       //processamento
       
       Ga= (2*Pb) + (3*Ck) + (4*Ckx);
       Gb= (3*Pb) + (3*Ck) + (4*Ckx);
       Gc= (1*Pb) + (2*Ck) + (6*Ckx);
       
       
       
       
       if(Ga<Gb && Ga<Gc) {
         System.out.println("Gráfica A!!!");
        }
        
       if (Gb<Ga && Gb<Gc){
          System.out.println("Gráfica B!!!"); 
       }
       
        if (Gc<Ga && Gc<Gb){
          System.out.println("Gráfica C!!!"); 
       }
       
      
        
    }
}
