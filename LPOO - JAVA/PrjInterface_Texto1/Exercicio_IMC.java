import java.util.Scanner;
public class Exercicio_IMC
{
        public static void main(String args[] ){
        Scanner Entrada_Dados = new Scanner(System.in);
        String Paciente;
        double Peso;
        double Altura;
        double IMC;
        
        System.out.println("*** Cálculo de IMC ***");
        System.out.print("Paciente: ");
        Paciente = Entrada_Dados.nextLine();
        System.out.print("Peso: ");
        Peso = Entrada_Dados.nextDouble();
        System.out.print("Altura: ");
        Altura = Entrada_Dados.nextDouble();
        
        IMC = Peso/ (Altura * Altura);
        System.out.println("IMC........ " + IMC);
        
        if (IMC <= 18.5) {
          System.out.print("Abaixo do peso !!!");
        } else if (IMC < 25) {
            System.out.print("Peso ideal - Parabéns!!!");
        } else if (IMC < 30) {
           System.out.print("Levemente acima do peso !!!");
        } else if (IMC < 35) {
           System.out.print("Obesidade grau I !!!");
        } else if (IMC < 40) {
           System.out.print("Obesidade grau II(severa) !!!");
        } else if (IMC >=40) {
            System.out.print("Obesidade grau III (Mórbida) !!!");
        }
    }
}
