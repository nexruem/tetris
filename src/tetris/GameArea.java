package tetris;

import java.awt.Graphics;
import javax.swing.JPanel;

public class GameArea extends JPanel {

    public GameArea(JPanel placeholder, int columns) {
        placeholder.setVisible(false);
        
        this.setBounds(placeholder.getBounds());
        this.setBackground(placeholder.getBackground());

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);        

    }
   

}
