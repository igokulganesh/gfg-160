/* 
 * 
 * Problem: https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/move-all-zeroes-to-end-of-array0751
 * 
 * You are given an array arr[] of non-negative integers. 
 * Your task is to move all the zeros in the array to the right end 
 * while maintaining the relative order of the non-zero elements. 
 * The operation must be performed in place, meaning you should not use extra space for another array.
 * 
 */

class Solution {
    public void pushZerosToEnd(int[] arr) {
        int zeroIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[zeroIndex++] = arr[i];
            }
        }

        while (zeroIndex < arr.length) {
            arr[zeroIndex++] = 0;
        }
    }
}