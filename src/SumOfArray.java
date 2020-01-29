import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        // total for array number using scanner method
        int n, sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no. for array");      //user will be asked  number for array
        n = scanner.nextInt();         // reads user input value
        int a[] = new int[n];       //integer array object
        System.out.println("Enter all the numbers");      //number sorted in an array
        for (int i = 0; i < n; i++)       // sorting  the elements
        {
            a[i] = scanner.nextInt();
            sum = sum + a[i];         // sum of array
        }
        System.out.println("sum of the array: " + sum);    // display total of array

    }
}