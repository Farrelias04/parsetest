import java.time.Period;
import java.util.Scanner;

public class ParseTest
{
    public static void main(String[] args)
    {
        Scanner inputDevice = new Scanner(System.in);

        System.out.println("Enter the years");
        String year = inputDevice.nextLine();

        System.out.println("Enter the months");
        String month = inputDevice.nextLine();

        System.out.println("Enter the days");
        String day = inputDevice.nextLine();

        String time = "P" + year + "Y" + month + "M" + day + "D";

        Period p = Period.parse(time);
        System.out.println("The time is: ");
        System.out.println(p.getYears() + " Years\n" + p.getMonths() + " Months\n" + p.getDays() + " Days\n");
    }
}
