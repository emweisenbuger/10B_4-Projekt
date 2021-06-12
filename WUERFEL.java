

public  class WUERFEL
{
    
    public int Wuerfeln()
    {
        
        double augenzahlungerundet=Math.random()*6;
        
        int augenzahlfinal=(int)augenzahlungerundet+1;
        System.out.println("gewürfelte augenzahl: "+ augenzahlfinal);
        return augenzahlfinal;
    }
}
