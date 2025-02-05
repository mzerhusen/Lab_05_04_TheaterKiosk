import java.util.Scanner;

public class TheaterKiosk
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        final int MINIMUM_AGE = 21;
        int userAge;
        String invalidInput;

        System.out.print("Please enter your age: ");
        if (input.hasNextInt())
        {
            userAge = input.nextInt();
            if(userAge >= MINIMUM_AGE)
            {
                System.out.println("You indicated you are " + userAge + "years old. Please get a paper wristband!");
            }
            else
            {
                System.out.println("You are not old enough for a wristband. Have a good night.");
            }
        }
        else
        {
            invalidInput = input.next();
            System.out.println("You have made an invalid entry, you entered " + invalidInput + ". Please restart the program and enter your age in years.");
        }
    }
}
