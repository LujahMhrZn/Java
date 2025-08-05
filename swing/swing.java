package swing;

public class swing {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            javax.swing.JFrame frame = new javax.swing.JFrame("Swing Demo");
            frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 200);

            javax.swing.JPanel panel = new javax.swing.JPanel();
            javax.swing.JLabel label = new javax.swing.JLabel("Hello, Swing!");
            javax.swing.JButton button = new javax.swing.JButton("Click Me");

            button.addActionListener(_ -> label.setText("Button Clicked!"));

            panel.add(label);
            panel.add(button);

            frame.getContentPane().add(panel);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
