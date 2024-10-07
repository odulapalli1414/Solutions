public class Q28_Find_the_Index_of_the_First_Occurrence_in_a_String {

    // Method to find the first occurrence of 'needle' in 'haystack'
    public static int sol(String haystack, String needle){
        int ph = 0; // Pointer for haystack
        int pn = 0; // Pointer for needle

        int temp = ph; // Stores the current position in haystack to reset later if mismatch occurs

        // Loop until either haystack or needle is fully traversed
        while(ph < haystack.length() && pn < needle.length()) {
            
            // If characters at both pointers match
            if(haystack.charAt(ph) == needle.charAt(pn)) {
                // If it's the last character of needle, return the starting index
                if(pn == needle.length() - 1) {
                    return ph - pn;
                } else {
                    // Move both pointers forward if it's not the last character
                    ph++;
                    pn++;
                }
            } else {
                // Reset needle pointer to 0 and adjust haystack pointer
                pn = 0;
                ph = 0;
                ph += temp + 1; // Increment haystack pointer to search from the next character
                temp = ph; // Update temp with the new start position
            }
        }
        // If no match found, return -1
        return -1;
    }
    
    // Main method to test the solution
    public static void main(String[] args) {
        String hayStack = "mississippi"; // Example haystack
        String needle = "issip"; // Example needle

        // Output the index of the first occurrence of needle in haystack
        System.out.println(sol(hayStack, needle));
    }
}
