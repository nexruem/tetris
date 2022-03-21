package tetris;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class GameArea extends JPanel {
    
    private int gridColumns;
    private int gridCellSize;
    private int gridRows;

    public GameArea(JPanel placeholder, int columns) {
        placeholder.setVisible(false);
        
        this.setBounds(placeholder.getBounds());
        this.setBackground(placeholder.getBackground());

        gridColumns = columns;
        gridCellSize = this.getWidth() / gridColumns;
        gridRows = this.getHeight() / gridCellSize;

        
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);        
        
        for (int y = 0; y < gridRows; y++) {
            for (int x = 0; x < gridColumns; x++) {
                g.setColor(Color.red);
                g.fillRect(x * gridCellSize, y * gridCellSize, gridCellSize, gridCellSize);
                g.setColor(Color.black);
                g.drawRect(x * gridCellSize, y * gridCellSize, gridCellSize, gridCellSize);
            }
        }
    }

}
