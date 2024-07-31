class Solution {
    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        int totalLength = len1 + len2;

        // Merge the two sorted arrays
        int[] mergedArray = new int[totalLength];
        int i = 0, j = 0, k = 0;

        while (i < len1 && j < len2) {
            if (arr1[i] < arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }

        // Copy remaining elements from arr1 if any
        while (i < len1) {
            mergedArray[k++] = arr1[i++];
        }

        // Copy remaining elements from arr2 if any
        while (j < len2) {
            mergedArray[k++] = arr2[j++];
        }

        // Find the median from the merged sorted array
        return findMedian(mergedArray);
    }

    // Helper method to find the median of a sorted array
    private double findMedian(int[] arr) {
        int n = arr.length;
        if (n % 2 == 0) {
            // If the length of the array is even, average the two middle elements
            return (arr[n / 2] + arr[n / 2 - 1]) / 2.0;
        } else {
            // If the length of the array is odd, return the middle element
            return arr[n / 2];
        }
    }
}
