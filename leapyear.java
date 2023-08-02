// The line below import the relevant scanner class
import java.util.Scanner;

public class leapyear
{
    public static void main(String args[])
    {
        // First an object of the scanner class is created
        Scanner scan = new Scanner(System.in);

        // Here the user is asked to enter an integer (year)
        System.out.print("Enter the year of which you would like to check if it is a leap year: ");

        //Here the input of the user is taken in and saved in the integer variable num
        int num = scan.nextInt();

        //Here the scan object is closed again
        scan.close();

        //Here is checked for leapyears that are not a new century but are divisble by 4
        if (num % 4 == 0 && num % 100 != 0){
            System.out.println(num + " is a leapyear, \nit is divisible by 4 (and not a new century).");
        }
        
        //Here the remaining leapyears (the ones that are a new centuries) are confirmed
        else if (num % 400 == 0){
            System.out.println(num + " is a leapyear, \nit is a new century that is divisble by 400 (or the year 0).");
        }

        //The above two conditinals filter out all the leapyears, so when this conditional is reached no leapyears remain
        //and the user is notified of this fact.
        else {
            System.out.println(num + " is not a leapyear, \nit is not divisible by 4 or it is a new century that is not divisible by 400");
        }
    }
}