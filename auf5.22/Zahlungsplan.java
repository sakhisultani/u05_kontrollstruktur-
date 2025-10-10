public class Zahlungsplan
{ 
    public static void main (String[] args)
   {
      int kreditbetrag = 300;
      int rate = 6; 
      int zahlenderate = kreditbetrag / rate;
      System.out.println();
      System.out.println("Zahlungsplan");
      System.out.println("==========");

      for(int i = 1; i <= 6; i++)
      {
        System.out.println(i + ". Rate:" + zahlenderate +" Euro" );
      }
    }
}
