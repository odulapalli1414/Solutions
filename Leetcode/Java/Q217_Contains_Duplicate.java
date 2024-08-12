class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Create a HashMap to store the count of each element in the array
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Iterate over the array elements
        for(int i = 0; i < nums.length; i++) {
            // Check if the current element is already in the map
            if(!map.containsKey(nums[i])) {
                // If not, add the element to the map with a count of 1
                map.put(nums[i], 1);
            }
            else {
                // If the element is already in the map, it means there's a duplicate
                return true;
            }
        }
        
        // If no duplicates are found, return false
        return false;
    }
}
