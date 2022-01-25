
package aula_05_jogo2;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Fase extends JPanel {
    
    public Image fundo;

    public Fase() {
        
        setFocusable(true);
        setDoubleBuffered(true);
        
        ImageIcon referencia = new ImageIcon("res//Background//backgroundColor.png");
        fundo = referencia.getImage();
        
    }
    
    public void paint(Graphics g){
        
        Graphics2D grafico = (Graphics2D) g;
        grafico.drawImage(fundo, 0,0, this)
        
    }
    
    
}
