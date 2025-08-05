package swing;

import javax.swing.*;
import java.awt.GridLayout;

public class Calculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize( 400, 400);

        frame.setLayout(new GridLayout(2, 2));  

        JLabel label = new JLabel("Number 1");
        JLabel label2 = new JLabel("Number 2");
        JTextField textField1 = new JTextField(10);
        JTextField textField2 = new JTextField(10);
        JButton addButton = new JButton("Add");
        addButton.addActionListener(e ->{

        });
        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(label2);

        frame.add(panel);
        frame.setVisible(true);
        frame.add(textField1);
        frame.add(textField2);
    }
}
