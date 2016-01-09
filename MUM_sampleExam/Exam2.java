/*	------------------------------	*/
/*	MUM: Exam for Preparatory Work	*/
/*	------------------------------	*/

// LINK: http://mscs.mum.edu/preparatory-track-sample-exam.html


/*
2. [Tests ability to solve a problem] Write a function that accepts a character array as input, 
	counts the number of occurrences of each character in the array, and outputs the results in a format 
	like the following (characters that do not occur in the input array are not displayed in output)

	a - **

	c - ****

	e - *

	For example, if input were {‘c’, ‘e’, ‘e’, ‘e’, ‘a’, ‘q’}, the output would be:

	a - *

	c - *

	e- ***

	q - *

*/

import java.util.Arrays;

public class Exam2{


	static void displayNumOfChar(char [] myChar){
	
		Arrays.sort(myChar);
		
		int len = myChar.length;			// if a variable is an array, we always use 'object.length', instead of 'object.length()'
		
		for(int i=0; i < len; ){

			char tmp1 = myChar[i];
			
			System.out.print(tmp1 + " - " + "*");
			
			// check redundant characters
			for(int j=(i+1); j < len; j++){
				
				char tmp2 = myChar[j];
				
				if(tmp1 == tmp2){
					System.out.print("*");
					i++;
				}
			}
			
			i++;
			System.out.println();
		}
	
		
	
	}
	
	public static void main(String []args){
	
	}

}