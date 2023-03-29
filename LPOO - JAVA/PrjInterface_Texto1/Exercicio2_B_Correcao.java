import java.util.Scanner;
public class Exercicio2_B_Correcao {
    public static void main(String args[] ){
        Scanner Entrada_Dados = new Scanner(System.in);
        String aluno;
        String disciplina;
        float b1;
        float b2;
        float b3;
        float b4;
        float mf;
        System.out.println("*** Cálculo de Média Final ***");
        System.out.print("Aluno: ");
        aluno = Entrada_Dados.nextLine();
        System.out.print("Disciplina: ");
        disciplina = Entrada_Dados.nextLine();
        System.out.print("1º Bimestre: ");
        b1 = Entrada_Dados.nextFloat();
        System.out.print("2º Bimestre: ");
        b2 = Entrada_Dados.nextFloat();
        System.out.print("3º Bimestre: ");
        b3 = Entrada_Dados.nextFloat();
        System.out.print("4º Bimestre: ");
        b4 = Entrada_Dados.nextFloat();
        mf = (b1 + b2 + b3 + b4) /4;
        System.out.println("A média final é: " + mf);
        //if (mf >= 6) {
        //    System.out.print("Aluno aprovado !!!");
        //} 
        //if (mf >=3 && mf < 6) {
        //    System.out.print("Aluno de recuperação !!!");
        //}     
        //if (mf < 3) {
        //    System.out.print("Aluno retido !!!");
        //}
        //if (mf < 3) {
        //    System.out.print("Aluno retido !!!");
        //} else if (mf < 6) {
        //    System.out.print("Aluno de recuperação !!!");
        //} else {
        //    System.out.print("Aluno aprovado !!!");
        //}    
        if (mf < 3) {
            System.out.print("Aluno retido !!!");
        } else {
            if (mf < 6) {
                System.out.print("Aluno de recuperação !!!");
            } else {
                System.out.print("Aluno aprovado !!!");
            }    
        }    
    }
}
