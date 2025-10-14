class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int n = nums.size();

        // Loop through each possible starting point of the first subarray
        for (int i = 0; i + 2 * k <= n; i++) {

            // Check first subarray [i .. i+k-1]
            boolean firstIncreasing = true;
            for (int j = i; j < i + k - 1; j++) {
                if (nums.get(j) >= nums.get(j + 1)) {
                    firstIncreasing = false;
                    break;
                }
            }

            if (!firstIncreasing) continue;

            // Check next adjacent subarray [i+k .. i+2k-1]
            boolean secondIncreasing = true;
            for (int j = i + k; j < i + 2 * k - 1; j++) {
                if (nums.get(j) >= nums.get(j + 1)) {
                    secondIncreasing = false;
                    break;
                }
            }

            if (secondIncreasing) return true;
        }

        return false;
    }
}