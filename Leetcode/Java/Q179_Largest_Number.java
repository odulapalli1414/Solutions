import java.util.*;

class Solution {
    public String largestNumber(int[] nums) {
        // Create an array of strings to hold the string representation of each number in nums.
        String[] stringNums = new String[nums.length];
        
        // Convert each integer in the input array to its string equivalent.
        for (int i = 0; i < stringNums.length; i++) {
            stringNums[i] = String.valueOf(nums[i]);
        }

        // Sorting the array of strings based on custom comparator logic.
        // The Comparator compares two strings by concatenating them in both possible orders
        // and then returning the order that creates a larger concatenated value.
        Arrays.sort(stringNums, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                // Concatenate strings a + b and b + a
                String order1 = a + b;
                String order2 = b + a;

                // Return the result of comparing the two concatenated strings.
                // We use order2.compareTo(order1) to sort in descending order.
                return order2.compareTo(order1);
            }
        });

        // If the largest number (first element after sorting) is "0", return "0".
        // This handles cases where all numbers are zeros (e.g., [0, 0]).
        if (stringNums[0].equals("0")) {
            return "0";
        }

        // Build the final largest number by appending all sorted strings.
        StringBuilder largestNum = new StringBuilder();
        for (String stringNum : stringNums) {
            largestNum.append(stringNum);
        }

        // Convert StringBuilder to String and return the result.
        return largestNum.toString();
    }
}
