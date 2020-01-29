import java.util.Scanner;

public class SpecificValue
{       // program for specific value contains in array
    public static void main(String[] args)
    {
        int[] num = {1, 2, 3, 4, 5 };     // array integer
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a number:");
        int n = scanner.nextInt();
        int len = num.length;

        for (int i = 0; i < len; i++)    // sorting the elements
        {
            if (n == num[i])
            {
                System.out.println("number exists in array" + n);   // display existing number in array
            }
            else
                {
                    System.out.println("Number doesn't exists in array");   //display doesn't exists in array
                }
        }

    }

}
