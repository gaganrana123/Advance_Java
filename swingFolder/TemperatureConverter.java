import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TemperatureConverter {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Celsius to Fahrenheit Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 100);
        
        // Set the layout
        frame.setLayout(new GridLayout(2, 2, 5, 5));
        
        // Create labels
        JLabel celsiusLabel = new JLabel("Celsius:");
        JLabel fahrenheitLabel = new JLabel("Fahrenheit:");
        
        // Create text fields
        JTextField celsiusField = new JTextField();
        JTextField fahrenheitField = new JTextField();
        fahrenheitField.setEditable(false);
        
        // Add key listener to the Celsius text field
        celsiusField.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                String celsiusText = celsiusField.getText();
                try {
                    double celsius = Double.parseDouble(celsiusText);
                    double fahrenheit = celsius * 9/5 + 32;
                    fahrenheitField.setText(String.format("%.2f", fahrenheit));
                } catch (NumberFormatException ex) {
                    fahrenheitField.setText("Invalid input");
                }
            }
        });
        
        // Add components to the frame
        frame.add(celsiusLabel);
        frame.add(celsiusField);
        frame.add(fahrenheitLabel);
        frame.add(fahrenheitField);
        
        // Set frame visibility
        frame.setVisible(true);
    }
}