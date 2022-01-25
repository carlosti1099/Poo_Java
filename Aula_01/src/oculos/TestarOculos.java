package oculos;

public class TestarOculos {
    public static void main(String[] args){
        Oculos a1 = new Oculos();
        Oculos a2 = new Oculos();
        a1.escolherProduto("verao", "raiban","preto");
        a2.escolherProduto("inverno", "mormai", "branca");
        a1.exibirInformacao();
        a2.exibirInformacao();
    }
}
