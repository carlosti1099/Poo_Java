package vetor;

import java.util.Scanner;

public class Vetor {

    public static void main(String[] args ){
    
        // vetor sempre tem o indice iniciado em zero
        int[] v = new int[100]; //vetor de 10 posicoes

        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {

            System.out.println("Digite um numero para posicao " + i + ":");
            v[i] = teclado.nextInt();
        }
        
        //para manipular vetor sempre usamos for
        for(int i=0; i<10; i++){
            System.out.println(v[i]);
        }
    }

}
