package Questao_5;

public class Moto extends Veiculo {
    private int rodas;
    private boolean farol;
    private int ano;

    //Construtor
    public Moto(String modelo, String marca, String cor, int velocidade, int posicao, int potencia) {
        super(modelo, marca, cor, velocidade, posicao, potencia);
    }
    
    //Metodos
    public void acenderFarol(){
        this.farol = true;
    }
    
    public void desligarFarol(){
        this.farol = false;
    }

    public int getRodas() {
        return rodas;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}