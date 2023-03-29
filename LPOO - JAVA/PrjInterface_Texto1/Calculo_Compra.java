import java.util.Scanner;
public class Calculo_Compra
{
        public static void main(String args[] ){
        Scanner Entrada_Dados = new Scanner(System.in);
        
        //Comandos de entrada!
        String Cliente,Condicoes;
        double ValorCompra,Desconto_Acrescimo,ValorPagar; 
        
        //Entrada
        System.out.println("*** Cálculo de Valor a Pagar ***");
        System.out.print("Cliente: ");
        Cliente = Entrada_Dados.nextLine();
        System.out.print("Valor da Compra: ");
        ValorCompra = Entrada_Dados.nextDouble();
        System.out.print("À vista (V) ou a prazo (P): ");
        Condicoes = Entrada_Dados.next();
        System.out.print("% de Desconto/Acréscimo ");
        Desconto_Acrescimo = Entrada_Dados.nextDouble();
        
       //processamento
       
       Desconto_Acrescimo = ValorCompra * Desconto_Acrescimo/100;
       System.out.println ("Valor Desconto/Acréscimo...... R$" + Desconto_Acrescimo);
       
       if(Condicoes.equals ("V")){
          ValorPagar = ValorCompra - Desconto_Acrescimo;
        }else{
          ValorPagar = ValorCompra + Desconto_Acrescimo; 
        }
       System.out.println("Valor a Pagar.................R$" + ValorPagar);
        
    }
}
