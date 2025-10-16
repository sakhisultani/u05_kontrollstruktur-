import java.io.*;

public class Pfund6
{
   public static void main(String[] args) throws Exception
   {   
       // Deklarationen               
       String eingabeEuro; 
       String eingabeGebuehr;  
       double eingabeEurobouble;  
       double faktor = 0.758;
       double pfundErgebnis;
       double finalGebuehr;
       double einzahlung;
  
       // deklariere und initiere den inputstreamreader und bufferedreader
       InputStreamReader eingabeLeser = new InputStreamReader(System.in);
       BufferedReader   gepufferterLeser = new BufferedReader (eingabeLeser);    
       
       // abfragen des Euro-betrags
       System.out.println();       
       System.out.print("Bitte den Euro-Betrag eingeben: ");
       eingabeEuro = gepufferterLeser.readLine();
       eingabeEurobouble = Double.parseDouble(eingabeEuro);
       System.out.println(); 
 
       // abfrage der beguehr 
       System.out.println("Bitte die Gebuehr eingeben.");
       System.out.println(" Eingabeform: \" x Euro\" oder \"x Prozent\""); 
       System.out.println();
       eingabeGebuehr = gepufferterLeser.readLine();
       System.out.println(); 

       // euro zu Pfung Umrechnung 
       pfundErgebnis = eingabeEurobouble * faktor;

       // gebuehr ausrechnen
       if(eingabeGebuehr.length() == 6)
       {
          eingabeGebuehr =  eingabeGebuehr.substring(0, 1); 
          finalGebuehr = Double.parseDouble(eingabeGebuehr);
       } 
       else 
       {
          eingabeGebuehr =  eingabeGebuehr.substring(0, 1); 
          finalGebuehr = Double.parseDouble(eingabeGebuehr);

          finalGebuehr = eingabeEurobouble / 100 * finalGebuehr;
       }

       // berechne gesamteinzahlung in euro 
       einzahlung = eingabeEurobouble + finalGebuehr;

       // finale ausgabe
       System.out.printf("Euro-Betrag:  %7.2f Euro \n", eingabeEurobouble);
       System.out.printf("Pfungd-Betrag:%7.2f Euro \n", pfundErgebnis);
       System.out.printf("Gebuehr      :%7.2f Euro \n", finalGebuehr);
       System.out.printf("Einzuzahlen  :%7.2f Euro \n", einzahlung);
           
   }
}
