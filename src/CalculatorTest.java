import java.util.Scanner;

public class CalculatorTest
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two doubles");
        double firstDouble = input.nextDouble();
        double secondDouble = input.nextDouble();

        Calculator calc = new Calculator();

        double sum = calc.sum(firstDouble, secondDouble);
        System.out.println(firstDouble + " + " + secondDouble + " = " + sum);

        double subtract = calc.subtract(firstDouble, secondDouble);
        System.out.println(firstDouble + " - " + secondDouble + " = " + subtract);

        double multiply = calc.multiply(firstDouble, secondDouble);
        System.out.println(firstDouble + " * " + secondDouble + " = " + multiply);

        double divide = calc.divide(firstDouble, secondDouble);
        System.out.println(firstDouble + " / " + secondDouble + " = " + divide);
    }
}