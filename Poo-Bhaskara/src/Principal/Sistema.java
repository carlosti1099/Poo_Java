package Principal;

import Formulas.Bhaskara;

public class Sistema {

    public void executar() {
        //aqui executa o programa
        
        Bhaskara calc = new Bhaskara();
        
        calc.setA(1d);
        calc.setB(2d);
        calc.setC(-24d);
        calc.calcular();
        
        System.out.println("Valor de x1: " + calc.getX1());
        System.out.println("Valor de x2: " + calc.getX2());
        
    }
    
}
