
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author workuhm
 */
public class DrawPanelTest {
    public static void main(String[] args) {
        
        // create a panel that contains our drawing
        DrawPanel panel = new DrawPanel();
        
        // create a new framw to hold the panel
        JFrame app = new JFrame();
        
        // set the frame to exit when it is closed
        app.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        
        app.add(panel); // add the panel to the frame
        app.setSize(250, 250); // set the size of the frame
        app.setVisible(true); // make the frame visible
        
        
    }
}
