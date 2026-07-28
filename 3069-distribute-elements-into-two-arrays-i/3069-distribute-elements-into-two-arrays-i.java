class Solution {
    public int[] resultArray(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> ar1=new ArrayList<>();
        ArrayList<Integer> ar2=new ArrayList<>();
        ar1.add(nums[0]);
        ar2.add(nums[1]);
        for(int i=2;i<n;i++){
            if(ar1.get(ar1.size()-1)>ar2.get(ar2.size()-1)){
                ar1.add(nums[i]);
            }
            else{
                ar2.add(nums[i]);
            }
        }
        int n1=ar1.size();
        int n2=ar2.size();
        int k=0;
        for(int i=0;i<n1;i++){
            nums[k++]=ar1.get(i);
        }
        for(int i=0;i<n2;i++){
            nums[k]=ar2.get(i);
            k++;
        }
        return nums;
    }
}