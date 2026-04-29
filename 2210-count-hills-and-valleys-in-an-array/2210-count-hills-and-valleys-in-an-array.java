class Solution {
    public int countHillValley(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(nums[0]);
        for(int i=1;i<n;i++){
            if(nums[i]!=nums[i-1]){
                arr.add(nums[i]);
            }
        }
        int hill=0;
        int valley=0;
        int size=arr.size();
        for(int i=1;i<size-1;i++){
            if(arr.get(i-1)<arr.get(i) && arr.get(i)>arr.get(i+1)){
                hill++;
            }
            if(arr.get(i-1)>arr.get(i) && arr.get(i+1)>arr.get(i)){
                valley++;
            }
        }
        return hill+valley;
    }
}