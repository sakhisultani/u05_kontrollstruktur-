public class ABCAnalyse
{ 
    public static void main (String[] args) 
    {
       char prioritaet = 'A';

       if(prioritaet == 'A')
       {
          System.out.println("Hoch");
       } 
          if(prioritaet == 'B')
          {
             System.out.println("Mittel"); 
          }
             if(prioritaet == 'C')
             {
                System.out.println("Niedrig"); 
             }
       else
       {
         System.out.println("Unzulaessing");
       }   
    }
}
