import java.util.Scanner;

public class InchesToFeetInteractive {
    public static void main(String[] args)
    {
        Scanner ITIF = new Scanner(System.in);
        int inches, feet, inch;
        System.out.println("Enter inches for height: ");
        inches = ITIF.nextInt();

        feet = inches / 12;
        inch = inches % 12;

        System.out.println("The result for inches to feet is " + feet + "\'" + inch + ".");
    }

}
