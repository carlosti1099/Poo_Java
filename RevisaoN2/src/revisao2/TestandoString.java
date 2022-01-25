package revisao2;

public class TestandoString {
    
    public void testar(){
        
        String var = "Qualquer texto";
        System.out.println("Tamanho:" + var.length());
        
        String outra = "mais outra coisa";
        System.out.println("Soma: " + var + outra);
        
        for(int i = 0; i< var.length(); i++){
            System.out.println(var.charAt(i)+"-");
        }
        
        System.out.println("");
        System.out.println("Substring:"+ var.substring(9,13));
        System.out.println("Comparacao:");
        System.out.println(var.equals("algo"));
    }
    
}

