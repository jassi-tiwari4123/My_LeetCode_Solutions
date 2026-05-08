class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> r=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            String s=String.valueOf(nums[i]);
            for(int j=0;j<s.length();j++){
                r.add(s.charAt(j)-'0');
            }
        }
        int[] res=new int[r.size()];
        for(int i=0;i<res.length;i++){
            res[i]=r.get(i);
        }
        return res;
    }
}