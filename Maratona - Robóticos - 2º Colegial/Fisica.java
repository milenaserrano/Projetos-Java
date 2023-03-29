import java.util.Scanner;
public class Fisica {
    public static void main(String args[] ){
        Scanner Entrada_Dados = new Scanner(System.in);
        
  
        double Vhor, AngLanca, D_Cast, g;
        System.out.println(" **** Angulo de Lançamento e a velocidade horizontal ****");
        //Entrada
        System.out.println("Velocidade Horizontal: ");
        Vhor = Entrada_Dados.nextDouble();
        System.out.println("Angulo de Lançamento: ");
        AngLanca = Entrada_Dados.nextDouble();
        System.out.println("Distância do Castelo: ");
        D_Cast = Entrada_Dados.nextDouble();
     
        D_Cast = Vhor * 2 * 0.91 / 10;
        
         if (Vhor <= 10){
            System.out.print("");
        }
        if (AngLanca <= 45){
            System.out.print ("");
        }
        if (D_Cast <= 10){
            System.out.print ("Atingiu o Alvo");   
        }
        else if (Vhor<= 10){
            System.out.print("");
        }
        if (AngLanca <= 45){
            System.out.print ("");
        }
        if (D_Cast >= 30){
            System.out.print ("Não Atingiu o Alvo");
       }
  }
}
