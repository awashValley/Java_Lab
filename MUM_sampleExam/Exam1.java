
/*	------------------------------	*/
/*	MUM: Exam for Preparatory Work	*/
/*	------------------------------	*/

// LINK: http://mscs.mum.edu/preparatory-track-sample-exam.html

/*
1. [Tests ability to write a simple loop] Write a Java method displayArray that loops through the elements of an array of Strings, 
	and outputs them to the console as a single row of comma-separated Strings. Your method should accept an array of Strings as an argument. 
	For example, the array

	{“Bob”, “Steve”, “Sue”, “Tony”, “Melba”}

	should be displayed to the console as

	Bob, Steve, Sue, Tony, Melba
*/

public class Exam1{

    static void displayArray(String [] str){
        
        //int len = str.length();
        int len = str.length;
        
        for(int i=0; i < len; i++){
            
            String strI = str[i];
            
            if(i == (len-1)){
                System.out.print(strI);
            }
            else{
                System.out.print(strI + ", ");
            }
            
        }
    }
    
     public static void main(String []args){
        //System.out.println("Hello World");
        
        String [] myStr = new String [] {"Bob", "Steve", "Sue", "Tony", "Melba"};
        
        displayArray(myStr);
        
        
     }
}
