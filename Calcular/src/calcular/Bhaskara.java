package calcular;

import java.util.Scanner;

public class Bhaskara {

    public double a, b, c;
    public double x1, x2;

    public static void main(String[] args) {
        //Todo codigo aqui
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um valor para A: ");
        double a = input.nextDouble();
        System.out.println("Digite um valor para B: ");
        double b = input.nextDouble();
        System.out.println("Digite um valor para C: ");
        double c = input.nextDouble();

        //Calcular
        double delta = b * b - 4 * a * c;
        double bhaskara = (-b + Math.sqrt(delta)) / (2 * a);
        double bhaskara1 = (-b - Math.sqrt(delta)) / (2 * a);

        if (delta < 0) {
            System.out.print("O valor de delta foi: " + delta + ",portanto,sendo este um valor negativo,sua equação não possui valores reais..");
        }
        if (delta == 0) {
            System.out.println("Seu delta é igual a zero,portanto possui apenas uma raiz possível: " + bhaskara + " " + bhaskara1);
        }
        if (delta > 0) {
            System.out.println("Seu delta é maior do que zero: " + delta + ",portanto possui duas raizes reais: " + bhaskara + " " + bhaskara1);
        }

    }
}
