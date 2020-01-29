import java.util.Scanner;

public class FibonacciNumber {

    public static void main(String[] args) {
        // program for fibonacci number (1 1 2 3 5 8 13 21) using scanner method and while loop
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");   // user will be asked for how many fibonacci number they wont
        int n = scanner.nextInt();      // reads user input value
        int  first=0, second=1,next ;
        System.out.println("Fibonacci number is");
        int i = 0;

        while (i < n  )         //sorting the element
        {
            if (i <= 1)
                next = i;
            else
                {
                    next = first + second;
                    first = second;
                    second = next;
                }
            System.out.println(next);    // display fibonacci number Ex.(1 1 2 3 5 8 13 21...)
            i++;
        }
    }
}
