public class BreakEvenPoint2
{ 
    public static void main (String[] args)
   {
      int verkaufspreisProst     =  1500;
      int rohstoffkostenProst    = 600;
      int arbeitskostenProst     = 300;
      int fixkostenproMonat      = 5000;
      int maxStZahlproMonat      = 15;

      System.out.println();
      System.out.println("Break-Even-Point");
      System.out.println("================");
      System.out.println();
      System.out.println("Verkaufspreis pro Stuech:      1500");
      System.out.println("Rohstoffkosten pro Stueck:     600");
      System.out.println("Arbeitskosten pro Stueck:      400");
      System.out.println("Fixkosten pro Monat:           5000");
      System.out.println("Maximale Steuckzahl pro Monat:  15");
      System.out.println();

      for(int stueckzahl = 1; stueckzahl <= 10; stueckzahl++)
      {

         
         int stueckkosten  = fixkostenproMonat / stueckzahl + (rohstoffkostenProst + arbeitskostenProst) ;
         int ueberschuss =  verkaufspreisProst - stueckkosten;

         //int erloes = verkaufspreisProst * stueckzahl;
        
         //int ueberschuss = erloes - gesamtkosten;

         System.out.println("Stuekzahl: " + stueckzahl + "  Stueckkosten: " + stueckkosten + "  Ueberschuss pro Steuck: " + ueberschuss);
      }
   }
}
