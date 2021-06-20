 
/**
 * Zusammensetzung des Spielbretts
 * 
 * @version1_20.06.2021
 */

public class SPIEL 

{
    int [][] spielfeld = {{ 71,72,0,0,1,2,3,0,0,41,42},
                           { 73,74,0,0,40,45,4,0,0,43,44},
                           {0,0,0,0,39,46,5,0,0,0,0},
                           {0,0,0,0,38,47,6,0,0,0,0},
                           {33,34,35,36,37,48,7,8,9,10,11},
                           {32,75,76,77,78,0,58,57,56,55,12},
                           {31,30,29,28,27,68,17,16,15,14,13},
                           {0,0,0,0,26,67,18,0,0,0,0},
                           {0,0,0,0,25,66,19,0,0,0,0},
                           {61,62,0,0,24,65,20,0,0,51,52},
                           {63,64,0,0,23,22,21,0,0,53,54},
                        };   
   KREIS [] kreis;
   
    
    public SPIEL()
    {
        kreis = new KREIS[80];
        for (int i = 0; i < kreis. length; i++)
        {
            kreis[i] = new KREIS();
        }
        
        // FarbeSetzen
        for(int i = 1; i < 41; i++)
        {
            kreis[i].FarbeSetzen("weiß");
        }
        for(int i = 41; i <= 50; i++)
        {
            kreis[i].FarbeSetzen("grün");
        }
        kreis[3].FarbeSetzen("hellgrün");
        for(int i = 51; i <= 60; i++)
        {
            kreis[i].FarbeSetzen("gelb");
        }
        kreis[13].FarbeSetzen("hellgelb");
        for(int i = 61; i <= 70; i++)
        {
            kreis[i].FarbeSetzen("blau");
        }
        kreis[23].FarbeSetzen("cyan");
        for(int i = 71; i < 80; i++)
        {
            kreis[i].FarbeSetzen("rot");
        }
        kreis[33].FarbeSetzen("orange");
        
        for (int zeile = 0;zeile <= 10;zeile++)
        {
        for (int spalte =0;spalte <= 10;spalte++)
        {
            
            if (spielfeld[zeile][spalte]>0) 
            {
                System.out.println (spielfeld[zeile] [spalte]);
                
                kreis[spielfeld[zeile][spalte]].MittelpunktSetzen(200+spalte*60, 120+zeile*60);
            }
        }
    }
}        
    }


