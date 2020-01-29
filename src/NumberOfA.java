import java.util.Scanner;

public class NumberOfA {
        // number of 'a' in string using scanner method
    public static void main(String[] args)
    {
        String str = "";
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any sentence");        //user will be asked for sentence
        str = scanner.nextLine();
        for(int i = 0; i < str.length(); i++)        //sorting the element
        {
            switch (str.charAt(i))
            {
                case 'a':
                case 'A':
                    count++;
            }
        }
        System.out.println("Total number of a in the string :" + count);    // total number of 'a' in string

    }
}
