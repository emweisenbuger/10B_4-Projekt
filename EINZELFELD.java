
public class EINZELFELD
{
    int x_coord, y_coord;
    int wert, next_wert, next_wert_color;
    String next_wert_farbe;
    String farbe_figur_auf_feld;
    

    public EINZELFELD(int x,int y, int wert, int next,int next_color, String farbe)
    {
        x_coord = x;
        y_coord = y; 
        this.wert = wert;
        next_wert = next; 
        next_wert_color = next_color; 
        next_wert_farbe = farbe;

    }

    void Next_with_color (int next_color, String farbe)
    {
       next_wert_color = next_color;
       next_wert_farbe = farbe;
    }
    void besetzen(String farbe)
    {
        farbe_figur_auf_feld = farbe;
        //bei unbesetztem Feld ist farbe_figur_auf_feld = "schwarz"
    }

    String besetzt()
    {
        return farbe_figur_auf_feld;
    }   
}
