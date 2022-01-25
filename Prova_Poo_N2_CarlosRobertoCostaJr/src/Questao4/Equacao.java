//pronta
package Questao4;

import java.util.Scanner;

//x = a * b / c
public class Equacao {

    //Atributos
    public double a, b, c;
    public double x;

    //Metodos
    public void executar() {
        //aqui executa o programa
        
        double x = receberDouble("Digite um numero: ");
    }

    public double receberDouble(String mensagem) {

        while (true) {//faca para sempre
            try { //Tratamento erros
                Scanner input = new Scanner(System.in);
                System.out.println("Digite o valor de A: ");
                double a = input.nextDouble();
                System.out.println("Digite o valor de B: ");
                double b = input.nextDouble();
                System.out.println("Digite o valor de C: ");
                double c = input.nextDouble();

                double x = (a * b) / c;

                System.out.println("\nA resolução será: " + x + "");
                return x;

            } catch (Exception ex) {
                //Mensagem quando der erro no programa
                System.out.println("\nValor digitado inválido - Tente novamente");
            }
        }
    }
}
