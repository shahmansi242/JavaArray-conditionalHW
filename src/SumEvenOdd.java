import java.util.Scanner;

public class SumEvenOdd {
    public static void main(String[] args) {
        // total for even and odd number array using scanner method
        int n, sumE = 0, sumO = 0;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the number for array.");   //user will be asked  number for array
        n = scanner.nextInt();         // reads user input value
        int []a = new int[n];       // integer array object
        System.out.println("Enter the number.");     //number sorted in an array
        for (int i = 0; i < n; i++)
        {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++)         //sorting the element
        {
            if (a[i] % 2 == 0)
            {
                sumE = sumE + a[i];     // sum of even number
            } else
                {
                    sumO = sumO + a[i];     // sum of odd number
                }
        }
        System.out.println("Sum of Even Numbers:" + sumE);  // display total of even numbers
        System.out.println("Sum of Odd Numbers:" + sumO);   // display total of odd numbers

    }
}
