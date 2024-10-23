public static String solution(String number, char digit) {
    String res = "";
    int n = number.length();

    // Traverse the string and find the position where removing the character maximizes the result
    for (int i = 0; i < n; i++) {
        if (number.charAt(i) == digit) {
            // Create a potential result by removing the character at index i
            String x = number.substring(0, i) + number.substring(i + 1);
            // Compare the potential result with the current best result
            if (x.compareTo(res) > 0) {
                res = x;
            }
        }
    }
    
    return res;
}
