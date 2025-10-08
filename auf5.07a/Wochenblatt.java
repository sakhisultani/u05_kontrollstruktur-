public class Wochenblatt
{ 
    public static void main (String[] args)
    {
      System.out.println("Zustellung Wochenblatt");
      System.out.println();
      
      for(int aussen = 5; aussen <= 7; aussen++)
      {
         System.out.println();
         System.out.println("Ich betrete Nr " + aussen);
         
         for(int innen = 0; innen <= 3; innen++)
         {
            System.out.println("Zugestellt in Nr " + aussen +  ", " + innen + ". Stock");
         }
       }
    }
}
