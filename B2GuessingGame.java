import java.util.Random;



class B2GuessingGame extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {


    Random myRandom = new Random();
    int intMystery;
    int intGuess;

    intMystery = myRandom.nextInt((100-1) + 1) + 1;

    for (int i = 0; i < 5; i++) {
        intGuess = readInt("guess your number");
        if (intGuess < intMystery) {
            System.out.println("too low");
        } else if (intGuess > intMystery) {
            System.out.println("too high");
        } else if (intGuess == intMystery) {
            System.out.println("congratulations");
            return;
       
        }

        
            
      }
    System.out.println("nice try");
    }



    
}
      

   
    

    

      
    
  



   
    
    

   
   
    
    

    
  

