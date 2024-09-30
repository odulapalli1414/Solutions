public class ZigzagConversion {
    public static String convert(String s, int numRows) {
        // Edge case: If numRows is 1, return the input string
        if (numRows == 1) return s;

        // Create a list of StringBuilder to hold the characters for each row
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int currentRow = 0; // Start from the first row
        boolean goingDown = false; // To track if we are going down or up

        // Iterate over the characters in the string
        for (char c : s.toCharArray()) {
            // Add the current character to the appropriate row
            rows[currentRow].append(c);

            // If we're at the top or bottom row, reverse the direction
            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }

            // Move to the next row, either up or down
            currentRow += goingDown ? 1 : -1;
        }

        // Combine all rows into one string
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        // Test cases
        String s1 = "PAYPALISHIRING";
        int numRows1 = 3;
        System.out.println(convert(s1, numRows1)); // Output: "PAHNAPLSIIGYIR"

        String s2 = "PAYPALISHIRING";
        int numRows2 = 4;
        System.out.println(convert(s2, numRows2)); // Output: "PINALSIGYAHRPI"

        String s3 = "A";
        int numRows3 = 1;
        System.out.println(convert(s3, numRows3)); // Output: "A"
    }
}
