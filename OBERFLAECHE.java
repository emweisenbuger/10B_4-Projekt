


import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class OBERFLAECHE implements KeyListener
{
    JFrame f;
    ImageIcon spielfeld;
    JLabel l;
    int x,y;
    
    OBERFLAECHE()
    {
        x = 0;
        y = 0;
        f = new JFrame();
        f.setVisible(true);
        f.setSize(700,700);
        f.addKeyListener(this);
        spielfeld = new ImageIcon ("spielfeld.jpg");        
        l = new JLabel (spielfeld);
        l.setLocation(x,y);
        f.add(l);
        
    }
    
    public void keyReleased(KeyEvent ke)
    {
    }
    
    public void keyTyped(KeyEvent ke)
    {
    }
    
    public void keyPressed(KeyEvent ke) 
    {
        switch (ke.getKeyChar())
        {
          case 'w':
            y = y - 10;
            break;
          case 's':
            y = y + 10;
            break;
          case 'a':
            x = x - 10;
            break;
          case 'd':
            x = x + 10;
            break;
        }
        l.setLocation(x,y);
    }
}

