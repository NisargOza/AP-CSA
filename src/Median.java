import java.util.Scanner;

public class Median {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first integer: ");
        int firstInt = scanner.nextInt();
        System.out.println("Enter the second integer: ");
        int secondInt = scanner.nextInt();
        System.out.println("Enter the third integer: ");
        int thirdInt = scanner.nextInt();

        int median;

        if(firstInt > thirdInt && firstInt < secondInt || firstInt < thirdInt && firstInt > secondInt) {
            median = firstInt;
        }
        else if(secondInt > firstInt && secondInt < thirdInt || secondInt < firstInt && secondInt > thirdInt) {
            median = secondInt;
        }
        else {
            median = thirdInt;
        }
        System.out.println("The median is " + median);
    }
}
