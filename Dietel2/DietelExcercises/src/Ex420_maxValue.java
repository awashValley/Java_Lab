
/**
 ** exercise 4.20: finding maximum value 
/**
 *
 * @author awashValley
 */

import java.util.Scanner;


public class Ex420_maxValue {
    
    public void findMax() {
        
        Scanner input = new Scanner(System.in);
        
        int value =0;
        int maxValue =0;
        
        while (value != -1) {
            System.out.print("Enter value or -1 to quit: ");
            value = input.nextInt();
            
            if (value >= maxValue) {
                maxValue = value;
            }           
        }
        
        System.out.printf("The value %d is maximum in the list.", maxValue);
        System.out.println("");
    }    
}
