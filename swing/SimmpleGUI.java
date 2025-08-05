package swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class SimmpleGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple GUI");
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Name:");
        JTextField textField = new JTextField(20);
        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField(20);
        JButton button = new JButton("Submit");

        panel.add(label);
        panel.add(textField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(button);

        button.addActionListener(e -> {
            String name = textField.getText();
            String password = new String(passwordField.getPassword());
            if ("user".equals(name) && "pass".equals(password)) {
                JOptionPane.showMessageDialog(frame, "Login successful!");
            } else {
                JOptionPane.showMessageDialog(frame, "Invalid credentials.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}