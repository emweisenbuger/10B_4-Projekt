import java.awt.*;
import java.awt.event.*;
/**
 * Zusammensetzung des Spielbretts
 * 
 * @version1_20.06.2021
 */

public class SPIEL extends EREIGNISSE
 
{ 
    int augenzahl;
    int [][] spielfeld = { { 71,72,0,0,1,2,3,0,0,41,42},
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
   
   // Spielfiguren:
   FIGUR Blau1;
   FIGUR Blau2;
   FIGUR Blau3;
   FIGUR Blau4;
   FIGUR Rot1;
   FIGUR Rot2;
   FIGUR Rot3;
   FIGUR Rot4;
   FIGUR Gelb1;
   FIGUR Gelb2;
   FIGUR Gelb3;
   FIGUR Gelb4;
   FIGUR Gruen1;
   FIGUR Gruen2;
   FIGUR Gruen3;
   FIGUR Gruen4;
   
   int SpielerAnDerReihe;
   int SpielerInHausR;
   int SpielerInHausG;
   int SpielerInHausB;
   int SpielerInHausY;
   int selectedSpieler;
 
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
    
    // Bereich für Instanzierung der Spielfiguren
    
    // BLAU
    Blau1 = new FIGUR("blau");
    Blau1.PositionSetzen(200+0*60,120+9*60);
    Blau2 = new FIGUR("blau");
    Blau2.PositionSetzen(200+1*60,120+9*60);
    Blau3 = new FIGUR("blau");
    Blau3.PositionSetzen(200+0*60,120+10*60);
    Blau4 = new FIGUR("blau");
    Blau4.PositionSetzen(200+1*60,120+10*60);
    // GELB
    Gelb1 = new FIGUR("gelb");
    Gelb1.PositionSetzen(200+9*60,120+9*60);
    Gelb2 = new FIGUR("gelb");
    Gelb2.PositionSetzen(200+10*60,120+9*60);
    Gelb3 = new FIGUR("gelb");
    Gelb3.PositionSetzen(200+9*60,120+10*60);
    Gelb4 = new FIGUR("gelb");
    Gelb4.PositionSetzen(200+10*60,120+10*60);
    // GRUEN
    Gruen1 = new FIGUR("gruen");
    Gruen1.PositionSetzen(200+9*60,120+0*60);
    Gruen2 = new FIGUR("gruen");
    Gruen2.PositionSetzen(200+10*60,120+0*60);
    Gruen3 = new FIGUR("gruen");
    Gruen3.PositionSetzen(200+9*60,120+1*60);
    Gruen4 = new FIGUR("gruen");
    Gruen4.PositionSetzen(200+10*60,120+1*60);
    // ROT
    Rot1 = new FIGUR("rot");
    Rot1.PositionSetzen(200+0*60,120+0*60);
    Rot2 = new FIGUR("rot");
    Rot2.PositionSetzen(200+1*60,120+0*60);
    Rot3 = new FIGUR("rot");
    Rot3.PositionSetzen(200+0*60,120+1*60);
    Rot4 = new FIGUR("rot");
    Rot4.PositionSetzen(200+1*60,120+1*60);

    // Spieler an der Reihe: Rot = 1; Grün = 2; Rot = 3; Gelb = 4;
    SpielerAnDerReihe = 1;
    SpielerInHausR = 4;
    
 }     
 @Override
    void TasteGedrueckt (char welche)
 {
        
        if ((welche == 'W') || (welche == 'w'))
        {
            // System.out.println("Hier wird gewürfelt");
         double augenzahlungerundet=Math.random()*6;
        
           int augenzahlfinal=(int)augenzahlungerundet+1;
           System.out.println("gewürfelte augenzahl: "+ augenzahlfinal);
           augenzahl = augenzahlfinal;
           spielzug();
        
        }
        else if(welche == 1) {selectedSpieler = 1;}
        else if(welche == 2) {selectedSpieler = 2;}
        else if(welche == 3) {selectedSpieler = 3;}
        else if(welche == 4) {selectedSpieler = 4;}
        
 }  
 void spielzug()
 {
     if(SpielerAnDerReihe == 1)
    {
        if(SpielerInHausR > 0 && augenzahl == 6 )
        {
            if(SpielerInHausR == 1) {Rot1.PositionSetzen(200+0*60,120+4*60); SpielerInHausR--;}
            if(SpielerInHausR == 2) {Rot2.PositionSetzen(200+0*60,120+4*60); SpielerInHausR--;}
            if(SpielerInHausR == 3) {Rot3.PositionSetzen(200+0*60,120+4*60); SpielerInHausR--;}
            if(SpielerInHausR == 4) {Rot4.PositionSetzen(200+0*60,120+4*60); SpielerInHausR--;}
        }
        else
        {
            for (int i = 0; i < augenzahl; i++)
         {
            // if()
            // {
                
            // }
         }
        }
    }
 }
 void gehen()
 {
     
 }
    }


