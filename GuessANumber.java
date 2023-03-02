import java.util.Random;
import java.util.Scanner;  


public class GuessANumber {
	private static int rnd_number;

	
    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
		System.out.println( "Can you guess what it is?...");
        makeAGuess();
 	}


    private static void makeAGuess(){
		
         // Create a Scanner object   
        Scanner scan = new Scanner(System.in);
    
    	// Read user input
        String input = "";

        while(scan.hasNext()){  
            //Print Double value  
            if(scan.hasNextDouble()){  
                System.out.println("input is numeric: "+scan.next());  
            }  
            else{  
                System.out.println("input is not numeric: "+scan.next());  
            }  
        }  
        scan.close();  

   

    }
   

}