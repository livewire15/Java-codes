

        /* Declare second integer, double, and String variables. */

import java.util.*;
class string
{
public static void main(String args[])
{
int i=4;
double d=4.0;
String s="hackerrank";
Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
double d1=sc.nextDouble();
sc.nextLine();                    //Very imp. step since when we enter a no. and press enter, sc.nextInt() or double() method doesn't 
String s1=" "+sc.nextLine();      //consume the enter('\n')character and it gets consumed by the sc.nextLine() method and string cannot get entered.
System.out.println(i+n);          // Hence a method for consuming enter('\n')is added in between.
System.out.println(d+d1);
System.out.println(s.concat(s1));

}	
}
        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        /* Print the sum of both integer variables on a new line. */

        /* Print the sum of the double variables on a new line. */
		
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
