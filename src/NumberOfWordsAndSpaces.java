import java.util.Scanner;

public class NumberOfWordsAndSpaces {
      // number of words and spaces in string program using scanner method
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your sentence");         // user will be asked to enter any sentence
        String str = scanner.nextLine();                  // reads user input value
        int word = 1;

        for (int i = 0; i < str.length(); i++)            // sorting  the elements
        {
            if (str.charAt(i)==' ')
                word++;
        }
        System.out.println("Number of words:" + word);           // display no. of words in string
        System.out.println("Number of space:" + (word-1));         // display no. of space in string
    }

}
