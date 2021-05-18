
/**
 * Zusammensetzung des Spielbretts
 * 
 * @author (Ihr Name) 
 * @version1_18.05.21
 */

import java. awt.*;
import javax.swing.*; 

public class SPIEL
{
    // 
    FLIESE [] ffliese;
    ImageIcon feld;

    /**
     * Konstruktor für Objekte der Klasse SPIEL
     */
    public SPIEL()
    {
        // erster Versuch mit sieben Fliesen
         ffliese= new FLIESE[7];
         feld = new ImageIcon ("bird.jpg");
         
         for (int i= 0; i < ffliese.length; i++)
         {
             ffliese [i] = new FLIESE ();
         }
    }

}
