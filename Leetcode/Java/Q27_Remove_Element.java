Here's your code with added comments for better understanding:  

```java
class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // Pointer to track the position of non-val elements

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is not equal to val, keep it in the array
            if (nums[i] != val) {
                nums[k] = nums[i]; // Move the non-val element to index k
                k++; // Increment k to store the next non-val element
            }
        }

        // k represents the count of elements not equal to val
        return k;
    }
}
```

### **Explanation**
1. **Initialize `k = 0`**:  
   - `k` keeps track of the position where non-`val` elements should be placed.

2. **Loop through `nums`**:  
   - If `nums[i] != val`, copy `nums[i]` to `nums[k]`.
   - Increment `k` to move to the next available position.

3. **Return `k`**:  
   - The first `k` elements in `nums` will be the elements that are **not** equal to `val`.
   - The remaining elements in `nums` are irrelevant and can be ignored.

### **Time & Space Complexity**
- **Time Complexity**: \(O(n)\) → Single loop through `nums`.
- **Space Complexity**: \(O(1)\) → Modifies `nums` in place without extra memory.

This is an efficient and clean approach using the **two-pointer technique**.
