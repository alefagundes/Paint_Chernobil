package entities;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

public class PainelPintura extends JPanel{
    Integer n = 0;
    Integer tamanho = 10;
    Color corAtual = Color.BLUE;
    MouseAdapter mouse = new MouseAdapter() {
        @Override
        public void mouseMoved(MouseEvent me) {
            super.mouseMoved(me);
            
        }

        @Override
        public void mouseDragged(MouseEvent me) {
            super.mouseDragged(me);
            System.out.println("X: " + me.getX() + " Y: " + me.getY());
            Graphics2D g = (Graphics2D) getGraphics();
            g.setColor(corAtual);
            g.fillOval(me.getX() - tamanho / 2, me.getY() - tamanho / 2, tamanho, tamanho);
        }                
        
    };

    public void setCorAtual(Color novaCor) {
        this.corAtual = novaCor;
    }

    public void setTamanho(Integer novoTamanho) {
        this.tamanho = novoTamanho;
    }

    public Integer getTamanho() {
        return tamanho;
    }
    
    
    
    
    public void configurarPainel(){
        setBackground(Color.WHITE);
        addMouseMotionListener(mouse);
    }

}
