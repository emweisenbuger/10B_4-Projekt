

import java. awt. *;
import javax. swing. *;

/**
 * Verwaltet das Ausgabefenster.
 * 
 * @author 
 * @version2_18.05.21
 */
class OBERFLAECHE
{
    /** Anzeigegröße für eine Kachel */
    private static final int rasterGroesse = 40;
    /** Höhe des Anzeigefensters */
    private static final int hoeheFenster = rasterGroesse * 20;
    /** Breite des Anzeigefensters */
    private static final int breiteFenster = rasterGroesse * 26;
    private static OBERFLAECHE o = null;
    private JFrame fenster = null;
    private FIGUR Blau1;
    private FIGUR Blau2;
    
    private OBERFLAECHE ()
    {
           fenster = new JFrame ("Zeichenfläche");
        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenster. setResizable (false);
        fenster. setVisible (true);
        fenster. setLayout (null);
        //---------------hier legen wir einen spieler an
        Blau1= new FIGUR(40,40);
        Blau2= new FIGUR(20,20);
        fenster. getContentPane (). setBackground (new Color (240, 240, 240));
        Insets i = fenster.getInsets();
        fenster. setSize (breiteFenster, hoeheFenster + i.top);
        JComponent hintergrund = new JComponent ()
        {
             /**
             * Zeichnet das Hintergrundmuster.
             */
            public void paintComponent (Graphics g)
            {
                g. setColor (Color. lightGray);
                for (int i = 1; i <= hoeheFenster / (rasterGroesse * 2); i++)
                {
                    g. drawLine (0, hoeheFenster / 2 + i * rasterGroesse, breiteFenster - 1, hoeheFenster / 2 + i * rasterGroesse);
                    g. drawLine (0, hoeheFenster / 2 - i * rasterGroesse, breiteFenster - 1, hoeheFenster / 2 - i * rasterGroesse);
                }
                for (int i = 1; i <= breiteFenster / (rasterGroesse * 2); i++)
                {
                    g. drawLine (breiteFenster / 2 + i * rasterGroesse, 0, breiteFenster / 2 + i * rasterGroesse, hoeheFenster - 1);
                    g. drawLine (breiteFenster / 2 - i * rasterGroesse, 0, breiteFenster / 2 - i * rasterGroesse, hoeheFenster - 1);
                }
                g. setColor (Color. black);
                g. drawLine (0, hoeheFenster / 2, breiteFenster - 1, hoeheFenster / 2);
                g. drawLine (breiteFenster / 2, 0, breiteFenster / 2, hoeheFenster - 1);
                Blau1.draw (g);
                Blau2.draw (g);
            }
        };
        hintergrund. setVisible (true);
        hintergrund. setSize (breiteFenster, hoeheFenster);
        hintergrund. setLocation (0, 0);
        fenster. add (hintergrund);
        
    }
         
        
    
    
   

    /**
     * Gibt das Ausgabefenster zurück und erzeugt es gegebenenfalls.
     * @return Ausgabefenster
     */
    static JFrame FensterGeben ()
    {
        if (o == null)
        {
            o = new OBERFLAECHE ();
        }
        return o. fenster;
    }

    /**
     * Gibt die Rastergröße zurück.
     * @return Ausgabefenster
     */
    static int RasterGroesseGeben ()
    {
        return rasterGroesse;
    }

    /**
     * Gibt die Breite des Fensters zurück.
     * @return Fensterbreite
     */
    static int FensterBreiteGeben ()
    {
        return breiteFenster;
    }

    /**
     * Gibt die Höhe des Fensters zurück.
     * @return Fensterhöhe
     */
    static int FensterHoeheGeben ()
    {
        return hoeheFenster;
    }
}
