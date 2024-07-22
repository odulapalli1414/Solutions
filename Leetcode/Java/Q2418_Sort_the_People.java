import java.util.*;

public class Solution {
    // Method to sort people based on their heights in descending order
    public String[] sortPeople(String[] names, int[] heights) {
        // List to hold pairs of names and heights
        List<Pair> people = new ArrayList<>();
        
        // Populate the list with pairs
        for(int i = 0; i < names.length; i++) {
            people.add(new Pair(names[i], heights[i]));
        }

        // Sort the list based on heights in descending order
        Collections.sort(people, (a, b) -> b.height - a.height);

        // List to hold the sorted names
        List<String> res = new ArrayList<>();
        
        // Extract names from the sorted list
        for(Pair person : people) {
            res.add(person.name);
        }
        
        // Convert the list of names to an array and return
        return res.toArray(new String[0]);
    }

    // Inner class to represent a pair of name and height
    public class Pair {
        String name;
        int height;
        
        // Constructor to initialize the pair
        public Pair(String name, int height) {
            this.name = name;
            this.height = height;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Example 1
        String[] names1 = {"Mary", "John", "Emma"};
        int[] heights1 = {180, 165, 170};
        System.out.println(Arrays.toString(solution.sortPeople(names1, heights1))); // Output: [Mary, Emma, John]

        // Example 2
        String[] names2 = {"Alice", "Bob", "Bob"};
        int[] heights2 = {155, 185, 150};
        System.out.println(Arrays.toString(solution.sortPeople(names2, heights2))); // Output: [Bob, Alice, Bob]
    }
}
