Pseudo code:
//select a random number say 34722641
//split the number into two e.g '34722' '641'
//select the last digit in the first sequence 3472(2)
//find the smallest digit in the second sequence that is larger than it i.e 6(4)1
//Swap them,therefore the number is 3472(4) 6(2)1
//sort the second sequence to increasing number: '34724' '126'

Attempted Solution:
package nextLarge;

import java.util.Arrays;

public class nextL {
	public static int nextDigit(int number){
	    String num = String.valueOf(number);        
	    int stop = 0;       
	    char [] chars = null;
	    outer:
	        for(int i = num.length() - 1; i > 0; i--){          
	            chars = num.toCharArray();
	            for(int j = i; j > 0; j--){
	                char temp = chars[j];
	                chars[j] = chars[j - 1];
	                chars[j - 1] = temp;
	                if(Integer.valueOf(new String(chars)) > number){
	                    stop = j;                   
	                    break outer;                                
	                }               
	            }               
	        }

	    Arrays.sort(chars, stop, chars.length); 
	    return Integer.valueOf(new String(chars));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

