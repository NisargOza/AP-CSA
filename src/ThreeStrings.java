import java.util.Scanner;
public class ThreeStrings
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        String companyCode = "1298";

        System.out.println("Enter your password: ");
        String pswd = input.nextLine();

        System.out.println("Enter the company's secret code: ");
        String secCode = input.nextLine();

        if(secCode.equals(companyCode)) {
            System.out.println("Access granted");
        }
        else {
            System.out.println(pswd + secCode + " is denied");
        }


    }
}