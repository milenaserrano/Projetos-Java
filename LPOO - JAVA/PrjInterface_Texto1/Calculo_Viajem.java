
import java.util.Scanner;
public class Calculo_Viajem
{
        public static void main(String args[] ){
        Scanner Entrada_Dados = new Scanner(System.in);
        
        //Comandos de entrada!
        String Trajeto;
        double KmInicial;
        double KmFinal;
        double QntCombustivel;
        double ValorLitro;
        
       // Comando de saída
        double KmPercorrido;
        double ValorGasto;
        double MediaConsumo;
        
        System.out.println("*** Cálculo Informações Viajem ***");
        System.out.print("Trajeto: ");
        Trajeto = Entrada_Dados.nextLine();
        System.out.print("Km Inicial: ");
        KmInicial = Entrada_Dados.nextDouble();
        System.out.print("KmFinal: ");
        KmFinal = Entrada_Dados.nextDouble();
        System.out.print("Quantidade de Combustível: ");
        QntCombustivel = Entrada_Dados.nextDouble();
        System.out.print("Valor Litro: ");
        ValorLitro = Entrada_Dados.nextDouble();
        
        KmPercorrido = KmFinal - KmInicial;
        System.out.println("Km Percorrido........ " + KmPercorrido);

        ValorGasto = QntCombustivel * ValorLitro;
        System.out.println("Valor Gasto........ " + ValorGasto);
        
        MediaConsumo = KmPercorrido / QntCombustivel;
        System.out.println("Média de Consumo (Km/Lt)........ " + MediaConsumo);
        

        if (MediaConsumo <=5) {
          System.out.print("Consumo Excessivo!");
        } else if (MediaConsumo  <=8) {
            System.out.print("Alto Consumo");
        } else if (MediaConsumo <=12) {
           System.out.print("Consumo Moderado");
        } else if (MediaConsumo <= 14) {
           System.out.print("Veículo Econômico");
        } else {
           System.out.print("Veículo Muitíssimo Economico");
    }
}
}




























private class EventoJMensagem implements ActionListener {        
        public void actionPerformed(ActionEvent ev) {            
      if (jbMediaConsumo <= 5 ) {
      System.out.print("Consumo Excessivo!");
    } else if (jlResultado_Calc  <=8) {
         System.out.print("Alto Consumo");
     } else if (jlResultado_Calc <=12) {
         System.out.print("Consumo Moderado");
    } else if (jlResultado_Calc <= 14) {
       System.out.print("Veículo Econômico");
     } else {
       System.out.print("Veículo Muitíssimo Economico");

        }
 