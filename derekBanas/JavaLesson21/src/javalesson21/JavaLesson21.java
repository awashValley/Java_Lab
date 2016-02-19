/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalesson21;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author workuhm
 */

// extends JFrame so it can create frames
public class JavaLesson21 extends JFrame {
    
    JButton button1;
    JTextField textField1;
    JTextArea textArea1;
    int btnClicked;
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        new JavaLesson21();
    }
    
    // constructor
    public JavaLesson21(){
        this.setSize(400, 400);
        
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();
        
        int xPos = (dim.width / 2) - (this.getWidth() / 2);
        int yPos = (dim.height / 2) - (this.getHeight() / 2);
        
        this.setLocation(xPos, yPos);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.setTitle("My Second Frame");
        
        JPanel thePanel = new JPanel();
        
        // define the listener
        ListenForButton lForButton = new ListenForButton();
        
        button1.addActionListener(lForButton);
        
        
        thePanel.add(button1);
        
        textField1 = new JTextField("", 15);
        
        ListenForKeys lForKeys = new ListenForKeys();
        
        textField1.addKeyListener(lForKeys);
        
        thePanel.add(textField1);
        
        textArea1 = new JTextArea(15, 20);
        
        textArea1.setText("");
        
        
        
    }

    // implement listeners
    private class ListenForButton implements ActionListener{

        public void actionPerformed(ActionEvent e){
            
            if(e.getSource() == button1){
                btnClicked ++;
                
                textArea1.append("Button clicked" + btnClicked + " times\n");
            }
        }
    }
    
    private class ListenForKeys implements KeyListener{

        

        

       
    }
    
}
