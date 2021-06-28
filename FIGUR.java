
public class FIGUR
{
   public static int x;
   public static int y;
   EINZELFELD feld;
   String farbe;
   KREIS fuellung;
   KREIS rahmen;
   public FIGUR(String farbe) 
   {
       this.x=x;
       this.y=y;
       this.farbe=farbe;

       rahmen = new KREIS();
       rahmen.FarbeSetzen("schwarz");
       fuellung = new KREIS();
       fuellung.RadiusSetzen(15);
       fuellung.FarbeSetzen(farbe);
    }
   public void PositionSetzen(int x, int y)
   {
       this.x=x;
       this.y=y;
       rahmen.MittelpunktSetzen(x,y);
       
       fuellung.MittelpunktSetzen(x,y);
   }
   
   public void PositionSetzen(EINZELFELD feld)
   {
       this.x=feld.x_coord;
       this.y=feld.y_coord;
       rahmen.MittelpunktSetzen(x,y);
       
       fuellung.MittelpunktSetzen(x,y);
       this.feld = feld;
   }
   
   public void Highlight()
   {
       rahmen.FarbeSetzen("magenta");
   }
 
   void Spielfeld_setzen (EINZELFELD feld)
   {
       this.feld = feld;
   }
   
   EINZELFELD Spielfeld_abfragen ()
   {
      return feld; 
   }
}