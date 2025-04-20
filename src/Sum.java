public class Sum
{
    public static void main(String[] args)
    {
        int[][] array = {{4, 4, 5, 6, 3, 1},
                {14, 2, 5, 4, 8, 2},
                {45, 12, 13, 5, 2, 1}};

    }

    // Returns the sum of row row in 2D array array
    public static int sumRow(int[][] array, int row)
    {
        int sum = 0;

        for (int col = 0; col < array[row].length; col++) {
            sum += array[row][col];
        }

        return sum;
    }

    // Returns the sum of all elements in array
    public static int sumArray(int[][] array)
    {
        int total = 0;

        for (int row = 0; row < array.length; row++) {
            total += sumRow(array, row);
        }

        return total;
    }
}
