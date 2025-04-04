public class TreeOfStars
{
    public static void main(String[] args)
    {
        // Call makeATree
        makeATree();
    }
    public static void makeATree()
    {
        int distanceFromConsole = 0;

        for(int i = 1; i<=9; i++) {
            for(int x = 1; x<=distanceFromConsole; x++) {
                System.out.print(" ");
            }
            for(int inner = 9; inner >= i; inner--) {
                System.out.print("*" + " ");
            }
            System.out.println();
            distanceFromConsole++;
        }
    }
}