package practice3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegistrationForm {
    public static void main(String[] args) {
        // Create the main window
        JFrame frame = new JFrame("Registration Form");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Create a panel to hold form components
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(10, 2, 10, 10)); // rows, cols, hgap, vgap
        frame.add(panel, BorderLayout.CENTER);

        // Label + Text Field for Name
        panel.add(new JLabel("Full Name:"));
        JTextField nameField = new JTextField();
        panel.add(nameField);

        // Label + Password Field
        panel.add(new JLabel("Password:"));
        JPasswordField passwordField = new JPasswordField();
        panel.add(passwordField);

        // Label + TextArea for Address
        panel.add(new JLabel("Address:"));
        JTextArea addressArea = new JTextArea(3, 20);
        addressArea.setLineWrap(true);
        panel.add(new JScrollPane(addressArea)); // Scrollable

        // Label + Radio Buttons for Gender
        panel.add(new JLabel("Gender:"));
        JPanel genderPanel = new JPanel();
        ButtonGroup genderGroup = new ButtonGroup();
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        JRadioButton other = new JRadioButton("Other");
        genderGroup.add(male);
        genderGroup.add(female);
        genderGroup.add(other);
        genderPanel.add(male);
        genderPanel.add(female);
        genderPanel.add(other);
        panel.add(genderPanel);

        // Label + CheckBoxes for Interests
        panel.add(new JLabel("Interests:"));
        JPanel interestPanel = new JPanel();
        JCheckBox music = new JCheckBox("Music");
        JCheckBox sports = new JCheckBox("Sports");
        JCheckBox travel = new JCheckBox("Travel");
        interestPanel.add(music);
        interestPanel.add(sports);
        interestPanel.add(travel);
        panel.add(interestPanel);

        // Label + ComboBox for Country selection
        panel.add(new JLabel("Country:"));
        String[] countries = {"Nepal", "India", "USA", "UK", "Other"};
        JComboBox<String> countryBox = new JComboBox<>(countries);
        panel.add(countryBox);

        // Submit button
        JButton submitBtn = new JButton("Submit");
        panel.add(submitBtn);

        // Empty cell to align button properly
        panel.add(new JLabel(""));

        // Action when submit button is clicked
        submitBtn.addActionListener(e -> {
            // Get field values
            String name = nameField.getText();
            String password = new String(passwordField.getPassword());
            String address = addressArea.getText();
            String gender = male.isSelected() ? "Male" :
                            female.isSelected() ? "Female" :
                            other.isSelected() ? "Other" : "Not Selected";

            StringBuilder interests = new StringBuilder();
            if (music.isSelected()) interests.append("Music ");
            if (sports.isSelected()) interests.append("Sports ");
            if (travel.isSelected()) interests.append("Travel ");
            if (interests.length() == 0) interests.append("None");

            String country = (String) countryBox.getSelectedItem();

            // Show all values in a dialog
            JOptionPane.showMessageDialog(frame,
                    "Name: " + name +
                    "\nPassword: " + password +
                    "\nAddress: " + address +
                    "\nGender: " + gender +
                    "\nInterests: " + interests +
                    "\nCountry: " + country,
                    "Submitted Information",
                    JOptionPane.INFORMATION_MESSAGE);
        });

        // Show the form
        frame.setVisible(true);
    }
}
