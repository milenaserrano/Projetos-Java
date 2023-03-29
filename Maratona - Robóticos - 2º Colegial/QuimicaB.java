import java.util.Scanner;
public class QuimicaB
{
        public static void main(String args[] ){
        Scanner Entrada_Dados1 = new Scanner(System.in);
        
        //Comandos de entrada!
       
        double sl ;  // sulfato de aluminio 
        double Mha ;  //massa em grama de hidroxido de aluminio        
        double slR ;
        double totalzao ;
        //Entrada       
        System.out.print("Sulfato de aluminio(g) : ");
        sl = Entrada_Dados1.nextDouble();
              
                
        slR= sl * 78;
        
        totalzao= slR / 342 ;
        
           
       System.out.println("Massa do hidróxido de alumínio : " + totalzao);
       
       
        
       
      
        
    }
}
