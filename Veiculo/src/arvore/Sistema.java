package arvore;

public class Sistema {
    
    public static void main(String[] args){
        Carro car = new Carro();
        
        car.acelerar();
        car.frear();
        car.obterMarca();
        
        
        System.out.println("Velocidade Atual: " + car.getVelocidade());
        
    }
    
}
