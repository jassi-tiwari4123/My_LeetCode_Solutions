class Solution {
    public int minLengthAfterRemovals(List<Integer> nums) {
        int n=nums.size();
        int i=0;
        int j=(n+1)/2;
        int pairs=0;
        while(i<j && j<n){
            if(nums.get(i)<nums.get(j)){
               pairs++;
               i++;
               j++;
            }
            else{
                j++;
            }
        }
        return n-2*pairs;
    }
}