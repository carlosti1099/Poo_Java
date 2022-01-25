package Principal;

import Formulas.Delta;

public class Sistema {

    public void executar() {
        //aqui executa o programa
        
        Delta calc = new Delta();
        
        calc.setA(1d);
        calc.setB(2d);
        calc.setC(-24d);
        calc.calcular();
        
        System.out.println("Valor de Delta: " + calc.deltaa());
        
        
    }
    
}
