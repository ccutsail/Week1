package CISC181.Week1.Package6;
/*
 * Notes - Introduction to 'If' selection
 * 
 * Things to note:
 * 
 * Example has two 'if' methods, SimpleIf and SimpleIfElse.  Notice that the expression being evaluated with the 'if' statement is surrounded by parenthesis?
 * Look at == comparison.  A single = sign means assignment, two equal signs means compare.  
 * 
 * The second 'if' method has an 'if/else' statement nested inside an if statement!  It can get ugly... but it's syntax is OK.
 * 
 * At the end is a 'Switch' method.  The idea behind the 'Switch' method is simplify complicated if/then statements.  Imagine having a number from 1-12 and trying
 * to determine month of the year?  What a pain it would be to do with if/then/else... and a pain to read.
 * 
 * Things to consider:
 * 
 * Does the second 'if' statement in SimpleIf need curly braces {} around the statement after the 'if'?  Why or why not?  When do you NEED curly braces?
 * 
 * What does 'break' do?  Is it needed?  Take the 'break' out of the switch statement and see what happens.
 */

import java.util.Scanner;

public class CMain {

	public static void main(String[] args) {

		SimpleIf();
		
		SimpleIfElse();
		
		SwitchStatement();
	}

	private static void SimpleIf() {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number between 0 and 10: ");
		int iNumber = input.nextInt();

		if (iNumber > 5)
			System.out.println("Number Greater Than 5");

		if (iNumber == 5) {
			System.out.println("Number is 5");
		}

		if (iNumber < 5)
			System.out.println("Number Less Than 5");
		
	}
	
	private static void SimpleIfElse() {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number between 0 and 10: ");
		int iNumber = input.nextInt();

		if (iNumber > 5) {
			if (iNumber > 8){
				System.out.println("Number Greater Than 8");				
			}
			else
			{
				System.out.println("Number Between 5 and 8");	
			};
			
		}
		else if (iNumber == 5) {
			System.out.println("Number is 5");
		}
		else if (iNumber < 5) {
			System.out.println("Number Less Than 5");			
		}		
	}	
	
	private static void SwitchStatement()
	{
	      char grade = 'C';

	      switch(grade)
	      {
	         case 'A' :
	            System.out.println("Excellent!"); 
	            break;
	         case 'B' :
	         case 'C' :
	            System.out.println("Well done");
	            break;
	         case 'D' :
	            System.out.println("You passed");
	         case 'F' :
	            System.out.println("Better try again");
	            break;
	         default :
	            System.out.println("Invalid grade");
	      }
	      System.out.println("Your grade is " + grade);
	}
}
