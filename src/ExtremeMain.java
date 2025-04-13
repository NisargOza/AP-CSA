import java.util.Scanner;
import java.lang.*;

public class ExtremeMain
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("What do you think the maximum integer value is? ");
        int maxInt = input.nextInt();
        Extremes newInt = new Extremes();

        Integer newVar = newInt.maxQuotient(maxInt);

        System.out.println("You'd need to  multiply your number by " + newVar + " to reach the max value!");

        System.out.println("What do you think the minimum integer value is? ");
        int minInt = input.nextInt();

        Extremes newInt2 = new Extremes();

        Integer newVar2 = newInt2.minQuotient(minInt);

        System.out.println("You'd need to multiply your number by " + newVar2 + " to reach the min value!");


    }
}