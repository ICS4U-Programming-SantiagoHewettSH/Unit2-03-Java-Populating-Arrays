import java.util.Arrays;

/**
 * This program generates 50 random integers (10 per line for 5 lines)
 * with values between 1 and 100. It then sorts the integers in ascending order
 * and calculates the average.
 *
 * @author Santiago Hewett
 * @version 1.0
 * @since 2025/03/22
 */

final class PopulatingArrays {

    /**
     * The number of integers per line.
     */
    public static final int MAX_ARRAY = 10;

    /**
     * The number of lines of integers to generate.
     */
    public static final int LINES = 5;

    /**
     * The maximum value for random integers.
     */
    public static final int MAX_VALUE = 100;

    /**
     * Private constructor to prevent instantiation of this utility class.
     */
    private PopulatingArrays() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * The main method that runs the program.
     *
     * @param args Unused.
     */
    public static void main(final String[] args) {
        // Generate and process 5 lines of random integers
        for (int line = 0; line < LINES; line++) {
            // Generate an array of random integers
            int[] arrayRandInts = populatingArrays();

            // Calculate the sum of all numbers in the array
            int sum = Arrays.stream(arrayRandInts).sum();

            // Calculate the average
            double average = (double) sum / MAX_ARRAY;

            // Print the unsorted array
            System.out.print("Unsorted array: ");
            printArray(arrayRandInts);

            // Sort the array
            Arrays.sort(arrayRandInts);

            // Print the sorted array
            System.out.print("Sorted array: ");
            printArray(arrayRandInts);

            // Print the average
            System.out.printf("Average: %.2f%n%n", average);
        }
    }

    /**
     * Generates an array of random integers.
     *
     * @return An array of random integers.
     */
    public static int[] populatingArrays() {
        int[] arrayRandInts = new int[MAX_ARRAY];

        // Populate the array with random integers between 1 and MAX_VALUE
        for (int index = 0; index < MAX_ARRAY; index++) {
            arrayRandInts[index] = (int) (Math.random() * MAX_VALUE) + 1;
        }
        return arrayRandInts;
    }

    /**
     * Prints an array of integers in a single line.
     *
     * @param array The array to print.
     */
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
