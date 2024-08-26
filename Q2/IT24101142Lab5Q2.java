import java.util.Scanner;
public class IT24101142Lab5Q2
{
    public static void main(String[]args)
    {
    int memberCount;
    Scanner input=new Scanner(System.in);
    
     System.out.print("Enter the number of new members introduced: ");
     memberCount=input.nextInt();
     
     switch(memberCount)
     {
         case 1: System.out.println("Prize is a : Pen");
         break;
         
         case 2:System.out.println("Prize is a : Umbrella");
         break;
         
         case 3:System.out.println("Prize is a : bag");
         break;
         
         case 4:System.out.println("Prize is a: Travelling Chair");
         break;
         
         default:
         if (memberCount>=5) {
             System.out.println("Prize is a :Headphone");
         }
     }
         
     
    }
}