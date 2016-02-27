
import java.awt.Graphics;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author workuhm
 */
public class DrawPanel extends JPanel{
    
    // draws an X from the corners of the panel
    public void paintComponent( Graphics g) {
        
        // call paintComponent to ensure the panel displays correctly
        super.paintComponent(g);
        
        int width  = getWidth();  // total width
        int height = getHeight(); // total height
        
        System.out.println("width: " + width);
        System.out.println("height: " + height);
        
        // draw a line from the upper-left to the lower-right
//        g.drawLine(width, 0, 0, height);
        
        // draw a line from the lower-left to the upper-right
//        g.drawLine(0, height, width, 0);

        // Exercise 4.1, pp 164-165
        for(int w=25; w < width-25; ){
            
            for(int h=(height-25); h > 25; ){
                
                g.drawLine(0, 0, w, h);
                
                h -= 25;
            }
            
            w += 25;
        }

//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= 10; j++) {
//                System.out.print((i * j) + " ");
//            }
//            System.out.println();
//        }
    }
    
}
