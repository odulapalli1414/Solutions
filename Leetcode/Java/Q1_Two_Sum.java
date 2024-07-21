import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // This commented out section is a brute-force approach with O(n^2) time complexity
        // for(int i=0;i<nums.length; i++){
        //     for(int j=i+1; j<nums.length; j++){
        //         if(nums[i] + nums[j] == target){
        //             return new int[]{i, j};
        //         }
        //     }
        // }
        // return new int[]{};

        // Create a hashmap to store the numbers and their indices
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Iterate through the array
        for(int i = 0; i < nums.length; i++){
            // Calculate the complement of the current number
            int complement = target - nums[i];

            // Check if the complement is already in the map
            if(map.containsKey(complement)){
                // If found, return the indices of the complement and the current number
                return new int[]{map.get(complement), i};
            }
            // Otherwise, add the current number and its index to the map
            map.put(nums[i], i);
        }
        // If no solution is found, return an empty array
        return new int[]{};
    }
}
