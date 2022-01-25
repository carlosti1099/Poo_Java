
package Questao7;

public class Bart {
    
    
    public void repetir(){
               
        String var = "Prova Poo - Carlos Roberto da Costa Junior";
        System.out.println("\nString: " + var);
        System.out.println("\nTamanho String: " + var.length() + "\n");
        
        for(int i=0; i<1000; i++){
            System.out.println("Imprimindo String: " + "["+ i +"]" + var);
        }
        
    }
    
}
