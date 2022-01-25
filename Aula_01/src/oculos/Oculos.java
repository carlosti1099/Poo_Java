
package oculos;

public class Oculos {
    String marca;
    String modelo;
    String cor;
    boolean oculosDeGrau;
    
    public void escolherProduto(String model, String m, String tipoCor){
        modelo =  model;
        marca = m;
        cor = tipoCor;
    }
    
    public void exibirInformacao(){
        System.out.println(modelo +""+ marca +""+ cor);
    }


}
