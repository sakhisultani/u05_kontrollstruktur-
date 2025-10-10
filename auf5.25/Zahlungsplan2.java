public class Zahlungsplan2
{ 
    public static void main (String[] args)
   {
       int kreditbetrag = 475;
       int ratenhoehe = 100;
       int zaehler = 1;
    
       System.out.println();
       System.out.println("Zahlungsplan");
       System.out.println("==========");

       for(int i = kreditbetrag; i >= ratenhoehe; i -= ratenhoehe)
       {
           System.out.println(zaehler + ". Rate:" + ratenhoehe +" Euro" );
           zaehler++;
	   kreditbetrag -= ratenhoehe;
       }

       if(kreditbetrag > 0)
       {
           System.out.println(zaehler + ". Rate:" + kreditbetrag +" Euro" );
       }
    }
}
