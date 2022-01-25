package bola;

public class Main {
    
    public static void main(String[] args){
    Bola modelo1 = new Bola("Topper", "Azul", "Plastico",(float) 0.5, (float) 1.5, (float) 3.0);
    Bola modelo2 = new Bola("Nike", "Branca", "Plastico", (float) 0.6, (float) 1.4, (float) 3.1);
    
        System.out.println("Nome da Bola 1: "+modelo1.marca+", Cor: "+modelo1.cor+", Material: "+modelo1.material);
        System.out.println("Noma da Bola 2: "+modelo2.marca+", Cor: "+modelo2.cor+", Area: "+modelo2.area); 
    }
    
}