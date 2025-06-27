/* 
 * Problem Statement: https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/second-largest3735
 * 
 * Given an array of positive integers arr[], return the second largest element from the array. 
 * If the second largest element doesn't exist then return -1.
 * Note: The second largest element should not be equal to the largest element.
 * 
 */
class Solution {
    public int getSecondLargest(int[] arr) {
        int largest = Integer.max(arr[0], arr[1]);
        int secondlargest = Integer.min(arr[0], arr[1]);

        for (int i = 2; i < arr.length; i++) {
            if (largest < arr[i]) {
                secondlargest = largest;
                largest = arr[i];
            } else if (secondlargest < arr[i] && largest != arr[i]) {
                secondlargest = arr[i];
            }
        }

        return largest == secondlargest ? -1 : secondlargest;
    }
}