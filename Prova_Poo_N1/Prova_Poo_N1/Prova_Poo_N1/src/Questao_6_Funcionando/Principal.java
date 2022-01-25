package Questao_6_Funcionando;

import java.util.Scanner;

public class Principal {
    public Double a, b, c, d, e;
    public Double result;
    
    public static void main(String[] args){
        
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
        
        Double result = Math.pow((a + b * c / d), (2 * e));
        
        System.out.println("Valor de Result: " + result +"");
    }
}
