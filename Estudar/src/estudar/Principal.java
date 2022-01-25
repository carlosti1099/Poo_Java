
package estudar;

public class Principal {
    
    public static void main(String[] args){
        
        // instacia o objeto livro
        Livro livro = new Livro();
        
        //colocando valores no objeto livro
        livro.nome = "EngenheiroNet";
        livro.descricao = "Livro sobre Poo";
        livro.isbn = "9876543210";
        livro.preco = 61.99;
        livro.dataPub = "03/04/2021";
        
        System.out.printf("A data de publicação do livro %s é %s", livro.nome, livro.dataPub);
        
    }
            
    
}
