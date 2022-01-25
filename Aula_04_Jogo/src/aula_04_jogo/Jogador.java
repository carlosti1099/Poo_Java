package aula_04_jogo;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Jogador {
    
    public Image imagem;
    public Integer x; // coordenada coluna da tela
    public Integer y; // coordenada da linha da tela
    public Integer altura;
    public Integer largura;

    public Jogador() {
        
        carregar();
        x = 100;
        //y = 500; // em ver de chutar vamos calcular
        y = 600 - altura - 50;
        
        
    }
    
    public void carregar(){
        ImageIcon imagem = new ImageIcon("c:\\imagebs\\");
    }
    
    
}
