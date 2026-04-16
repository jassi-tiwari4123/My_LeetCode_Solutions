class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> hm=new HashMap<>();
        Stack<Integer> st=new Stack<>();
        for(int num:nums2){
            while(!st.isEmpty() && st.peek()<num){
                hm.put(st.pop(),num);
            }
            st.push(num);
        }
        while(!st.isEmpty()){
            hm.put(st.pop(),-1);
        }
        int[] res=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            res[i]=hm.get(nums1[i]);
        }
        return res;
    }
}