import java.util.Scanner;

public class MultiplicationTable
{
    public static void main(String[] args) {
       // program for time table using scanner and do while method
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter any number for timetable");  // user will be asked for number for timetable
    int a = scanner.nextInt();
    System.out.println("Enter the ending number for timetable");   // user will be asked for end no. for timetable
    int b = scanner.nextInt();
    int i = 1;

    do
        {

        System.out.println(+a + "x" + i + "=" + a * i);  // display time table
        i++;
    }
    while(i <= b);
}


}