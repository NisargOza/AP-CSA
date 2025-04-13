import java.util.Scanner;

public class DivisorDividend
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int number1 = scanner.nextInt();

        System.out.println("Enter your second number: ");
        int number2 = scanner.nextInt();

        double sum = (double)(number1 + number2);

        System.out.println(sum);

    }
}
