package Questao_5;

public class Carro extends Veiculo {
    public String porta;
    public String aberta;
    public int marcha;

    //Construtor
    public Carro(String modelo, String marca, String cor, int velocidade, int posicao, int potencia) {
        super(modelo, marca, cor, velocidade, posicao, potencia);
    }
    
    public void abrirPorta() {
        porta = aberta;
    }

    public int getVelocidade() {
        return velocidade;
    }
    
    public void setVelocidade(int v){
       velocidade = 30;
    }
    
    
}


