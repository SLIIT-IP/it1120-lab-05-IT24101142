
import java.util.Scanner;
public class IT24101142Lab5Q3{

public static final double ROOM_CHARGE_PER_DAY = 48000;
	public static final int DISCOUNT_10 = 10;
	public static final int DISCOUNT_20 = 20;
	public static final int MIN_DATE = 1;
	public static final int MAX_DATE = 31;
	

public static void main(String[]args){
Scanner input=new Scanner(System.in);


System.out.println("Enter Start Day(1-31):");
int startDate=input.nextInt();

System.out.println("Enter End Day(1-31)	:");
int endDate=input.nextInt();

double total;
int noOfDates;


 if (startDate < MIN_DATE || startDate > MAX_DATE || endDate < MIN_DATE || endDate > MAX_DATE)
	{System.out.println("Error: Days must be between 1 and 31");} 
else if (startDate >= endDate)
	{System.out.println("Error: Start Date must be less than the End Date");} 

else {      noOfDates = endDate - startDate;

            System.out.println("Room Charge Per Day: Rs. 48000.0/=");
            System.out.println("Number of Days Reserved: " + noOfDates);

            if (noOfDates < 3) {
                total = ROOM_CHARGE_PER_DAY * noOfDates;
            } else if (noOfDates >= 3 && noOfDates <= 4) {
                total = ROOM_CHARGE_PER_DAY * noOfDates * (1 - DISCOUNT_10 / 100.0);
            } else {
                total = ROOM_CHARGE_PER_DAY * noOfDates * (1 - DISCOUNT_20 / 100.0);
            }

            System.out.printf("Total Charge: Rs. %.2f%n", total);
        }

        input.close();
    }
}
