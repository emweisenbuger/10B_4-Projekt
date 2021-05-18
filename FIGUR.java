

import java.awt.Color;
import java.awt.Graphics;
class FIGUR
{
   public static int x;
   public static int y;
   static Color farbe;
   FIGUR(int x, int y)
   {
       this.x=x;
       this.y=y;
       
    }
    
    public static void draw (Graphics g)
    {
       g.setColor(Color.BLUE); 
       g.fillOval(x, y, 35, 35);
    }
}