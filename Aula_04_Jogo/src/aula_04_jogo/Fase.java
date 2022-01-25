package aula_04_jogo;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class Fase extends Jpanel {
    public Image fundo;
    
    public Fase(){
        
        //fazer o load da imagem
        ImageIcon imagen = new ImageIcon(".//res/fundo.jpg"); // leu o arquivo
        fundo = imagen.getImage(); // carreguei a imagem para o fundo
    }
    
    //esse metodo nao pode ter outro nome
    public void paint(Graphics ambienteGrafico){
        
        //precisamos pegar a parte 2d
        Graphics2D ambiente = (Graphics2D) ambienteGrafico;
        ambiente.drawImage(fundo,0,0,this);
        ambienteGrafico.dispose();
    }
}
