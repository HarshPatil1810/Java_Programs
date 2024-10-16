import java.awt.*;
import java.awt.event.*;

public class MouseKeyEvent extends Frame implements KeyListener,MouseListener {
    private Label displayLabel;

    public MouseKeyEvent() {
       
        setTitle("Mouse and Key Event");
        setSize(400, 300);
        setLayout(new FlowLayout()); 
        setVisible(true);
       
        displayLabel = new Label("key or move the mouse.");
        add(displayLabel);

        addKeyListener(this);
        addMouseListener(this);
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
  
    }

    @Override
    public void keyPressed(KeyEvent e) {
        String keyText = "Key Pressed: " + KeyEvent.getKeyText(e.getKeyCode());
        displayLabel.setText(keyText); 
    }

    @Override
    public void keyReleased(KeyEvent e) {
    
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        String mousePosition = "Mouse Clicked: X=" + e.getX() + ", Y=" + e.getY();
        displayLabel.setText(mousePosition);
    }

    @Override
    public void mousePressed(MouseEvent e) {
       
    }

    @Override
    public void mouseReleased(MouseEvent e) {
       
    }

    @Override
    public void mouseEntered(MouseEvent e) {
      
    }

    @Override
    public void mouseExited(MouseEvent e) {
       
    }


    public static void main(String[] args) {
        new MouseKeyEvent();
    }
}
