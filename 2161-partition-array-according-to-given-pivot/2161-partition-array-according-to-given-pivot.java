class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> a1=new ArrayList<>();
        ArrayList<Integer> a2=new ArrayList<>();
        ArrayList<Integer> mid=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                a1.add(nums[i]);
            }
            else if(nums[i]==pivot){
                mid.add(nums[i]);
            }
            else{
                a2.add(nums[i]);
            }
        }
        int n=a1.size();
        int x=mid.size();
        int m=a2.size();
        for(int i=0;i<n;i++){
            nums[i]=a1.get(i);
        }
        if(x!=0){
            for(int i=n;i<n+x;i++){
                nums[i]=mid.get(i-n);
            }
            n=n+x;
        }
        for(int i=n;i<n+m;i++){
            nums[i]=a2.get(i-n);
        }
        return nums;
    }
}