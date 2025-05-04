//Chrystvil Wong-Wong M. Baculi

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class colors extends JFrame implements ActionListener {

    private JButton redButton, pinkButton, blueButton, yellowButton, purpleButton;

    public colors() {

        setTitle("Color Buttons");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(null);

        JPanel colorPanel = new JPanel();
        colorPanel.setPreferredSize(new Dimension(400, 150));
        colorPanel.setBackground(Color.LIGHT_GRAY); 
        add(colorPanel, BorderLayout.CENTER);


        redButton = new JButton("Red");
        pinkButton = new JButton("Pink");
        blueButton = new JButton("Blue");
        yellowButton = new JButton("Yellow");
        purpleButton = new JButton("Purple");

        redButton.addActionListener(this);
        pinkButton.addActionListener(this);
        blueButton.addActionListener(this);
        yellowButton.addActionListener(this);
        purpleButton.addActionListener(this);

        redButton.setBounds(10, 10, 150, 200);
        pinkButton.setBounds(390, 10, 150, 200);      
        blueButton.setBounds(200, 150, 150, 200 );     
        yellowButton.setBounds(10, 320, 150, 200);   
        purpleButton.setBounds(380, 320, 150, 200);

        add(redButton);  
        add(pinkButton);
        add(blueButton);
        add(yellowButton);
        add(purpleButton);
     
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton source = (JButton) e.getSource();

        if (source == redButton) {
            toggleColor(redButton, Color.RED);
        } else if (source == pinkButton) {
            toggleColor(pinkButton, Color.PINK);
        } else if (source == blueButton) {
            toggleColor(blueButton, Color.BLUE);
        } else if (source == yellowButton) {
            toggleColor(yellowButton, Color.YELLOW);
        } else if (source == purpleButton) {
            toggleColor(purpleButton, new Color(128, 0, 128)); 
        }
    }

    private void toggleColor(JButton button, Color color) {
        if (color.equals(button.getBackground())) {
            button.setBackground(null); 
        } else {
            button.setBackground(color); 
        }
    }
    

    public static void main(String[] args) {
        new colors();
    }
}

