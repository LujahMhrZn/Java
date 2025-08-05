package swing;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyEventExample {
    public static void main(String[] args) {
        javax.swing.JFrame frame = new javax.swing.JFrame("Key Event Example");
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        
        frame.addKeyListener(new KeyAdapter(){
            @Override
            public void keyPressed(KeyEvent e){
                System.out.println("Key Pressed: " + e.getKeyChar());
            }
            @Override
            public void keyReleased(KeyEvent e){
                System.out.println("Key Released: " + e.getKeyChar());
            }
        });
        frame.setSize(400, 400);
        frame.setVisible(true);
       
    }
}
