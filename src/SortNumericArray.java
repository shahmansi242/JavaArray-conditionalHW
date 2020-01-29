import java.util.Scanner;

public class SortNumericArray {
    // sorting numbric array using scanner method
    public static void main(String[] args) {
        int n, temp;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number for array");  // user will be asked to enter number for array
        n = scanner.nextInt();   // reads user input value
        int a[] = new int[n];
        System.out.println("Enter the number");    // number for array
        for (int i = 0; i < n; i++)        // sorting the elements
        {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)     // // sorting  the elements
            {
                if (a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Ascending Order");   // array number sorted in ascending order
        for (int i = 0; i < n-1; i++)
        {
            System.out.println(a[i] );
        }
        System.out.println(a[n-1]);
    }
}
