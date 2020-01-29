import java.util.Scanner;

public class ArmstrongNumber {
      // armstrong number program suing for loop and scanner method
    public static void main(String[] args) {

        int num, number,temp,total = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any 3 digit number");   // user need to enter 3digit number
        num = scanner.nextInt();   // reads user input value
        scanner.close();
        number = num;

        for (; number!=0; number/=10)     //sorting the element
        {
            temp = number % 10;
            total = total + temp*temp*temp;
        }
        if (total == num) {
            System.out.println(num + "is an Armstrong number");   //display if number is an armstrong
        } else {
            System.out.println(num + " is not an Armstrong number");   // display if number is not an armstrong

        }
    }
}