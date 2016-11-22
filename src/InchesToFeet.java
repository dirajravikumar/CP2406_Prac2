public class InchesToFeet {
    public static void main(String[] args)
    {
        int inches = 86, feet, inch;

        feet = inches / 12;
        inch = inches % 12;

        System.out.println("The result for inches to feet is " + feet + "\'" + inch + ".");
    }

}
