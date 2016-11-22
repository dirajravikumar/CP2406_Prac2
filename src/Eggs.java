import java.util.Scanner;

public class Eggs {
    public static void main(String[] args){

        Scanner EC = new Scanner(System.in);

        int eggs, dozen, loose;
        double price_dozen, price_loose, total;

        System.out.println("Enter the number of eggs purchased: ");
        eggs = EC.nextInt();

        dozen = eggs / 12;
        loose = eggs % 12;
        price_dozen = dozen * 3.25;
        price_loose = loose * 0.45;
        total = (price_dozen + price_loose);


        System.out.println("You ordered " + eggs + " eggs. That\'s " + dozen + " dozen at $3.25 per dozen and " + loose + " loose eggs at 45c each for a total of $" + total + ".");

    }
}