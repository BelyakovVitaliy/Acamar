package cz.acamar.tasks;

import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {
        Arrays.stream(new Task2().squaresOfSortedArray(new int[]{-4, -1, 0, 3, 10}))
                .forEach(it -> System.out.print(it + " "));
    }

    /**
     * Task 2. Squares of a sorted array.
     * <p>
     * Given an integer array sorted in non-decreasing order,
     * return an array of the squares of each number sorted in non-decreasing order.
     * <p>
     * Example input: [-4,-1,0,3,10]
     * Expected output: [0,1,9,16,100]
     * <p>
     * Explanation: After squaring, the array becomes [16,1,0,9,100].
     * After sorting, it becomes [0,1,9,16,100].
     *
     * @param input - an integer array sorted in non-decreasing order
     * @return - an array of the squares of each number sorted in non-decreasing order
     */
    public int[] squaresOfSortedArray(int[] input) {
        if (input == null || input.length == 0) {
            return new int[0];
        }
        int startIdx = 0;
        int endIdx = input.length - 1;
        int i = endIdx;
        int[] result = new int[input.length];
        while (startIdx <= endIdx) {
            int startSqr = (int) Math.pow(input[startIdx], 2);
            int endSqr = (int) Math.pow(input[endIdx], 2);
            if (endSqr > startSqr) {
                result[i--] = endSqr;
                endIdx--;
            } else {
                result[i--] = startSqr;
                startIdx++;
            }
        }
        return result;
    }
}
