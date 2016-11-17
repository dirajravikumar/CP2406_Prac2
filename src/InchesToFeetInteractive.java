import java.util.Scanner;

public class InchesToFeetInteractive {
    public static void main(String[] args)
    {
        Scanner ITIF = new Scanner(System.in);
        float inches, result;
        System.out.println("Enter inches for height: ");
        inches = ITIF.nextFloat();

        result = inches / 12;

        System.out.println("The result for inches to feet is " + result);
    }

}
