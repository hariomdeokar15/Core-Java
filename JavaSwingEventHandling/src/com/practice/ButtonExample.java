package com.practice;
import javax.swing.*;
import java.awt.event.*;

public class ButtonExample {
    public static void main(String[] args) {
        // Create a frame (window)
        JFrame frame = new JFrame("Anonymous Class Example");
        
        // Create a button
        JButton button = new JButton("Click Me");
        button.setBounds(100, 100, 120, 40);
        
        // Add ActionListener using Anonymous Class
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Action when button is clicked
                JOptionPane.showMessageDialog(frame, "Button Clicked!");
            }
        });
        
        // Add button to frame
        frame.add(button);
        
        // Frame settings
        frame.setSize(350, 250);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
