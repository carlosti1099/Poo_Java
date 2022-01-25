package jogodavelha;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        // vamos instanciar o objeto
        Jogo jogo = new Jogo();
        String posicao;
        int valida = 0, Jogadas = 0;
        
        while(true){
            System.out.println("--- Joga da Velha ---");
            jogo.Mostrar();
            
            do{//inicia jogador 1.
                System.out.println("Jogador 1, informe uma posição: ");
                posicao = ler.next();
                while(!jogo.Valido(posicao)){
                    System.out.println("Jogada inválida, tente novamente!");
                    System.out.println("Jogador 1, informe uma posição: ");
                    posicao = ler.next();
                    valida = 0;
                }
                jogo.Jogada(posicao, "X");
                valida = 1;
                
            }while(valida == 0);//fim jogador 1
            
            Jogadas++;
            valida = 0;
            jogo.Mostrar();
            jogo.Jogada(posicao, "X");
            if(!jogo.Ganhou(Jogadas).equals("null")){
                break;
            }
            
             do{//inicia jogador 2.
                System.out.println("Jogador 2, informe uma posição: ");
                posicao = ler.next();
                while(!jogo.Valido(posicao)){
                    System.out.println("Jogada inválida, tente novamente!");
                    System.out.println("Jogador 2, informe uma posição: ");
                    posicao = ler.next();
                    valida = 0;
                }
                jogo.Jogada(posicao, "O");
                valida = 1;
                
            }while(valida == 0);//fim jogador 2
            
            Jogadas++;
            valida = 0;
            jogo.Mostrar();
            if(!jogo.Ganhou(Jogadas).equals("null")){
                break;
            }
        }//----Fim While-------------------------------
        
        System.out.println("O "+jogo.Ganhou(Jogadas)+" venceu!");       
    }
    
}
