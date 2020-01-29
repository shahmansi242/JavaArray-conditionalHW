import java.util.Scanner;

public class SortStringArray
{
    public static void main(String[] args) {
        // sorting string array in order using scanner method
        int n;
        String temp;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of names for array");  // user will be asked for number for string array
        n = scanner.nextInt();     // reads user input value
        String names[] = new String[n];     //string array object
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter all names");     // user will be asked for string name
        for (int i = 0; i < n; i++)
        {
            names[i] = scanner1.nextLine();
        }
        scanner.close();
        scanner1.close();
        for (int i = 0; i < n; i++)       // sorting the elements
        {
            for (int j = i + 1; j < n; j++) {
                if (names[i].compareTo(names[j]) > 0)
                {
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
        System.out.println("Names in Sorted Order");   // string name sorted in alphabetical order
        for (int i = 0; i <= n - 1; i++)
        {
            System.out.println(names[i]);
        }


    }

}
