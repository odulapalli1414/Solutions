// Solution 1
import java.util.HashMap;
import java.util.Map.Entry;

class Solution {
    public int majorityElement(int[] nums) {
        // Create a HashMap to store the frequency of each element in the array
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Iterate through the array and count the occurrences of each element
        for(int i = 0; i < nums.length; i++){
            // Use getOrDefault to handle the case where the key is not present in the map
            // Increment the value if the element already exists, otherwise initialize it to 1
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        // Iterate through the HashMap to find the element that appears more than n/2 times
        for(Entry<Integer, Integer> entry : map.entrySet()){
            // If an element's frequency is greater than half the length of the array, return it
            if(entry.getValue() > (nums.length / 2)){
                return entry.getKey();
            }
        }

        // In case no majority element is found, though the problem guarantees one exists
        // Return -1 as a fallback
        return -1;
    }
}


// Solution 2

class Solution {
    public int majorityElement(int[] nums) {
        // 'count' keeps track of the balance between the current candidate and other elements
        int count = 0;
        
        // 'curr' stores the current candidate for the majority element
        int curr = 0;

        // Iterate through each element in the array
        for(int num : nums){
            // If 'count' is zero, we assign 'curr' to the current element 'num' and reset count to 1
            if(count == 0){
                count = 1;
                curr = num;
            }
            else{
                // If the current element matches the candidate 'curr', increment 'count'
                if(num == curr){
                    count++;
                }
                // If it does not match, decrement 'count'
                else{
                    count--;
                }
            }
        }
        
        // Return the candidate 'curr', which will be the majority element
        return curr;
    }
}
