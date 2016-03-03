
/**
 *
 * @author awashValley
 */

import java.util.Scanner;


public class Ex422_maxValues2 {
    
    public void findMax2() {
        
        Scanner input = new Scanner(System.in);
        
        int value   =0;
        int counter =0;
        
        int firstMax  =0;
        int secondMax =0;
        
        while (value != -1) {
            System.out.print("Enter value or -1 to quit: ");
            value = input.nextInt();
            
            if (value > firstMax) {
                
                if (counter == 0){
                    firstMax  =value;
                    secondMax =firstMax;
                } 
                else {
                    firstMax =value;
                }
            } 
            else if (value > secondMax) {
                secondMax =value;
            }
            else if ( (value <= firstMax) && (value <= secondMax) ){
                continue;
            }
            else {               
                System.out.println("Sorry, something went wrong!");  
            }
            
            counter += 1;
        }
        
        System.out.printf("The maximum value: %d\n The second maximum value: %d.", 
                firstMax, secondMax);
        System.out.println("");
    }
    
}
