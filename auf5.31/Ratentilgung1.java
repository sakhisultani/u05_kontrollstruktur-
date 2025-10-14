public class Ratentilgung1
{ 
    public static void main (String[] args)
   {
      int kredit = 5000;
      int zinsensatz = 6;
      int laufezeit = 5;
  
     

      int restschuld = kredit; 
 
      System.out.println();
      System.out.println("Ratentilgung");
      System.out.println();

      for( int jahre = 1; jahre <= laufezeit; jahre++)
      {
         int zinsen =  restschuld * zinsensatz / 100;

         int tilgung = kredit / laufezeit;
    
         int zahlung = tilgung + zinsen;

         System.out.println("Jahr  " + jahre + "  Restschuld  " + kredit + "  Zinsen   " + zinsen + "  Tilgung  " + tilgung + "  Zahlung  " + zahlung);
         
         restschuld = restschuld - tilgung;
      } 
   }
}
