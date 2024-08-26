import java.util.Scanner;

public class IT24101142Lab5Q1 
{
	public static void main (String[]args)
	{
		int no1,no2,no3;
		
		Scanner input= new Scanner(System.in);
		
		System.out.print("Enter the first integer: ");
		no1=input.nextInt();
		
		System.out.print("Enter the second integer: ");
		no2=input.nextInt();
		 
		System.out.print("Enter the third integer: ");
		no3=input.nextInt();
		
     	System.out.print("User entered numbers are ");
     	System.out.println(no1 + " " + no2 + " " + no3);
     	
		 
		if(no1>no2 && no1>no3) {
		System.out.println("The largest number is "+no1);
		}
		else if (no2>no1 && no2>no3) {
			System.out.println("The largest number is "+no2);
		}
		else {
			System.out.println("The largest number is "+no3);
		}
	
		
		if(no1<no2 && no1<no3) {
		    System.out.println("The smallest number is "+no1);
		}
		else if (no2<no1 &&no2<no3) {
		    System.out.println("The smallest number is "+no2);
		}
		else{
		    System.out.println("The smallest number is "+no3);
		}
		
		
		
		
		
	
	}
}