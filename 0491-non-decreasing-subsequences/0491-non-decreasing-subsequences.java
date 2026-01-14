import java.util.*;

class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), res);
        return res;
    }

    private void backtrack(int[] nums, int start, List<Integer> current, List<List<Integer>> res) {
        if (current.size() >= 2) {
            res.add(new ArrayList<>(current));
        }
        Set<Integer> usedAtThisLevel = new HashSet<>();

        for (int i = start; i < nums.length; i++) {
            if (usedAtThisLevel.contains(nums[i])) continue;
            if (current.isEmpty() || nums[i] >= current.get(current.size() - 1)) {
                
                usedAtThisLevel.add(nums[i]); 
                current.add(nums[i]);       
                backtrack(nums, i + 1, current, res);
                current.remove(current.size() - 1); 
            }
        }
    }
}