class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // Initialize row and column pointers to start at the top-left corner of the matrix
        int row = 0;
        int col = 0;

        // Continue searching while row and column pointers are within the bounds of the matrix
        while (row < matrix.length && col < matrix[0].length) {
            // If the current element equals the target, return true
            if (matrix[row][col] == target) {
                return true;
            }

            // If the target is greater than the current element, move down to the next row
            else if (target > matrix[row][col]) {
                if (row < matrix.length - 1) {
                    row++;
                } 
                // If at the last row, move right to the next column
                else {
                    col++;
                }
            }

            // If the target is less than the current element, move up to the previous row
            else {
                if (row > 0) {
                    row--;
                }
                // Move right to the next column if possible
                if (col < matrix[0].length) {
                    col++;
                }                
            }
        }
        
        // If the loop completes without finding the target, return false
        return false;
    }
}
