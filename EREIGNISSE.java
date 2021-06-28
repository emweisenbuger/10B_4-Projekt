import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * Zugriff auf die Ereignisse einschließlich Taktgeber.
 * 
 * @author Albert Wiedemann
 * @version 1.0
 */
class EREIGNISSE
{
    /** Timerobjekt für die zentrale Zeitverwaltung */
    private Timer timer;

    /**
     * Der Konstruktor erzeugt den Taktgeber
     * und meldet die Eventlistener bei der Zeichenfläche an.
     */
    EREIGNISSE ()
    {
        timer = new Timer (1000, new ActionListener ()
        {
            /**
             * Vom Timer aufgerufen.
             * Erzeugt den nächsten Taktimpuls
             * @param evt der Timerevent
             */
            public void actionPerformed (ActionEvent evt)
            {
                TaktImpulsAusfuehren ();
            }
        });
        ZEICHENFLAECHE.KeyListenerAnmelden(new KeyAdapter ()
        {
            /**
             * Gibt die Taste an die eigentliche Aktionsmethode weiter.
             * @param e das zugestellte Ereignis
             */
            public void keyPressed(KeyEvent e)
            {
                if ((int) e.getKeyChar() == KeyEvent.CHAR_UNDEFINED)
                {
                    switch (e.getKeyCode())
                    {
                        case KeyEvent.VK_ENTER:
                            TasteGedrueckt((char) KeyEvent.VK_ENTER);
                            break;
                        default:
                            SonderTasteGedrueckt(e.getKeyCode());
                    }
                }
                else
                {
                    TasteGedrueckt (e.getKeyChar());
                }
            }
        });
        ZEICHENFLAECHE.MouseListenerAnmelden(new MouseAdapter ()
        {
            /**
             * Gibt den Ort eines Mouseclicks an die eigentliche Aktionsmethode weiter.
             * @param e das zugrestellte Ereignis
             */
            public void mouseClicked(MouseEvent e)
            {
                MausGeklickt(e.getX(), e.getY(), e.getClickCount());
            }
        });
    }
    
    /**
     * Die eigentliche Aktionsmethode des Zeitgebers.
     * <br>Muss bei Bedarf von einer Unterklasse überschrieben werden. 
     */
    void TaktImpulsAusfuehren ()
    {
        System.out.println ("Tick");
    }

    /**
     * Zeitgeber starten.
     */
    void Starten ()
    {
        timer.start ();
    }

    /**
     * Zeitgeber anhalten.
     */
    void Anhalten ()
    {
        timer.stop ();
    }
    
    /**
     * Ablaufgeschwindigkeit des Zeitgebers einstellen.
     * 
     * @param dauer: Angabe in Millisekunden
     */
    void TaktdauerSetzen (int dauer)
    {
        timer.setDelay(dauer);
    }
    
    /**
     * Die eigentliche Aktionsmethode für gedrückte Tasten.
     * <br>Muss bei Bedarf von einer Unterklasse überschrieben werden. 
     * @param welche die gedrückte Taste
     */
    void TasteGedrueckt (char welche)
    {
        System. out. println ("Taste: " + welche);
    }
    
    /**
     * Die eigentliche Aktionsmethode für gedrückte Sondertasten.
     * <br>Muss bei Bedarf von einer Unterklasse überschrieben werden. 
     * @param welche KeyCode der gedrückten Taste
     */
    void SonderTasteGedrueckt (int welche)
    {
        System. out. println ("Sonderaste: " + welche);
    }
    
    /**
     * Die eigentliche Aktionsmethode für einen Mausklick.
     * <br>Muss bei Bedarf von einer Unterklasse überschrieben werden. 
     * @param x x-Position des Mausklicks
     * @param y y-Position des Mausklicks
     * @param anzahl Anzahl der aufeinanderfolgenden Mausklicks
     */
    void MausGeklickt (int x, int y, int anzahl)
    {
        System. out. println ("Maus: (" + x + "|" + y + "), " + anzahl + " mal");
    }
}
