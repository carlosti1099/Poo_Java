package Questao_5;

public class Veiculo {
    // Atributos da classe
    private String modelo;
    private String marca;
    private String cor;
    public int velocidade;
    private int posicao;
    private int potencia;

    public Veiculo(String modelo, String marca, String cor, int velocidade, int posicao, int potencia) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.velocidade = velocidade;
        this.posicao = posicao;
        this.potencia = potencia;
    }

    // métodos da classe carro
    public void Acelerar(){
        velocidade += potencia;
    }
    
    public void frear(){
        velocidade = velocidade / 2;
    }
    
    public void immprimir(){
        System.out.println("O carro "+modelo+ " está na velocidade de ");
    }
    
    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }
    
}
