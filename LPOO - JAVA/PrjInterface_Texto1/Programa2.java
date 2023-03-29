
import java.util.Scanner;
public class Programa2 {
   public static void main(String args[]){
       //Seriam as variáveis
       
       Scanner SomarNumeros = new Scanner(System.in);
       String nome;
       float valor1;
       float valor2;
       float valor3;
       float valor4;
       float soma;
       
       //Seriam os escrevas:
       
       System.out.print("Informe o nome do aluno: ");
       nome = SomarNumeros.nextLine();
       System.out.print("Digite o primeiro valor: ");
       valor1 = SomarNumeros.nextFloat();
       System.out.print("Digite o segundo valor: ");
       valor2 = SomarNumeros.nextFloat();
       System.out.print("Digite o terceiro valor: ");
       valor3 = SomarNumeros.nextFloat();
       System.out.print("Digite o quarto valor: ");
       valor4 = SomarNumeros.nextFloat();
       soma = valor1 + valor2 + valor3 + valor4;
       System.out.print("O resultado da soma é: " + soma );
    }
}
