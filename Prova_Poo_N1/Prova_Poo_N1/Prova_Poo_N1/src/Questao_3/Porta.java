package Questao_3;

public class Porta {
    private String cor;
    private int altura;
    private int largura;
    private int espessura;
    private boolean aberta;

    public Porta(String cor, int altura, int largura, int espessura, boolean aberta) {
        this.cor = cor;
        this.altura = altura;
        this.largura = largura;
        this.espessura = espessura;
        this.aberta = aberta;
    }
    
    public void pintarPorta(String cor){
        this.cor = cor;
    }
    
    public void abrirPorta(){
        this.aberta = true;
    }
    
    public void fecharPorta(){
        this.aberta = false;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getEspessura() {
        return espessura;
    }

    public void setEspessura(int espessura) {
        this.espessura = espessura;
    }

}

