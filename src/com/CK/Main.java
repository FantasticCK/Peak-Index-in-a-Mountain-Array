package com.CK;

public class Main {

    public static void main(String[] args) {
        // write your code here
    }
}

class Solution {
    public int peakIndexInMountainArray(int[] A) {
        if (A.length == 0) return -1;

        int left = 0, right = A.length - 1;
        while (left + 1 < right) {
            int mid = (left + right) / 2;
            int midVal = A[mid];
            if (midVal > A[mid - 1] && midVal > A[mid + 1]) {
                return mid;
            } else if (A[mid - 1] <= midVal && midVal <= A[mid + 1])
                left = mid;
            else
                right = mid;
        }

        return A[left] > A[right] ? left : right;
    }
}