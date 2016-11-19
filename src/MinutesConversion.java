import java.util.Scanner;

public class MinutesConversion {
    public static void main(String[] args){

        Scanner MC = new Scanner(System.in);

        int minutes;
        double days, hours;

        System.out.println("Enter the minutes: ");
        minutes = MC.nextInt();

        hours = minutes / 60;
        days = minutes / 1440;

        System.out.println(minutes + " minutes equals " + hours + " and equals to " + days + " days.");
    }
}
