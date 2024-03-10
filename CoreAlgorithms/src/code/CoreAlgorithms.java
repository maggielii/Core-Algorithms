package code;

import java.util.Scanner;

public class CoreAlgorithms {

	public static void main(String[] args) {
		
		/*write a program that prompts the user to enter a number until they enter a negative number
		 after this program will print sum of all non-negative numbers
		 after this the program will print the average of all the non negative numbers*/
		
		Scanner input = new Scanner(System.in);
		
		int number = 0;	
		int sum = 0, count = 0;
		
		/*
		while(number >= 0); //not as good because if number starts negative it won't work
		{
			System.out.print("Enter a number: ");
			number = input.nextInt();
		}
		*/
		
		/*
		for(int x = 0; x<2; x++)
		{
			System.out.print("Enter a number: ");
			number = input.nextInt();
			if(number < 0)
				x = 5;
			else 
				x = 0;
		}
		*/
		
		/*
		for(number = 0; number >= 0;) //no incrementer because change happens inside the loop
		{
			System.out.print("Enter a number: ");
			number = input.nextInt();
		}
		*/
		
		do
		{
			
			sum += number; //checks during next loop
			System.out.print("Enter a number: ");
			number = input.nextInt();
			count++;
			
			/*
			if(number > 0)
				sum += number; //not as good because has to check every time
			*/
			
		}while(number >= 0);		
		count--; //don't count last loop
		
		/*
		sum -= number; //not as good because other one does anyways but better than if
		*/
		
		//int/double=double double/int=double int/int=int so can change one variable to double
		
		System.out.println("The sum is: " + sum);
		System.out.println("The average is: " + (double)sum/count); //casting or do 1.0*______ double*int=double
		
	}
	
}