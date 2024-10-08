import java.util.*;

public class Q54_Spiral_Matrix {
    
    public static List<Integer> sol(int[][] matrix) {
        List<Integer> l = new ArrayList<>();
        // Return an empty list if the matrix is empty
        if(matrix.length == 0) return l;

        int n = matrix.length;    // Number of rows
        int m = matrix[0].length; // Number of columns

        // Initialize boundaries for traversal
        int startRow = 0;
        int endRow = n - 1;
        int startCol = 0;
        int endCol = m - 1;

        // Continue looping as long as we have rows and columns left to traverse
        while (startRow <= endRow && startCol <= endCol) {
            // Traverse from left to right across the top row
            for (int j = startCol; j <= endCol; j++) {
                l.add(matrix[startRow][j]);
            }
            // Traverse down the rightmost column
            for (int i = startRow + 1; i <= endRow; i++) {
                l.add(matrix[i][endCol]);
            }
            // Traverse from right to left across the bottom row, if it is a new row
            if (startRow < endRow) {
                for (int j = endCol - 1; j >= startCol; j--) {
                    l.add(matrix[endRow][j]);
                }
            }
            // Traverse up the leftmost column, if it is a new column
            if (startCol < endCol) {
                for (int i = endRow - 1; i > startRow; i--) {
                    l.add(matrix[i][startCol]);
                }
            }

            // Shrink the boundaries to move inward for the next loop
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        return l;
    }
    
    public static void main(String[] args) {
        // Example matrix
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        // Call the solution function
        List<Integer> result = sol(matrix);
        // Print the result, expected output: [1, 2, 3, 6, 9, 8, 7, 4, 5]
        System.out.println(result);
    }   
}
