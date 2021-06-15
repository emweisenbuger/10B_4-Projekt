
/**
 * Zusammensetzung des Spielbretts
 * 
 * @author (Ihr Name) 
 * @version1_15.06.21
 */

public class SPIEL 

{
    // Attributvereinbarung Kreis 
    KREIS [] kreis;
    // ImageIcon auf Jframe
    ImageIcon spielfeld1;
    JLabel l;
    int x,y;
    
    /**
     * Konstruktor für Objekte der Klasse SPIEL
     */
    public SPIEL()
    {
        // ImageIcon spielfeld als Referenz
        spielfeld1 = new ImageIcon ("spielfeld1.jpg");
        l = new JLabel (spielfeld1);
        l.setLocation(x,y);
        // erster Versuch mit 2 Kreisen
        kreis = new KREIS[20];
        
        for (int i = 0; i < kreis. length; i++)
        {
            kreis[i] = new KREIS();
        }
        
        kreis[1]. MittelpunktSetzen(120, 120);
        kreis[2]. MittelpunktSetzen(170, 120);
        kreis[3]. MittelpunktSetzen(220, 120);
        kreis[4]. MittelpunktSetzen(270, 120);
    }

}
