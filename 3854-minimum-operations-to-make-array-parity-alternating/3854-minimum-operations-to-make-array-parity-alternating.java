import java.util.Arrays;

class Solution {
    public int[] makeParityAlternating(int[] nums) {
        int n = nums.length;
        if (n <= 1) {
            return new int[]{0, 0};
        }
        
        // Count operations required for both valid alternating patterns
        // ops0: Pattern starting with Even (0, 1, 0, 1...)
        // ops1: Pattern starting with Odd (1, 0, 1, 0...)
        int ops0 = 0, ops1 = 0;
        for (int i = 0; i < n; i++) {
            int parity = Math.abs(nums[i] % 2);
            if (parity != (i % 2)) ops0++;
            if (parity != ((i + 1) % 2)) ops1++;
        }
        
        int minOps = Math.min(ops0, ops1);
        long minDiff = Long.MAX_VALUE;
        
        // Evaluate the minimal range for the optimal pattern(s)
        if (ops0 == minOps) {
            minDiff = Math.min(minDiff, getMinDiff(nums, 0));
        }
        if (ops1 == minOps) {
            minDiff = Math.min(minDiff, getMinDiff(nums, 1));
        }
        
        return new int[]{minOps, (int) minDiff};
    }
    
    private long getMinDiff(int[] nums, int pattern) {
        int n = nums.length;
        // List to hold pairs of [value, original_index]
        // Max size is 2 * n since mismatching parities yield 2 possibilities (+1 or -1)
        long[][] list = new long[n * 2][2];
        int size = 0;
        
        for (int i = 0; i < n; i++) {
            int parity = Math.abs(nums[i] % 2);
            int target = (i + pattern) % 2;
            
            if (parity == target) {
                list[size][0] = (long) nums[i];
                list[size][1] = i;
                size++;
            } else {
                list[size][0] = (long) nums[i] - 1L;
                list[size][1] = i;
                size++;
                list[size][0] = (long) nums[i] + 1L;
                list[size][1] = i;
                size++;
            }
        }
        
        // Sort the pairs based on their numerical values
        Arrays.sort(list, 0, size, (a, b) -> Long.compare(a[0], b[0]));
        
        // Sliding window variables
        int[] count = new int[n];
        int unique = 0;
        int left = 0;
        long minDiff = Long.MAX_VALUE;
        
        for (int right = 0; right < size; right++) {
            int idx = (int) list[right][1];
            
            if (count[idx] == 0) unique++;
            count[idx]++;
            
            // When the window contains at least one valid number from every index
            while (unique == n) {
                long diff = list[right][0] - list[left][0];
                if (diff < minDiff) {
                    minDiff = diff;
                }
                
                // Shrink the window from the left
                int leftIdx = (int) list[left][1];
                count[leftIdx]--;
                if (count[leftIdx] == 0) {
                    unique--;
                }
                left++;
            }
        }
        
        return minDiff;
    }
}