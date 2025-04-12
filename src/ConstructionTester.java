import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the sales tax rate: ");
        double taxRate = input.nextDouble();

        System.out.println("How many boards do you need? ");
        int lumber = input.nextInt();

        System.out.println("How many windows do you need? ");
        int windows = input.nextInt();

        Construction c = new Construction(8, 11, taxRate);

        double total = c.lumberCost(lumber) + c.windowCost(windows);
        System.out.println("Total: " + total);

        double grandTotal = c.grandTotal(total);
        System.out.println("Grand Total: " + grandTotal);
    }
}