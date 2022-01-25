package metodos_parametros;

public class MandaMensagem {
    
    public void enviaMensagem(){
        System.out.println("Bem vindo a EngenheiroNet ");
    }
    
    public void mandaBoasVindas(String nome, int idade){
        
        System.out.printf("Olá, %s, voce tem %d anos de idade", nome, idade);
    }
}
