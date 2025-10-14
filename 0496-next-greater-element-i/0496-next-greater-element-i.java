class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> nextGreater = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        // Traverse nums2 and compute next greater for each element
        for (int num : nums2) {
            // Pop smaller elements and assign their next greater
            while (!stack.isEmpty() && num > stack.peek()) {
                nextGreater.put(stack.pop(), num);
            }
            stack.push(num);
        }

        // Elements left in stack have no greater element → assign -1
        while (!stack.isEmpty()) {
            nextGreater.put(stack.pop(), -1);
        }

        // Build result for nums1 based on computed map
        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            res[i] = nextGreater.get(nums1[i]);
        }

        return res;
    }
}