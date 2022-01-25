package tabuada;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TabuadaString {

    //public static void main(String[] args) throws IOException {
    public TabuadaString() throws IOException{
        Scanner ler = new Scanner(System.in);
        int i, n;

        System.out.printf("Informe o número para a tabuada:\n");
        n = ler.nextInt();
        
        //Atencao em mudar o caminho para gravar
        FileWriter arq = new FileWriter("e:\\tabuada.txt");
        PrintWriter gravarArq = new PrintWriter(arq);

        gravarArq.printf("+--Resultado--+%n");
        for (i = 1; i <= 10; i++) {
            gravarArq.printf("| %2d X %d = %2d |%n", i, n, (i * n));
        }
        gravarArq.printf("+-------------+%n");

        arq.close();

        System.out.printf("\nTabuada do %d foi gravada com sucesso em \"e:\\tabuada.txt\".\n", n);
    }

}
