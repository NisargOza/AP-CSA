import java.util.Scanner;

public class PickupWindow
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("1. Hamburger\n2. Cheeseburger\n3. Veggie Burger\n4. Nachos\n5. Hot Dog\n");

        System.out.println("Enter label: ");
        String customerOrder = input.nextLine();

        String customerNumber = customerOrder.substring(0,1);

        int num = Integer.valueOf(customerNumber);

        System.out.println("Customer ordered number " + num);
    }
}