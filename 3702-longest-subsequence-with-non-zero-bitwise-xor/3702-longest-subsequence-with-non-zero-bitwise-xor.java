class Solution {
    public int longestSubsequence(int[] nums) {
        int n = nums.length;

        int totalXor = 0;
        boolean hasNonZero = false;

        for (int x : nums) {
            totalXor ^= x;
            if (x != 0) {
                hasNonZero = true;
            }
        }

        // Whole array already has non-zero XOR
        if (totalXor != 0) {
            return n;
        }

        // All elements are zero
        if (!hasNonZero) {
            return 0;
        }

        // Total XOR is 0, but there is at least one non-zero element.
        // Remove one non-zero element.
        return n - 1;
    }
}