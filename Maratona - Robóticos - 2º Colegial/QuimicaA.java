import java.util.Scanner;
public class QuimicaA
{
        public static void main(String args[] ){
        Scanner Entrada_Dados1 = new Scanner(System.in);
        
        //Comandos de entrada!
        
        double Nmr ; 
        double Nmr2 ; 
        double Nmp ;
        double Nmp2 ;
        double Calc; 
        
        //Entrada
        System.out.println("*** Balanceamento químico ***");
        System.out.print("Número de mols no reagente A: ");
        Nmr = Entrada_Dados1.nextDouble();
        System.out.print("Número de mols no reagente B: ");
        Nmr2 = Entrada_Dados1.nextDouble();
      
        
       //processamento
       
       if (Nmr >= 1 && Nmr<6) {
         Nmp = Nmr * 2;
        } else {
         Nmp = Nmr /2;
        }
        
       if (Nmr2 >= 1 && Nmr2 < 6) {
         Nmp2 = Nmr2 * 2;
        } else {
         Nmp2 = Nmr2 /2;
        }
         
       System.out.println("Número de mols no produto: " + Nmp);
       System.out.println("Número de mols no produto: " + Nmp2);
       
        
       
      
        
    }
}
