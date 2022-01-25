package Questao_6;

import Questao_6_Formulas.Equacao;
import java.util.Scanner;

public class Sistema {
   
    public void executar(){
        //aqui executa o programa
        
        Equacao calc = new Equacao();
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o valor de A: ");
        double a = input.nextDouble();
        System.out.println("Digite o valor de B: ");
        double b = input.nextDouble();
        System.out.println("Digite o valor de C: ");
        double c = input.nextDouble();
        System.out.println("Digite o valor de D: ");
        double d = input.nextDouble();
        System.out.println("Digite o valor de E: ");
        double e = input.nextDouble();
        
        calc.calcular();
        
        System.out.println("Valor de Result: " + calc.getResult());
    }
}
