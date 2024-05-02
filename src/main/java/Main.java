import java.util.Arrays; // Import the Arrays class from the java.util package

/**
 * @author Himal Shrestha
 * Prof: Alrajab
 * Class: Data Structures and Algorithims
 * Extra Credit 2
 */
public class Main { // Define a class named Main
    public static double findRatio(int[] nums) { // Define a method named findRatio which takes an integer array nums as input and returns a double value
        Arrays.sort(nums); // Sort the array in ascending order
        int n = nums.length; // Get the length of the array

        // Calculate the sum of the largest two numbers
        int sumLargest = nums[n - 1] + nums[n - 2]; // Sum the last two elements of the sorted array

        // Calculate the sum of the smallest two numbers
        int sumSmallest = nums[0] + nums[1]; // Sum the first two elements of the sorted array

        // Return the ratio of the sums of the largest two numbers to the sums of the smallest two numbers
        return (double) sumLargest / sumSmallest; // Convert the result to double and return
    }

    public static void main(String[] args) { // Define the main method
        int[] a = {3, 5, 12, 450, 1, 1, 5, 6, 23, 6, 8, 9, 321, 2, 3}; // Define an integer array named a
        double ratio = findRatio(a); // Call the findRatio method with array a as input and store the result in the variable ratio
        System.out.println("Ratio: " + ratio); // Print the value of ratio to the console
    }
}
