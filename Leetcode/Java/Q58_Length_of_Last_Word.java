class Solution {
    public int lengthOfLastWord(String s) {
        // Replace multiple spaces with a single space
        s = s.replaceAll("\\s+", " ");
        
        // Split the string into an array of words using space as the delimiter
        String strArray[] = s.split(" ");
        
        // Return the length of the last word in the array
        // strArray[strArray.length-1] accesses the last element of the array
        // .length() gets the length of that last word
        return strArray[strArray.length-1].length();
    }
}
