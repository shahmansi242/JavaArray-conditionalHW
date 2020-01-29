import java.util.Scanner;

public class ReversNumber
{
    public static void main(String[] args)
    {    // revers the number using while loop
        int a, b = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");    // user will be asked to enter any number
        a = scanner.nextInt();   // reads user input value
        while (a != 0)       // sorting  the elements
        {
           b = b * 10;
            b = b + a % 10;
            a = a / 10;
        }
        System.out.println("Reverse of the number is " + b);    // display reverse number

    }
}
