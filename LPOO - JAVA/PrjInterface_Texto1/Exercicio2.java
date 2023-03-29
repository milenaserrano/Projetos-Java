import java.util.Scanner;
public class Exercicio2 {
   public static void main(String args[]){
       
       Scanner CalculoDeValorAPagar = new Scanner(System.in);
       String nome;
       float Compra;
       float Desconto;
       float Pagar;
      
       System.out.println("Cálculo de Valor a Pagar ");
       System.out.print("Informe o nome do Cliente: ");
       nome = CalculoDeValorAPagar.nextLine();
       System.out.print("Digite o Valor Total da Compra: ");
       Compra = CalculoDeValorAPagar.nextFloat();
       System.out.print("Digite o Valor do Desconto: ");
       Desconto = CalculoDeValorAPagar.nextFloat();
       Pagar = Compra-Desconto;
      System.out.print("Valor a Pagar: " +Pagar );
           }
}
