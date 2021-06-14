


import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
import java.util.*;

public class OBERFLAECHE 
{
    private JFrame fenster;
    private JComponent malfläche;
    ImageIcon spielfeld;
    JLabel l;
    int x,y;
    private static OBERFLAECHE zeichenfläche = null;
    
    
    OBERFLAECHE()
    {
        x = 0;
        y = 0;
        fenster = new JFrame();
        fenster.setVisible(true);
        fenster.setSize(700,700);
        //*spielfeld = new ImageIcon ("spielfeld.jpg");        
        l = new JLabel (spielfeld);
        l.setLocation(x,y);
        fenster.add(l);
      
    }
}   

