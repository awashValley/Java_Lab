
//package dietelexcercises;

import java.util.Scanner;

/**
 * @author awashValley
 */
public class DietelExcercises {
    
    Scanner input = new Scanner(System.in);
    

    public static void main(String[] args) {
        
        // exercise 4.20: finding maximum value 
        /*Ex420_maxValue usr1 =new Ex420_maxValue();
        usr1.findMax();*/
        
        // excercise 4.22: find two highest values
        Ex422_maxValues2 usr1 =new Ex422_maxValues2();
        usr1.findMax2();
        
        
        
        
        /**
        * exercise 4.21
        */
        /*System.out.println("N\t10*N\t100*N\t1000*N");
        for(int i=1; i <= 5; i++){
            System.out.printf("%d\t%d\t%d\t%d", i, 10*i, 100*i, 1000*i);
            System.out.println("");
        }*/
        
        
        
    }
    
}
