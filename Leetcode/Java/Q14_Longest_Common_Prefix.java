class Solution {

    // Node class to represent each node in the Trie
    public class Node {
        // Array to store child nodes (for 'a' to 'z', indexed 0 to 25)
        Node children[] = new Node[26];
        // Boolean flag to indicate if the node marks the end of a word
        boolean eow = false;

        // Constructor to initialize the children array
        Node() {
            for(int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    // Root node of the Trie
    public Node root = new Node();

    // Method to insert a word into the Trie
    public void insert(String word) {
        Node curr = root;
        // Loop through each character of the word
        for(int level = 0; level < word.length(); level++) {
            // Convert character to index (0 for 'a', 1 for 'b', ..., 25 for 'z')
            int idx = word.charAt(level) - 'a';
            // If no node exists at this index, create a new node
            if(curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            // Move to the next node
            curr = curr.children[idx];
        }
        // Mark the current node as the end of the word
        curr.eow = true;
    }

    // Method to find the longest common prefix
    public String longestCommonPrefix(String[] words) {
        // If the input array is null or empty, return an empty string
        if (words == null || words.length == 0) {
            return "";
        }

        // Insert each word into the Trie
        for(String word : words) {
            insert(word);
        }

        // StringBuilder to accumulate the longest common prefix
        StringBuilder lcp = new StringBuilder();
        Node curr = root;

        // Traverse the Trie to find the common prefix
        while(true) {
            int childCount = 0;      // Count of non-null child nodes
            int nextCharindx = -1;   // Index of the next character to add to the prefix

            // Check each child node (from 'a' to 'z')
            for(int i = 0; i < 26; i++) {
                if(curr.children[i] != null) {
                    childCount++;    // Increment the child count if a child node exists
                    nextCharindx = i; // Store the index of this child
                }
            }

            // If there are more than one child or the current node marks the end of a word, stop
            if(childCount != 1 || curr.eow) {
                break;
            }

            // Append the next character (based on nextCharindx) to the prefix
            lcp.append((char) (nextCharindx + 'a'));

            // Move to the next node
            curr = curr.children[nextCharindx];
        }
        // Return the longest common prefix as a string
        return lcp.toString();
    }
}
