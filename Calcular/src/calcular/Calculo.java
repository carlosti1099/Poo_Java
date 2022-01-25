package calcular;

import java.util.Scanner;

public class Calculo {
    
    public double a, b, c;
    public double x;
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o valor de A: ");
        double a = input.nextDouble();
        System.out.println("Digite o valor de B: ");
        double b = input.nextDouble();
        System.out.println("Digite o valor de C: ");
        double c = input.nextDouble();
        
        double x = (a * b + c)/3;
        
        System.out.println("A resolução será: " + x +"");
    }
    
}
