package practice3;

import javax.swing.*;
import javax.swing.Box;
import java.awt.*;

public class LayoutManagersDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Java Layout Managers");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create tabbed pane to show all layouts
        JTabbedPane tabs = new JTabbedPane();

        // 1. FlowLayout Panel
        JPanel flowPanel = new JPanel(new FlowLayout());
        flowPanel.add(new JButton("Button 1"));
        flowPanel.add(new JButton("Button 2"));
        flowPanel.add(new JButton("Button 3"));
        tabs.add("FlowLayout", flowPanel);

        // 2. BorderLayout Panel
        JPanel borderPanel = new JPanel(new BorderLayout());
        borderPanel.add(new JButton("North"), BorderLayout.NORTH);
        borderPanel.add(new JButton("South"), BorderLayout.SOUTH);
        borderPanel.add(new JButton("East"), BorderLayout.EAST);
        borderPanel.add(new JButton("West"), BorderLayout.WEST);
        borderPanel.add(new JButton("Center"), BorderLayout.CENTER);
        tabs.add("BorderLayout", borderPanel);

        // 3. GridLayout Panel (2x2)
        JPanel gridPanel = new JPanel(new GridLayout(2, 2, 10, 10)); // rows, cols, hgap, vgap
        gridPanel.add(new JButton("1"));
        gridPanel.add(new JButton("2"));
        gridPanel.add(new JButton("3"));
        gridPanel.add(new JButton("4"));
        tabs.add("GridLayout", gridPanel);

        // 4. BoxLayout Panel (Vertical)
        JPanel boxPanel = new JPanel();
        boxPanel.setLayout(new BoxLayout(boxPanel, BoxLayout.Y_AXIS));
        boxPanel.add(new JButton("Top"));
        boxPanel.add(Box.createRigidArea(new Dimension(0, 10))); // vertical spacing
        boxPanel.add(new JButton("Middle"));
        boxPanel.add(Box.createVerticalGlue()); // expands to push next down
        boxPanel.add(new JButton("Bottom"));
        tabs.add("BoxLayout", boxPanel);

        // 5. GridBagLayout Panel (Advanced)
        JPanel gridBagPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;
        gridBagPanel.add(new JButton("A"), gbc);

        gbc.gridx = 1;
        gridBagPanel.add(new JButton("B"), gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2; // span two columns
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gridBagPanel.add(new JButton("C (spans)"), gbc);

        tabs.add("GridBagLayout", gridBagPanel);

        // Add tabbedPane to frame
        frame.add(tabs);
        frame.setVisible(true);
    }
}
