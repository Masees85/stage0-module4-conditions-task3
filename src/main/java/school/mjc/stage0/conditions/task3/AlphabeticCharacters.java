package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters 
{
    public void vowelDeterminer(char character) 
    {
        
        if (symbol >= 'a' && symbol <='z' || symbol>='A' && symbol<='Z')
           
      {
         if(symbol=='a' || symbol=='e' || symbol=='o' || symbol=='i' || symbol=='u' )
          {
              System.out.println("Vowel");
           }
          else
          {
              System.out.println("Consonant");
          }
          
       }
        else 
        {
      
          System.out.println("wrong alphabet!");
       }
    }
  }
}
