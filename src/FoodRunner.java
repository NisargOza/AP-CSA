import java.util.Scanner;

public class FoodRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Food hamburger = new Food("Hamburger", 600);
        System.out.println(hamburger);
        System.out.println("How many would you like?");
        int numOfBurgers = input.nextInt();

        Food frenchFries = new Food("French Fries", 350);
        System.out.println(frenchFries);
        System.out.println("How many would you like?");
        int numOfFries = input.nextInt();

        Food coke = new Food("Coke", 200);
        System.out.println(coke);
        System.out.println("How many would you like?");
        int numOfCoke = input.nextInt();

        int totalCalories = (hamburger.getCalories() * numOfBurgers) +
                (frenchFries.getCalories() * numOfFries) +
                (coke.getCalories() * numOfCoke);

        System.out.println("\nYour meal will have a total of " + totalCalories + " calories.");
    }
}
