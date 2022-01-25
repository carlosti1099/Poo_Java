package carro;

public class Main {
    
    public static void main(String[] args){
        Carro gol = new Carro();
        Carro gol2 = new Carro();
        gol.marca = "Volksvagem";
        gol.modelo = "Gol G5";
        gol.numPassageiros = 5;
        gol.capCombustivel = 50;
        gol.consumoCombustivel = 11;
        
        System.out.println("A volksvagem é proprietária do "+gol.modelo+" que suporte até "+gol.numPassageiros+" pessoas");
        System.out.println("O tanque combustivel "+gol.modelo+" tem "+gol.capCombustivel+" litros");
        
    }
}
