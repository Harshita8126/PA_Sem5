package SlidingWindow;

public class MaxSubarraySum {
    public static int maxSum(int[] arr, int k) {
        // first window sum is calculated
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        // sliding the window
        int maxSum = windowSum;
        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i];
            windowSum -= arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 1, 5, 1, 3, 2 };
        int k = 3;
        System.out.println(maxSum(arr, k));
    }
}