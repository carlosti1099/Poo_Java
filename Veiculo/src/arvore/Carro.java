package arvore;

public class Carro {
// Atributos da classe carro
    private String marca;
    private String cor;
    private String modelo;
    private int velocidade;
    
    
    public Carro(String marca, String cor, String modelo, int velocidade) {
        this.marca = marca;
        this.cor = cor;
        this.modelo = modelo;
        this.velocidade = velocidade;
    }

    Carro() {
        
    }
    
// métodos da classe carro
    public void acelerar(){
        velocidade++;
    }
    
    public void frear(){
        velocidade--;
    }
    
    public String obterMarca(){
        return marca;
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

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }    

}
