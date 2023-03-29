import java.util.Scanner;
public class exercicio2_B
{
 public static void main(String args[]){
       
       Scanner Entrada = new Scanner(System.in);
       String nome;
       String Disciplina;
       float B1;
       float B2;
       float B3;
       float B4;
       float MediaFinal;
       float Resultado;
      
       System.out.println("Cálculo de Média Final");
       System.out.print("Informe o nome do Aluno: ");
       nome = Entrada.nextLine();
       System.out.print("Digite a Disciplina: ");
       Disciplina = Entrada.nextLine();
       System.out.print("1 Bimestre: ");
       B1 = Entrada.nextFloat();
       System.out.print("2 Bimestre: ");
       B2 = Entrada.nextFloat();
       System.out.print("3 Bimestre: ");
       B3 = Entrada.nextFloat();
       System.out.print("4 Bimestre: ");
       B4 = Entrada.nextFloat();
       
       MediaFinal=B1+B2+B3+B4;
       Resultado=MediaFinal/4;
      System.out.println("Média Final: " +Resultado );
      
     if (Resultado >=6) {
         System.out.print("Aluno Aprovado!!! " );
        } else {
          System.out.print("Aluno Não Aprovado!!!" );
        }
   }  
}
